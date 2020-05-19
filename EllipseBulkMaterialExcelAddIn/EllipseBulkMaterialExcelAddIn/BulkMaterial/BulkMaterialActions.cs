﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Xml.Linq;
using System.Xml;
using BMUService = EllipseBulkMaterialExcelAddIn.BulkMaterialUsageSheetService;
using BMUItemService = EllipseBulkMaterialExcelAddIn.BulkMaterialUsageSheetItemService;
using EllipseCommonsClassLibrary;
using System.Web.Services.Ellipse.Post;

namespace EllipseBulkMaterialExcelAddIn
{
    public static class BulkMaterialActions
    {
        public static BMUService.BulkMaterialUsageSheetServiceResult ApplyHeader(BMUService.BulkMaterialUsageSheetService bmService, BMUService.OperationContext opContext, BMUService.BulkMaterialUsageSheetDTO requestSheet)
        {
            var reply = bmService.apply(opContext, requestSheet);
            var errorMessage = "";
            if (reply.errors.Length > 0)
            {
                foreach (var t in reply.errors)
                    errorMessage += " - " + t.messageText;

                if (!string.IsNullOrWhiteSpace(errorMessage))
                    throw new Exception(errorMessage);
            }

            return reply;
        }

        public static EllipseCommonsClassLibrary.Classes.ReplyMessage ApplyHeaderPost(EllipseFunctions eFunctions, BMUService.BulkMaterialUsageSheetDTO requestSheet)
        {
            var reply = new EllipseCommonsClassLibrary.Classes.ReplyMessage();

            eFunctions.InitiatePostConnection();
            var requestXml = "";
            requestXml = requestXml + "<interaction>";
            requestXml = requestXml + "	<actions>";
            requestXml = requestXml + "		<action>";
            requestXml = requestXml + "			<name>service</name>";
            requestXml = requestXml + "			<data>";
            requestXml = requestXml + "				<name>com.mincom.ellipse.service.m3301.bulkmaterialusagesheet.BulkMaterialUsageSheetService</name>";
            requestXml = requestXml + "				<operation>apply</operation>";
            requestXml = requestXml + "				<className>mfui.actions.flow::FlowServiceAction</className>";
            requestXml = requestXml + "				<returnWarnings>false</returnWarnings>";
            requestXml = requestXml + "				<dto>";
            requestXml = requestXml + "					<bulkMaterialUsageSheetId>" + requestSheet.bulkMaterialUsageSheetId + "</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "				</dto>";
            requestXml = requestXml + "				<requiredAttributes>";
            requestXml = requestXml + "					<bulkMaterialUsageSheetId>true</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "					<status>true</status>";
            requestXml = requestXml + "					<districtCode>true</districtCode>";
            requestXml = requestXml + "					<warehouseId>true</warehouseId>";
            requestXml = requestXml + "					<supplyCustomerAccountId>true</supplyCustomerAccountId>";
            requestXml = requestXml + "					<employeeId>true</employeeId>";
            requestXml = requestXml + "					<supplierNumber>true</supplierNumber>";
            requestXml = requestXml + "					<defaultBulkMaterialTypeId>true</defaultBulkMaterialTypeId>";
            requestXml = requestXml + "					<recordedBy>true</recordedBy>";
            requestXml = requestXml + "					<defaultUsageDate>true</defaultUsageDate>";
            requestXml = requestXml + "					<defaultUsageTime>true</defaultUsageTime>";
            requestXml = requestXml + "					<defaultBatchLotNumber>true</defaultBatchLotNumber>";
            requestXml = requestXml + "					<defaultUseByDate>true</defaultUseByDate>";
            requestXml = requestXml + "					<defaultAccountCode>true</defaultAccountCode>";
            requestXml = requestXml + "					<defaultSubLedger>true</defaultSubLedger>";
            requestXml = requestXml + "					<defaultSupplierReference>true</defaultSupplierReference>";
            requestXml = requestXml + "				</requiredAttributes>";
            requestXml = requestXml + "				<maxInstances>1</maxInstances>";
            requestXml = requestXml + "			</data>";
            requestXml = requestXml + "			<id>" + Util.GetNewOperationId() + "</id>";
            requestXml = requestXml + "		</action>";
            requestXml = requestXml + "	</actions>";
            requestXml = requestXml + "	<chains/>";
            requestXml = requestXml + "	<connectionId>" + eFunctions.PostServiceProxy.ConnectionId + "</connectionId>";
            requestXml = requestXml + "	<application>mse310</application>";
            requestXml = requestXml + "	<applicationPage>read</applicationPage>";
            requestXml = requestXml + "</interaction>";
            requestXml = requestXml.Replace("&", "&amp;");

            var responseDto = eFunctions.ExecutePostRequest(requestXml);

            if (responseDto.GotErrorMessages())
            {
                var errorMessage = responseDto.Errors.Aggregate("", (current, msg) => current + (msg.Field + " " + msg.Text));
                if (!errorMessage.Equals(""))
                    throw new Exception(errorMessage);
            }
            if (responseDto.GotWarningMessages())
            {
                var warningList = new List<string>();
                foreach (var war in responseDto.Warnings)
                {
                    warningList.Add(war.Field + " " + war.Text);
                }
                if (warningList != null && warningList.Count() > 0)
                    reply.Warnings = warningList.ToArray();
            }
            return reply;
        }

