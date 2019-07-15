﻿using System;
using System.Collections.Generic;
using System.Globalization;
using EllipseCommonsClassLibrary.Utilities.Shifts;

namespace EllipseCommonsClassLibrary.Utilities.MyDateTime
{
    public static class Operations
    {
        public static List<Slot> GetSlots(Slot[] shifts, DateTime startEvent, DateTime endEvent)
        {
            if (endEvent < startEvent)
                throw new ArgumentException("La fecha final no puede ser menor a la fecha inicial");

            //to establish the date part of the datetime according to the starttime of the shift day / desplazamiento horario según inicio del día por turno
            startEvent = startEvent.AddTicks(-shifts[0].GetStartDateTime().TimeOfDay.Ticks).Date + startEvent.TimeOfDay;
            endEvent = endEvent.AddTicks(-shifts[0].GetStartDateTime().TimeOfDay.Ticks).Date + endEvent.TimeOfDay;

            var i = 0;
            //To find the starting shift for the event / para encontrar el turno inicial del evento
            var shiftStartLessShiftEnd = shifts[i].GetStartDateTime().TimeOfDay.TotalSeconds <
                                         shifts[i].GetEndDateTime().TimeOfDay.TotalSeconds;
            var eventStartLessShiftStart =
                startEvent.TimeOfDay.TotalSeconds < shifts[i].GetStartDateTime().TimeOfDay.TotalSeconds;
            var eventStartLessShiftEnd =
                startEvent.TimeOfDay.TotalSeconds < shifts[i].GetEndDateTime().TimeOfDay.TotalSeconds;

            while (shiftStartLessShiftEnd &&
                   (eventStartLessShiftStart || !eventStartLessShiftStart && !eventStartLessShiftEnd) ||
                   !shiftStartLessShiftEnd && eventStartLessShiftStart && !eventStartLessShiftEnd
            )
            {
                i++;
                shiftStartLessShiftEnd = shifts[i].GetStartDateTime().TimeOfDay.TotalSeconds <
                                         shifts[i].GetEndDateTime().TimeOfDay.TotalSeconds;
                eventStartLessShiftStart = startEvent.TimeOfDay.TotalSeconds <
                                           shifts[i].GetStartDateTime().TimeOfDay.TotalSeconds;
                eventStartLessShiftEnd =
                    startEvent.TimeOfDay.TotalSeconds < shifts[i].GetEndDateTime().TimeOfDay.TotalSeconds;
            }

            var slotStart = startEvent;
            var slotEnd = slotStart.Date + shifts[i].GetEndDateTime().TimeOfDay;
            slotEnd = slotEnd.AddDays((shifts[i].GetEndDateTime().Date - shifts[i].GetStartDateTime().Date)
                .TotalDays); //adiciona si hay un cambio en el día

            var slotList = new List<Slot>();

            //while (endEvent.Date > slotEnd.Date ||
            //    (endEvent.Date == slotEnd.Date && !(
            //        shifts[i].StartHour.TotalSeconds <= shifts[i].EndHour.TotalSeconds
            //            ? (endEvent.TimeOfDay.TotalSeconds >= shifts[i].StartHour.TotalSeconds && endEvent.TimeOfDay.TotalSeconds < shifts[i].EndHour.TotalSeconds)
            //            : (endEvent.TimeOfDay.TotalSeconds >= shifts[i].StartHour.TotalSeconds || endEvent.TimeOfDay.TotalSeconds < shifts[i].EndHour.TotalSeconds)
            //       )))
            while (endEvent.Date > slotEnd.Date || endEvent.Date == slotEnd.Date &&
                   (slotStart.TimeOfDay.TotalSeconds <= slotEnd.TimeOfDay.TotalSeconds
                       ? endEvent.TimeOfDay.TotalSeconds > slotStart.TimeOfDay.TotalSeconds &&
                         endEvent.TimeOfDay.TotalSeconds > slotEnd.TimeOfDay.TotalSeconds
                       : endEvent.TimeOfDay.TotalSeconds < slotStart.TimeOfDay.TotalSeconds &&
                         endEvent.TimeOfDay.TotalSeconds > slotEnd.TimeOfDay.TotalSeconds
                   ))
            {
                var newSlot = new Slot();
                newSlot.SetDate(slotStart.Date);
                newSlot.SetStartTime(slotStart.TimeOfDay);
                newSlot.SetEndTime(shifts[i].GetEndDateTime().TimeOfDay);
                newSlot.ShiftCode = shifts[i].ShiftCode;
                slotList.Add(newSlot);
                i++;

                if (i >= shifts.Length)
                {
                    i = 0;
                    slotStart = slotStart.Date.AddDays(1);
                }

                slotStart = slotStart.Date + shifts[i].GetStartDateTime().TimeOfDay;
                slotEnd = slotStart.Date + shifts[i].GetEndDateTime().TimeOfDay;
                slotEnd = slotEnd.AddDays((shifts[i].GetEndDateTime().Date - shifts[i].GetStartDateTime().Date)
                    .TotalDays); //adiciona si hay un cambio en el día
            }

            var lastSlot = new Slot();
            lastSlot.SetDate(slotStart);
            lastSlot.SetStartTime(slotStart.TimeOfDay);
            lastSlot.SetEndTime(endEvent.TimeOfDay);
            lastSlot.ShiftCode = shifts[i].ShiftCode;
            slotList.Add(lastSlot);

            return slotList;
        }

