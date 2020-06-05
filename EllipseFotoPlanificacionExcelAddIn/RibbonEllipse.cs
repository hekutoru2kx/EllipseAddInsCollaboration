﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Microsoft.Office.Tools.Ribbon;
using EllipseCommonsClassLibrary;
using EllipseCommonsClassLibrary.Classes;
using EllipseCommonsClassLibrary.Connections;
using EllipseCommonsClassLibrary.Constants;
using Excel = Microsoft.Office.Interop.Excel;
using System.Web.Services.Ellipse;
using System.Windows.Forms;
using System.Threading;
using Microsoft.Office.Interop.Excel;
using EllipseJobsClassLibrary;

namespace EllipseFotoPlanificacionExcelAddIn
{
    public partial class RibbonEllipse
    {
        ExcelStyleCells _cells;
        EllipseFunctions _eFunctions = new EllipseFunctions();
        private FormAuthenticate _frmAuth = new FormAuthenticate();
        private Excel.Application _excelApp;

        private const string SheetName01 = "FotoPlanificación";
        private const int TitleRow01 = 9;
        private const int ResultColumn01 = 13;
        private const string TableName01 = "FotoPlannerTable";
        private const string ValidationSheetName = "ValidationSheet";
        private Thread _thread;

        private void RibbonEllipse_Load(object sender, RibbonUIEventArgs e)
        {
            _excelApp = Globals.ThisAddIn.Application;
            var environments = Environments.GetEnvironmentList();
            foreach (var env in environments)
            {
                var item = Factory.CreateRibbonDropDownItem();
                item.Label = env;
                drpEnvironment.Items.Add(item);
            }
        }

        #region Buttons
        private void btnFormat_Click(object sender, RibbonControlEventArgs e)
        {
            FormatSheet();
        }

        private void btnAbout_Click(object sender, RibbonControlEventArgs e)
        {
            new AboutBoxExcelAddIn().ShowDialog();
        }

        private void btnReviewEllipse_Click(object sender, RibbonControlEventArgs e)
        {
            try
            {
                if (_excelApp.ActiveWorkbook.ActiveSheet.Name == SheetName01)
                {
                    //si ya hay un thread corriendo que no se ha detenido
                    if (_thread != null && _thread.IsAlive) return;
                    _frmAuth.StartPosition = FormStartPosition.CenterScreen;
                    _frmAuth.SelectedEnvironment = drpEnvironment.SelectedItem.Label;
                    if (_frmAuth.ShowDialog() != DialogResult.OK) return;
                    _thread = new Thread(() => ReviewEllipse());

                    _thread.SetApartmentState(ApartmentState.STA);
                    _thread.Start();
                }
                else
                    MessageBox.Show(@"La hoja de Excel seleccionada no tiene el formato válido para realizar la acción");
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse.cs:ReviewEllipse()", "\n\rMessage: " + ex.Message + "\n\rSource: " + ex.Source + "\n\rStackTrace: " + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error: " + ex.Message);
            }
        }