        public static BMUService.BulkMaterialUsageSheetServiceResult UnApplyHeader(BMUService.BulkMaterialUsageSheetService bmService, BMUService.OperationContext opContext, BMUService.BulkMaterialUsageSheetDTO requestSheet, bool ignoreErrors = false)
        {
            var reply = bmService.unapply(opContext, requestSheet);
            var errorMessage = "";
            if (reply.errors.Length > 0)
            {
                foreach (var t in reply.errors)
                    errorMessage += " - " + t.messageText;

                if (!string.IsNullOrWhiteSpace(errorMessage) && !ignoreErrors)
                    throw new Exception(errorMessage);
            }

            return reply;
        }

        public static BMUService.BulkMaterialUsageSheetServiceResult DeleteHeader(BMUService.BulkMaterialUsageSheetService bmService, BMUService.OperationContext opContext, BMUService.BulkMaterialUsageSheetDTO requestSheet)
        {
            var reply = bmService.delete(opContext, requestSheet);
            var errorMessage = "";
            if (reply.errors.Length > 0)
            {
                foreach (var t in reply.errors)
                    errorMessage += " - " + t.messageText;

                if (!string.IsNullOrWhiteSpace(errorMessage))
                    throw new Exception(errorMessage);
            }

            return reply;
        }

        public static BMUService.BulkMaterialUsageSheetServiceResult CreateHeader(BMUService.BulkMaterialUsageSheetService bmService, BMUService.OperationContext opContext, BMUService.BulkMaterialUsageSheetDTO requestSheet)
        {
            var reply = bmService.create(opContext, requestSheet);

            var errorMessage = "";
            if (reply.errors.Length > 0)
            {
                foreach (var t in reply.errors)
                    errorMessage += " - " + t.messageText;

                if (!string.IsNullOrWhiteSpace(errorMessage))
                    throw new Exception(errorMessage);
            }

            return reply;
        }