        /// <summary>
        ///     Convierte una hora en formato de número (3, 1.6, 36.3) a formato HHMM (03:00, 01:36, 12:18). Si la hora ingresada
        ///     excede el valor de 24 horas, esta es truncada al día.
        /// </summary>
        /// <param name="hourTime">Hora de forma numérica (Ej: 11, 8.4, 3.1, 28.4) </param>
        /// <param name="separator"></param>
        // ReSharper disable once InconsistentNaming
        public static string ConvertDecimalHourToHHMM(string hourTime, string separator = null)
        {
            if (separator == null)
                separator = ":";
            if (string.IsNullOrWhiteSpace(hourTime))
                return "00" + separator + "00";

            var hh = Convert.ToDecimal(hourTime) % 24;
            var mm = hh - Math.Truncate(hh);

            mm = Math.Abs(Math.Truncate(mm * 60));
            hh = Math.Truncate(hh);

            var newHour = Convert.ToInt32(hh).ToString("D2") + separator + Convert.ToInt32(mm).ToString("D2");
            return newHour;
        }

        /// <summary>
        /// </summary>
        /// <param name="hourTime">Hora de forma numérica (Ej: 11, 8.4, 3.1, 28.4) </param>
        /// <param name="separator"></param>
        // ReSharper disable once InconsistentNaming
        public static string ConvertDecimalHourToHHMM(float hourTime, char separator)
        {
            var hh = Convert.ToDecimal(hourTime) % 24;
            var mm = hh - Math.Truncate(hh);

            mm = Math.Abs(Math.Truncate(mm * 60));
            hh = Math.Truncate(hh);

            var newHour = Convert.ToInt32(hh).ToString("D2") + separator + Convert.ToInt32(mm).ToString("D2");
            return newHour;
        }

        /// <summary>
        ///     Formatea un DateTime a String con el format especificado en format
        /// </summary>
        /// <param name="date">DateTime</param>
        /// <param name="format">DateTime.Formats</param>
        /// <param name="dateSeparator">string separator for format (-, /). Default no separator</param>
        /// <returns></returns>
        public static string FormatDateToString(DateTime date, string format, string dateSeparator = "")
        {
            if (format.Equals(Formats.DateYYMMDD))
                return "" + date.Year.ToString("0000").Substring(2) + dateSeparator + date.Month.ToString("00") +
                       dateSeparator + date.Day.ToString("00");
            if (format.Equals(Formats.DateYYDDMM))
                return "" + date.Year.ToString("0000").Substring(2) + dateSeparator + date.Day.ToString("00") +
                       dateSeparator + date.Month.ToString("00");
            if (format.Equals(Formats.DateMMDDYY))
                return "" + date.Month.ToString("00") + dateSeparator + date.Day.ToString("00") + dateSeparator +
                       date.Year.ToString("0000").Substring(2);
            if (format.Equals(Formats.DateDDMMYY))
                return "" + date.Day.ToString("00") + dateSeparator + date.Month.ToString("00") + dateSeparator +
                       date.Year.ToString("0000").Substring(2);

            if (format.Equals(Formats.DateYYYYMMDD))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Month.ToString("00") + dateSeparator +
                       date.Day.ToString("00");
            if (format.Equals(Formats.DateYYYYDDMM))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Day.ToString("00") + dateSeparator +
                       date.Month.ToString("00");
            if (format.Equals(Formats.DateMMDDYYYY))
                return "" + date.Month.ToString("00") + dateSeparator + date.Day.ToString("00") + dateSeparator +
                       date.Year.ToString("0000");
            if (format.Equals(Formats.DateDDMMYYYY))
                return "" + date.Day.ToString("00") + dateSeparator + date.Month.ToString("00") + dateSeparator +
                       date.Year.ToString("0000");

            throw new ArgumentException("Not a valid Date format", "format");
        }