        private void btnReviewSigman_Click(object sender, RibbonControlEventArgs e)
        {
            try
            {
                if (_excelApp.ActiveWorkbook.ActiveSheet.Name == SheetName01)
                {
                    //si ya hay un thread corriendo que no se ha detenido
                    if (_thread != null && _thread.IsAlive) return;
                    _thread = new Thread(() => ReviewSigman());

                    _thread.SetApartmentState(ApartmentState.STA);
                    _thread.Start();
                }
                else
                    MessageBox.Show(@"La hoja de Excel seleccionada no tiene el formato válido para realizar la acción");
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse.cs:ReviewSigman()", "\n\rMessage: " + ex.Message + "\n\rSource: " + ex.Source + "\n\rStackTrace: " + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error: " + ex.Message);
            }
        }

        private void btnUpdateSigman_Click(object sender, RibbonControlEventArgs e)
        {
            try
            {
                if (_excelApp.ActiveWorkbook.ActiveSheet.Name == SheetName01)
                {
                    //si ya hay un thread corriendo que no se ha detenido
                    if (_thread != null && _thread.IsAlive) return;
                    _thread = new Thread(() => UpdateSigman());

                    _thread.SetApartmentState(ApartmentState.STA);
                    _thread.Start();
                }
                else
                    MessageBox.Show(@"La hoja de Excel seleccionada no tiene el formato válido para realizar la acción");
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse.cs:UpdateSigman()", "\n\rMessage: " + ex.Message + "\n\rSource: " + ex.Source + "\n\rStackTrace: " + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error: " + ex.Message);
            }
        }

        #endregion

        private void FormatSheet()
        {
            try
            {
                _excelApp = Globals.ThisAddIn.Application;
                _eFunctions.SetDBSettings(drpEnvironment.SelectedItem.Label);
                _excelApp.Workbooks.Add();
                while (_excelApp.ActiveWorkbook.Sheets.Count < 3)
                    _excelApp.ActiveWorkbook.Worksheets.Add();
                if (_cells == null)
                    _cells = new ExcelStyleCells(_excelApp);

                #region CONSTRUYO LA HOJA 1
                var titleRow = TitleRow01;
                var resultColumn = ResultColumn01;
                var tableName = TableName01;
                var sheetName = SheetName01;

                _cells.SetCursorWait();

                _excelApp.ActiveWorkbook.ActiveSheet.Name = sheetName;
                _cells.CreateNewWorksheet(ValidationSheetName);//hoja de validación

                _cells.GetCell("A1").Value = "CERREJÓN";
                _cells.GetCell("A1").Style = _cells.GetStyle(StyleConstants.HeaderDefault);
                _cells.MergeCells("A1", "B2");

                _cells.GetCell("C1").Value = "FOTO PLANIFICACIÓN MANTENIMIENTO - ELLIPSE 8";
                _cells.GetCell("C1").Style = _cells.GetStyle(StyleConstants.HeaderDefault);
                _cells.MergeCells("C1", "J2");

                _cells.GetCell("K1").Value = "OBLIGATORIO";
                _cells.GetCell("K1").Style = _cells.GetStyle(StyleConstants.TitleRequired);
                _cells.GetCell("K2").Value = "OPCIONAL";
                _cells.GetCell("K2").Style = _cells.GetStyle(StyleConstants.TitleOptional);
                _cells.GetCell("K3").Value = "INFORMATIVO";
                //_cells.GetCell("K3").Style = _cells.GetStyle(StyleConstants.TitleInformation);
                //_cells.GetCell("K4").Value = "ACCIÓN A REALIZAR";
                //_cells.GetCell("K4").Style = _cells.GetStyle(StyleConstants.TitleAction);
                //_cells.GetCell("K5").Value = "REQUERIDO ADICIONAL";
                //_cells.GetCell("K5").Style = _cells.GetStyle(StyleConstants.TitleAdditional);


                var workGroupList = Groups.GetWorkGroupList(ManagementArea.Mantenimiento.Key).Select(g => g.Name).ToList(); ;
                var searchEntitiesList = new List<string> { "Work Orders Only", "MST Forecast Only", "Work Orders and MST Forecast" };
                var aditionalJobsList = new List<string> { "Backlog", "Unscheduled", "Backlog and Unscheduled", "Backlog Only", "Unscheduled Only", "Backlog and Unscheduled Only" };
                var searchCriteriaList = SearchFieldCriteriaType.GetSearchFieldCriteriaTypes().Select(g => g.Value).ToList();

                _cells.GetCell("A3").Value = SearchFieldCriteriaType.WorkGroup.Value;
                _cells.GetCell("A3").AddComment("--ÁREA GERENCIAL/SUPERINTENDENCIA--\n" +
                    "INST: IMIS, MINA\n" +
                    "" + ManagementArea.ManejoDeCarbon.Key + ": " + QuarterMasters.Ferrocarril.Key + ", " + QuarterMasters.PuertoBolivar.Key + ", " + QuarterMasters.PlantasDeCarbon.Key + "\n" +
                    "" + ManagementArea.Mantenimiento.Key + ": MINA\n" +
                    "" + ManagementArea.SoporteOperacion.Key + ": ENERGIA, LIVIANOS, MEDIANOS, GRUAS, ENERGIA");
                _cells.GetCell("A3").Comment.Shape.TextFrame.AutoSize = true;
                _cells.GetCell("A4").Value = "Tipo de Búsqueda";
                _cells.GetCell("B4").Value = searchEntitiesList.ToArray()[2];
                _cells.GetCell("A5").Value = "Trabajos Adicionales";
                


                _cells.SetValidationList(_cells.GetCell("A3"), searchCriteriaList, ValidationSheetName, 2);
                _cells.SetValidationList(_cells.GetCell("B3"), workGroupList, ValidationSheetName, 3, false);
                _cells.SetValidationList(_cells.GetCell("B4"), searchEntitiesList, ValidationSheetName, 4, false);
                _cells.SetValidationList(_cells.GetCell("B5"), aditionalJobsList, ValidationSheetName, 5, false);

                _cells.GetRange("A3", "A5").Style = _cells.GetStyle(StyleConstants.Option);
                _cells.GetRange("B3", "B5").Style = _cells.GetStyle(StyleConstants.Select);

                _cells.GetCell("C3").Value = "FECHA";
                _cells.GetCell("D3").Value = EllipseJobsClassLibrary.SearchDateCriteriaType.PlannedStart.Value;
                _cells.GetCell("C4").Value = "Desde";
                _cells.GetCell("D4").Value = string.Format("{0:0000}", DateTime.Now.Year) + string.Format("{0:00}", DateTime.Now.Month) + "01";
                _cells.GetCell("D4").AddComment("YYYYMMDD");
                _cells.GetCell("C5").Value = "Hasta";
                _cells.GetCell("D5").Value = string.Format("{0:0000}", DateTime.Now.Year) + string.Format("{0:00}", DateTime.Now.Month) + string.Format("{0:00}", DateTime.DaysInMonth(DateTime.Now.Year, DateTime.Now.Month));
                _cells.GetCell("D5").AddComment("YYYYMMDD");
                _cells.GetRange("C3", "C5").Style = _cells.GetStyle(StyleConstants.Option);
                _cells.GetRange("D3", "D5").Style = _cells.GetStyle(StyleConstants.Select);

                _cells.GetRange(1, titleRow, resultColumn, titleRow).Style = StyleConstants.TitleOptional;

                //GENERAL
                //_cells.GetCell(11, titleRow).AddComment("yyyyMMdd");
                _cells.GetCell(1, titleRow).Value = "Grupo/UAS";
                _cells.GetCell(2, titleRow).Value = "Equipo";
                _cells.GetCell(3, titleRow).Value = "Componente";
                _cells.GetCell(4, titleRow).Value = "Modificador";
                _cells.GetCell(5, titleRow).Value = "Número OT";
                _cells.GetCell(6, titleRow).Value = "MST";
                _cells.GetCell(7, titleRow).Value = "Periodo";
                _cells.GetCell(8, titleRow).Value = "Fecha Creación";
                _cells.GetCell(9, titleRow).Value = "Fecha Plan";
                _cells.GetCell(10, titleRow).Value = "Siguiente Fecha";
                _cells.GetCell(11, titleRow).Value = "Última Fecha Realizada";
                _cells.GetCell(12, titleRow).Value = "Horas Duración";
                _cells.GetCell(13, titleRow).Value = "Horas Labor";

                //public string originatorUser;
                //public string originatorPosition;
                //public string originatorItemDate;
                //public string lastModUser;
                //public string lastModPosition;
                //public string lastModItemDate;
                //public string itemStatus;

                _cells.GetCell(resultColumn, titleRow).Value = "RESULTADO";
                _cells.GetCell(resultColumn, titleRow).Style = StyleConstants.TitleResult;
                _cells.GetRange(1, titleRow + 1, resultColumn, titleRow + 1).NumberFormat = NumberFormatConstants.Text;
                _cells.FormatAsTable(_cells.GetRange(1, titleRow, resultColumn, titleRow + 1), tableName);
                _excelApp.ActiveWorkbook.ActiveSheet.Cells.Columns.AutoFit();
                #endregion

                _excelApp.ActiveWorkbook.Sheets[1].Select(Type.Missing);
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse:FormatSheet()", "\n\rMessage:" + ex.Message + "\n\rSource:" + ex.Source + "\n\rStackTrace:" + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error al intentar crear el encabezado de la hoja. " + ex.Message);
            }
            finally
            {
                if (_cells != null) _cells.SetCursorDefault();
            }
        }

        private void ReviewEllipse()
        {
            if (_cells == null)
                _cells = new ExcelStyleCells(_excelApp);
            _cells.SetCursorWait();

            _cells.ClearTableRange(TableName01);

            var selectedEnvironment = drpEnvironment.SelectedItem.Label;

            var urlService = _eFunctions.GetServicesUrl(selectedEnvironment);
            //var urlServicePost = _eFunctions.GetServicesUrl(selectedEnvironment, ServiceType.PostService);
            //_eFunctions.SetPostService(_frmAuth.EllipseUser, _frmAuth.EllipsePswd, _frmAuth.EllipsePost, _frmAuth.EllipseDsct, urlServicePost);
            //_eFunctions.SetDBSettings(selectedEnvironment);

            

            ClientConversation.authenticate(_frmAuth.EllipseUser, _frmAuth.EllipsePswd);

            #region searchParams
            var workGroupCriteriaKeyText = _cells.GetEmptyIfNull(_cells.GetCell("A3").Value);
            var workGroupCriteriaValue = _cells.GetEmptyIfNull(_cells.GetCell("B3").Value);
            var searchEntities = "" + _cells.GetCell("B4").Value;
            var additionalJobs = "" + _cells.GetCell("B5").Value;
            var dateType = "" + _cells.GetCell("D3").Value;
            var startDate = "" + _cells.GetCell("D4").Value;
            var finishDate = "" + _cells.GetCell("D5").Value;
            var searchCriteriaList = SearchFieldCriteriaType.GetSearchFieldCriteriaTypes();
            var workGroupCriteriaKey = searchCriteriaList.FirstOrDefault(v => v.Value.Equals(workGroupCriteriaKeyText)).Key;

            
            
            #endregion
            try
            {
                List<PlannerItem> ellipseJobs = PlannerActions.FetchEllipsePlannerItems(urlService, _frmAuth.EllipseDsct, _frmAuth.EllipsePost, startDate, finishDate, workGroupCriteriaKey, workGroupCriteriaValue, searchEntities, additionalJobs);
                var i = TitleRow01 + 1;
                foreach (var item in ellipseJobs)
                {
                    try
                    {
                        //Para resetear el estilo
                        _cells.GetRange(1, i, ResultColumn01, i).Style = StyleConstants.Normal;
                        //GENERAL
                        _cells.GetCell(01, i).Value = "" + item.WorkGroup;
                        _cells.GetCell(02, i).Value = "" + item.EquipNo;
                        /*
                        _cells.GetCell(03, i).Value = "" + item.CompCode;
                        _cells.GetCell(04, i).Value = "" + item.CompModCode;
                        _cells.GetCell(05, i).Value = "" + item.WorkOrder;
                        _cells.GetCell(06, i).Value = "" + item.MaintSchedTask;
                        _cells.GetCell(07, i).Value = "" + item.MonitoringPeriod;
                        _cells.GetCell(08, i).Value = "" + item.CreationDate;
                        _cells.GetCell(09, i).Value = "" + item.PlanDate;
                        _cells.GetCell(10, i).Value = "" + item.NextSchedDate;
                        _cells.GetCell(11, i).Value = "" + item.LastPerfDate;
                        _cells.GetCell(12, i).Value = "" + item.DurationHours;
                        _cells.GetCell(13, i).Value = "" + item.LaboutHors;
                        */
                    }
                    catch (Exception ex)
                    {
                        _cells.GetCell(1, i).Style = StyleConstants.Error;
                        _cells.GetCell(ResultColumn01, i).Value = "ERROR: " + ex.Message;
                        Debugger.LogError("RibbonEllipse.cs:ReviewSigman()", ex.Message);
                    }
                    finally
                    {
                        _cells.GetCell(2, i).Select();
                        i++;
                    }
                }
                _excelApp.ActiveWorkbook.ActiveSheet.Cells.Columns.AutoFit();
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse.cs:UpdateSigman()", "\n\rMessage: " + ex.Message + "\n\rSource: " + ex.Source + "\n\rStackTrace: " + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error: " + ex.Message);
            }
            finally
            {
                if (_cells != null) _cells.SetCursorDefault();
                _eFunctions.CloseConnection();
            }
        }

        private void ReviewSigman()
        {
            if (_cells == null)
                _cells = new ExcelStyleCells(_excelApp);
            _cells.SetCursorWait();

            _cells.ClearTableRange(TableName01);

            var selectedEnvironment = drpEnvironment.SelectedItem.Label;

            if (selectedEnvironment.Equals(Environments.EllipseProductivo) || selectedEnvironment.Equals(Environments.EllipseContingencia))
                _eFunctions.SetDBSettings(Environments.SigmanProductivo);
            else if (selectedEnvironment.Equals(Environments.EllipseTest) || selectedEnvironment.Equals(Environments.EllipseDesarrollo))
                _eFunctions.SetDBSettings(Environments.SigmanProductivo);
            else
                _eFunctions.SetDBSettings(selectedEnvironment);

            #region searchParams
            var district = "ICOR";
            var monitoringPeriod = "" + _cells.GetCell("D3").Value;
            var workGroup = "" + _cells.GetCell("B3").Value;
            #endregion
            try
            {
                var itemList = PlannerActions.FetchSigmanPhotoItems(_eFunctions, district, monitoringPeriod, workGroup);
                var i = TitleRow01 + 1;
                foreach (var item in itemList)
                {
                    try
                    {
                        //Para resetear el estilo
                        _cells.GetRange(1, i, ResultColumn01, i).Style = StyleConstants.Normal;
                        //GENERAL
                        _cells.GetCell(01, i).Value = "" + item.WorkGroup;
                        _cells.GetCell(02, i).Value = "" + item.EquipNo;
                        _cells.GetCell(03, i).Value = "" + item.CompCode;
                        _cells.GetCell(04, i).Value = "" + item.CompModCode;
                        _cells.GetCell(05, i).Value = "" + item.WorkOrder;
                        _cells.GetCell(06, i).Value = "" + item.MaintSchedTask;
                        _cells.GetCell(07, i).Value = "" + item.MonitoringPeriod;
                        _cells.GetCell(08, i).Value = "" + item.CreationDate;
                        _cells.GetCell(09, i).Value = "" + item.PlanDate;
                        _cells.GetCell(10, i).Value = "" + item.NextSchedDate;
                        _cells.GetCell(11, i).Value = "" + item.LastPerfDate;
                        _cells.GetCell(12, i).Value = "" + item.DurationHours;
                        _cells.GetCell(13, i).Value = "" + item.LaboutHors;
                    }
                    catch (Exception ex)
                    {
                        _cells.GetCell(1, i).Style = StyleConstants.Error;
                        _cells.GetCell(ResultColumn01, i).Value = "ERROR: " + ex.Message;
                        Debugger.LogError("RibbonEllipse.cs:ReviewSigman()", ex.Message);
                    }
                    finally
                    {
                        _cells.GetCell(2, i).Select();
                        i++;
                    }
                }
                _excelApp.ActiveWorkbook.ActiveSheet.Cells.Columns.AutoFit();
            }
            catch (Exception ex)
            {
                Debugger.LogError("RibbonEllipse.cs:UpdateSigman()", "\n\rMessage: " + ex.Message + "\n\rSource: " + ex.Source + "\n\rStackTrace: " + ex.StackTrace);
                MessageBox.Show(@"Se ha producido un error: " + ex.Message);
            }
            finally
            {
                if (_cells != null) _cells.SetCursorDefault();
                _eFunctions.CloseConnection();
            }
        }

        private void UpdateSigman()
        {

        }

        private void btnStopThread_Click(object sender, RibbonControlEventArgs e)
        {
            try
            {
                if (_thread != null && _thread.IsAlive)
                    _thread.Abort();
                if (_cells != null) _cells.SetCursorDefault();
            }
            catch (ThreadAbortException ex)
            {
                MessageBox.Show(@"Se ha detenido el proceso. " + ex.Message);
            }
        }
    }
}