        public static EllipseCommonsClassLibrary.Classes.ReplyMessage CreateHeaderPost(EllipseFunctions eFunctions, BMUService.BulkMaterialUsageSheetDTO requestSheet)
        {
            var reply = new EllipseCommonsClassLibrary.Classes.ReplyMessage();

            eFunctions.InitiatePostConnection();
            var requestXml = "";
            requestXml = requestXml + "<interaction>";
            requestXml = requestXml + "	<actions>";
            requestXml = requestXml + "		<action>";
            requestXml = requestXml + "			<name>service</name>";
            requestXml = requestXml + "			<data>";
            requestXml = requestXml + "				<name>com.mincom.ellipse.service.m3301.bulkmaterialusagesheet.BulkMaterialUsageSheetService</name>";
            requestXml = requestXml + "				<operation>create</operation>";
            requestXml = requestXml + "				<className>mfui.actions.detail::CreateAction</className>";
            requestXml = requestXml + "				<returnWarnings>false</returnWarnings>";
            requestXml = requestXml + "				<dto>";
            requestXml = requestXml + "					<bulkMaterialUsageSheetId>" + requestSheet.bulkMaterialUsageSheetId + "</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "					<status/>";
            requestXml = requestXml + "					<districtCode>" + requestSheet.districtCode + "</districtCode>";
            requestXml = requestXml + "					<warehouseId>" + requestSheet.warehouseId + "</warehouseId>";
            requestXml = requestXml + "					<supplyCustomerAccountId/>";
            requestXml = requestXml + "					<employeeId/>";
            requestXml = requestXml + "					<supplierNumber/>";
            requestXml = requestXml + "					<defaultBulkMaterialTypeId/>";
            requestXml = requestXml + "					<recordedBy/>";
            requestXml = requestXml + "					<defaultUsageDate>" + requestSheet.defaultUsageDate + "</defaultUsageDate>";
            requestXml = requestXml + "					<defaultUsageTime/>";
            requestXml = requestXml + "					<defaultBatchLotNumber/>";
            requestXml = requestXml + "					<defaultUseByDate/>";
            requestXml = requestXml + "					<defaultAccountCode>" + requestSheet.defaultAccountCode + "</defaultAccountCode>";
            requestXml = requestXml + "					<defaultSubLedger/>";
            requestXml = requestXml + "					<defaultSupplierReference/>";
            requestXml = requestXml + "				</dto>";
            requestXml = requestXml + "				<requiredAttributes>";
            requestXml = requestXml + "					<bulkMaterialUsageSheetId>true</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "					<status>true</status>";
            requestXml = requestXml + "					<districtCode>true</districtCode>";
            requestXml = requestXml + "					<warehouseId>true</warehouseId>";
            requestXml = requestXml + "					<supplyCustomerAccountId>true</supplyCustomerAccountId>";
            requestXml = requestXml + "					<employeeId>true</employeeId>";
            requestXml = requestXml + "					<supplierNumber>true</supplierNumber>";
            requestXml = requestXml + "					<defaultBulkMaterialTypeId>true</defaultBulkMaterialTypeId>";
            requestXml = requestXml + "					<recordedBy>true</recordedBy>";
            requestXml = requestXml + "					<defaultUsageDate>true</defaultUsageDate>";
            requestXml = requestXml + "					<defaultUsageTime>true</defaultUsageTime>";
            requestXml = requestXml + "					<defaultBatchLotNumber>true</defaultBatchLotNumber>";
            requestXml = requestXml + "					<defaultUseByDate>true</defaultUseByDate>";
            requestXml = requestXml + "					<defaultAccountCode>true</defaultAccountCode>";
            requestXml = requestXml + "					<defaultSubLedger>true</defaultSubLedger>";
            requestXml = requestXml + "					<defaultSupplierReference>true</defaultSupplierReference>";
            requestXml = requestXml + "				</requiredAttributes>";
            requestXml = requestXml + "			</data>";
            requestXml = requestXml + "			<id>" + Util.GetNewOperationId() + "</id>";
            requestXml = requestXml + "		</action>";
            requestXml = requestXml + "	</actions>";
            requestXml = requestXml + "	<chains/>";
            requestXml = requestXml + "	<connectionId>" + eFunctions.PostServiceProxy.ConnectionId + "</connectionId>";
            requestXml = requestXml + "	<application>mse310</application>";
            requestXml = requestXml + "	<applicationPage>create</applicationPage>";
            requestXml = requestXml + "	<transaction>true</transaction>";
            requestXml = requestXml + "</interaction>";
            requestXml = requestXml.Replace("&", "&amp;");
            
            var responseDto = eFunctions.ExecutePostRequest(requestXml);

            if (!responseDto.GotErrorMessages())
            {
                //asigno id
                var xElement = XDocument.Parse(responseDto.ResponseString).Root;
                if (xElement == null) return null;

                reply.Message = xElement.Descendants("bulkMaterialUsageSheetId").Single().Value;
            }

            if (responseDto.GotErrorMessages())
            {
                var errorList = new List<string>();
                foreach (var err in responseDto.Errors)
                {
                    errorList.Add(err.Field + " " + err.Text);
                }
                if (errorList != null && errorList.Count() > 0)
                    reply.Errors = errorList.ToArray();
            }
            if (responseDto.GotWarningMessages())
            {
                var warningList = new List<string>();
                foreach (var war in responseDto.Warnings)
                {
                    warningList.Add(war.Field + " " + war.Text);
                }
                if (warningList != null && warningList.Count() > 0)
                    reply.Warnings = warningList.ToArray();
            }
            return reply;
        }