        public static string FormatDateTimeToString(DateTime date, string format, string dateSeparator = null,
            string timeSeparator = null, string splitSeparator = null)
        {
            dateSeparator = dateSeparator ?? "";
            timeSeparator = timeSeparator ?? "";
            splitSeparator = splitSeparator ?? " ";

            if (format.Equals(Formats.DateTimeYYYYMMDD_HHMM))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Month.ToString("00") + dateSeparator +
                       date.Day.ToString("00") + splitSeparator + date.Hour.ToString("00") + timeSeparator +
                       date.Minute.ToString("00");
            if (format.Equals(Formats.DateTimeYYYYMMDD_HHMMSS))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Month.ToString("00") + dateSeparator +
                       date.Day.ToString("00") + splitSeparator + date.Hour.ToString("00") + timeSeparator +
                       date.Minute.ToString("00") + timeSeparator + date.Second.ToString("00");
            if (format.Equals(Formats.DateTimeYYYYDDMM_HHMM))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Day.ToString("00") + dateSeparator +
                       date.Month.ToString("00") + splitSeparator + date.Hour.ToString("00") + timeSeparator +
                       date.Minute.ToString("00");
            if (format.Equals(Formats.DateTimeYYYYDDMM_HHMMSS))
                return "" + date.Year.ToString("0000") + dateSeparator + date.Day.ToString("00") + dateSeparator +
                       date.Month.ToString("00") + splitSeparator + date.Hour.ToString("00") + timeSeparator +
                       date.Minute.ToString("00") + timeSeparator + date.Second.ToString("00");

            throw new ArgumentException("Not a valid DateTime format", "format");
        }

        public static string FormatDateTimeToString(TimeSpan time, string format, string dateSeparator = null,
            string timeSeparator = null, string splitSeparator = null)
        {
            var date = new DateTime();
            date = date.Add(time);

            return FormatDateTimeToString(date, format, dateSeparator, timeSeparator, splitSeparator);
        }

        public static string FormatTimeToString(TimeSpan time, string format, string timeSeparator)
        {
            var date = new DateTime();
            date = date.Add(time);

            if (format.Equals(Formats.TimeHHMMSS))
                return "" + date.Hour.ToString("00") + timeSeparator + date.Minute.ToString("00") + timeSeparator +
                       date.Second.ToString("00");
            if (format.Equals(Formats.TimeHHMM))
                return "" + date.Hour.ToString("00") + timeSeparator + date.Minute.ToString("00");

            throw new ArgumentException("Not a valid Time format", "format");
        }


        /// <summary>
        ///     Valida si la fecha YYYYMMDD ha superado el tiempo máximo permitido en días
        /// </summary>
        /// <param name="date">string: fecha en formato yyyyMMdd</param>
        /// <param name="daysLimit">int: número de días permitidos</param>
        /// <returns></returns>
        public static bool ValidateUserStatus(string date, int daysLimit)
        {
            var datetime = DateTime.ParseExact(date, "yyyyMMdd", CultureInfo.InvariantCulture);
            return DateTime.Today.Subtract(datetime).TotalDays <= daysLimit;
        }
    }
}