        public static BMUItemService.BulkMaterialUsageSheetItemServiceResult AddItemToHeader(EllipseFunctions eFunctions, BMUItemService.BulkMaterialUsageSheetItemService bmItemService, BMUItemService.OperationContext opContext, BMUItemService.BulkMaterialUsageSheetItemDTO requestItem)
        {
            var profile = GetItemFuelCapacity(eFunctions, requestItem.equipmentReference, requestItem.bulkMaterialTypeId);

            if (!string.IsNullOrWhiteSpace(profile.Error))
                throw new Exception(profile.Error);
            if (requestItem.bulkMaterialTypeId == profile.FuelType && requestItem.quantity > profile.Capacity)
                throw new Exception("El valor ingresado supera la capacidad del Equipo!");

            var reply = bmItemService.create(opContext, requestItem);
            var errorMessage = "";

            if (reply.errors.Length > 0)
            {
                foreach (var t in reply.errors)
                    errorMessage += " - " + t.messageText;

                if (!string.IsNullOrWhiteSpace(errorMessage))
                    throw new Exception("ERROR" + errorMessage);
            }

            return reply;
        }

        public static EllipseCommonsClassLibrary.Classes.ReplyMessage AddItemToHeaderPost(EllipseFunctions eFunctions, BMUItemService.BulkMaterialUsageSheetItemDTO requestItem, int itemIndex)
        {
            var reply = new EllipseCommonsClassLibrary.Classes.ReplyMessage();
            var profile = GetItemFuelCapacity(eFunctions, requestItem.equipmentReference, requestItem.bulkMaterialTypeId);

            if (!string.IsNullOrWhiteSpace(profile.Error))
                throw new Exception(profile.Error);
            if (requestItem.bulkMaterialTypeId == profile.FuelType && requestItem.quantity > profile.Capacity)
                throw new Exception("El valor ingresado supera la capacidad del Equipo!");

            eFunctions.InitiatePostConnection();
            var requestXml = "";
            requestXml = requestXml + "<interaction>";
            requestXml = requestXml + "	<actions>";
            requestXml = requestXml + "		<action>";
            requestXml = requestXml + "			<name>service</name>";
            requestXml = requestXml + "			<data>";
            requestXml = requestXml + "				<name>com.mincom.ellipse.service.m3301.bulkmaterialusagesheetitem.BulkMaterialUsageSheetItemService</name>";
            requestXml = requestXml + "				<operation>create</operation>";
            //requestXml = requestXml + "				<operation>multipleCreate</operation>";
            requestXml = requestXml + "				<className>mfui.actions.grid::UpdatableGridAction</className>";
            requestXml = requestXml + "				<returnWarnings>false</returnWarnings>";
            requestXml = requestXml + "				<dto>";
            //requestXml = requestXml + "					<dto created=\"true\" uuid=\"" + Util.GetNewOperationId() + " rnum=\"" + (itemIndex+1).ToString().PadLeft(6, '0')+ "\"> ";
            requestXml = requestXml + "						<bulkMaterialUsageSheetId>" + requestItem.bulkMaterialUsageSheetId + "</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "						<equipmentReference>" + requestItem.equipmentReference + "</equipmentReference>";
            requestXml = requestXml + "						<bulkMaterialTypeId>" + requestItem.bulkMaterialTypeId + "</bulkMaterialTypeId>";
            requestXml = requestXml + "						<quantity displayMask=\"#########.##\">" + requestItem.quantity + "</quantity>";
            requestXml = requestXml + "						<unitPrice/>";
            requestXml = requestXml + "						<meterReading>" + requestItem.meterReading + "</meterReading>";
            requestXml = requestXml + "						<operationStatisticType>" + requestItem.operationStatisticType + "</operationStatisticType>";
            requestXml = requestXml + "						<componentCode>" + requestItem.componentCode + "</componentCode>";
            requestXml = requestXml + "						<modifier>" + requestItem.modifier + "</modifier>";
            requestXml = requestXml + "						<conditionMonitoringAction>" + requestItem.conditionMonitoringAction + "</conditionMonitoringAction>";
            requestXml = requestXml + "						<usageDate>" + requestItem.usageDate + "</usageDate>";
            requestXml = requestXml + "						<usageTime>" + requestItem.usageTime + "</usageTime>";
            requestXml = requestXml + "						<binCode/>";
            requestXml = requestXml + "						<inventoryCategory/>";
            requestXml = requestXml + "						<conditionCode/>";
            requestXml = requestXml + "						<batchLotNumber/>";
            requestXml = requestXml + "						<useByDate/>";
            requestXml = requestXml + "						<accountCode/>";
            requestXml = requestXml + "						<subLedger/>";
            requestXml = requestXml + "						<supplierReference/>";
            //requestXml = requestXml + "					</dto>";
            requestXml = requestXml + "				</dto>";
            requestXml = requestXml + "				<requiredAttributes>";
            requestXml = requestXml + "					<bulkMaterialUsageSheetId>true</bulkMaterialUsageSheetId>";
            requestXml = requestXml + "					<status>true</status>";
            requestXml = requestXml + "					<districtCode>true</districtCode>";
            requestXml = requestXml + "					<warehouseId>true</warehouseId>";
            requestXml = requestXml + "					<supplyCustomerAccountId>true</supplyCustomerAccountId>";
            requestXml = requestXml + "					<employeeId>true</employeeId>";
            requestXml = requestXml + "					<supplierNumber>true</supplierNumber>";
            requestXml = requestXml + "					<defaultBulkMaterialTypeId>true</defaultBulkMaterialTypeId>";
            requestXml = requestXml + "					<recordedBy>true</recordedBy>";
            requestXml = requestXml + "					<defaultUsageDate>true</defaultUsageDate>";
            requestXml = requestXml + "					<defaultUsageTime>true</defaultUsageTime>";
            requestXml = requestXml + "					<defaultBatchLotNumber>true</defaultBatchLotNumber>";
            requestXml = requestXml + "					<defaultUseByDate>true</defaultUseByDate>";
            requestXml = requestXml + "					<defaultAccountCode>true</defaultAccountCode>";
            requestXml = requestXml + "					<defaultSubLedger>true</defaultSubLedger>";
            requestXml = requestXml + "					<defaultSupplierReference>true</defaultSupplierReference>";
            requestXml = requestXml + "				</requiredAttributes>";
            requestXml = requestXml + "			</data>";
            requestXml = requestXml + "			<id>" + Util.GetNewOperationId() + "</id>";
            requestXml = requestXml + "		</action>";
            requestXml = requestXml + "	</actions>";
            requestXml = requestXml + "	<chains/>";
            requestXml = requestXml + "	<connectionId>" + eFunctions.PostServiceProxy.ConnectionId + "</connectionId>";
            requestXml = requestXml + "	<application>mse310</application>";
            requestXml = requestXml + "	<applicationPage>read</applicationPage>";
            requestXml = requestXml + "	<transaction>true</transaction>";
            requestXml = requestXml + "</interaction>";
            requestXml = requestXml.Replace("&", "&amp;");
            var responseDto = eFunctions.ExecutePostRequest(requestXml);

            if (responseDto.GotErrorMessages())
            {
                var errorList = new List<string>();
                foreach (var err in responseDto.Errors)
                {
                    errorList.Add(err.Field + " " + err.Text);
                }
                if (errorList != null && errorList.Count() > 0)
                    reply.Errors = errorList.ToArray();
            }
            if (responseDto.GotWarningMessages())
            {
                var warningList = new List<string>();
                foreach (var war in responseDto.Warnings)
                {
                    warningList.Add(war.Field + " " + war.Text);
                }
                if (warningList != null && warningList.Count() > 0)
                    reply.Warnings = warningList.ToArray();
            }
            return reply;
        }

        public static Profile GetItemFuelCapacity(EllipseFunctions eFunctions, string equipNo, string fuelType)
        {
            var profile = new Profile();

            if (string.IsNullOrEmpty(equipNo))
                profile.Error = "Se requiere un número de equipo válido para determinar su capacidad";

            var sqlQuery = Queries.GetFuelCapacity(equipNo, eFunctions.dbReference, eFunctions.dbLink);
            var drEquipCapacity = eFunctions.GetQueryResult(sqlQuery);

            if (!drEquipCapacity.Read())
                profile.Error = "No se ha encontrado un perfil válido para el equipo proporcionado";

            if (!drEquipCapacity.IsClosed && drEquipCapacity.HasRows)
            {
                profile.Equipo = drEquipCapacity["EQUIP_NO"].ToString();
                profile.Egi = drEquipCapacity["EQUIP_GRP_ID"].ToString();
                profile.FuelType = drEquipCapacity["FUEL_OIL_TYPE"].ToString();
                profile.Capacity = Convert.ToDecimal(drEquipCapacity["FUEL_CAPACITY"].ToString());
                return profile;
            }
            else
            {
                profile.Error = "No existe un perfil estadístico de operación para el equipo";
                return profile;
            }
        }

        public static string GetBulkAccountCode(EllipseFunctions eFunctions, string equipNo, string materialTypeId)
        {
            try
            {
                if (string.IsNullOrEmpty(equipNo)) return "";

                var sqlQuery = Queries.GetBulkAccountCode(equipNo, eFunctions.dbReference, eFunctions.dbLink);
                var drQuery = eFunctions.GetQueryResult(sqlQuery);

                if (!drQuery.Read()) return "";

                if (!drQuery.IsClosed && drQuery.HasRows)
                {
                    var equipClass = drQuery["EQUIP_CLASS"];
                    var bulkAccount = drQuery["BULK_ACCOUNT"];
                    var accountCode = drQuery["ACCOUNT_CODE"];

                    //Es de mantenimiento 19 - MT
                    if(equipClass.Equals("19"))
                    {
                        if (materialTypeId.Equals("ACPM"))
                            return drQuery["BULK_ACCOUNT"].ToString();
                        else if (materialTypeId.Equals("B2"))
                            return drQuery["BULK_ACCOUNT"].ToString();
                        else if (materialTypeId.Equals("B5"))
                            return drQuery["BULK_ACCOUNT"].ToString();
                        else if (materialTypeId.Equals("X15W40"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("SAE10"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("SAE30"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("SAE40"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("TO460"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("TO410"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("TO430"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else if (materialTypeId.Equals("TO450"))
                            return drQuery["ACCOUNT_CODE"].ToString();
                        else
                            throw new ArgumentException("NO HAY RELACIÓN DE CENTRO DE COSTO PARA EQUIPO IDENTIFICADO CON CÓDIGO 19 DE MANTENIMIENTO. POR FAVOR INGRESE CENTRO DE COSTO");
                    }

                    return drQuery["BULK_ACCOUNT"].ToString();
                }
                else
                    return "";
            }
            catch(ArgumentException ex)
            {
                throw ex;
            }
            catch(Exception ex)
            {
                Debugger.LogError("BulkMaterialActions.cs::GetBulkAccountCode", ex.Message);
                return "";
            }
        }
    }
}
