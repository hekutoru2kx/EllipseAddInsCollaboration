﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace EllipseDiscrepanciasExcelAddIn.Properties {
    
    
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.VisualStudio.Editors.SettingsDesigner.SettingsSingleFileGenerator", "16.8.1.0")]
    internal sealed partial class Settings : global::System.Configuration.ApplicationSettingsBase {
        
        private static Settings defaultInstance = ((Settings)(global::System.Configuration.ApplicationSettingsBase.Synchronized(new Settings())));
        
        public static Settings Default {
            get {
                return defaultInstance;
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://ellipse-eamprd.lmnerp01.cerrejon.com/ews/services/AdjustDiscrepantHoldingS" +
            "ervice")]
        public string EllipseDiscrepanciasExcelAddIn_AdjustDiscrepantHoldingService_AdjustDiscrepantHoldingService {
            get {
                return ((string)(this["EllipseDiscrepanciasExcelAddIn_AdjustDiscrepantHoldingService_AdjustDiscrepantHol" +
                    "dingService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://ellipse-eamprd.lmnerp01.cerrejon.com/ews/services/CountTaskService")]
        public string EllipseDiscrepanciasExcelAddIn_CountTaskService_CountTaskService {
            get {
                return ((string)(this["EllipseDiscrepanciasExcelAddIn_CountTaskService_CountTaskService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://ellipse-eamprd.lmnerp01.cerrejon.com/ews/services/DiscrepancyLogService")]
        public string EllipseDiscrepanciasExcelAddIn_DiscrepancyLogService_DiscrepancyLogService {
            get {
                return ((string)(this["EllipseDiscrepanciasExcelAddIn_DiscrepancyLogService_DiscrepancyLogService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://ellipse-eamprd.lmnerp01.cerrejon.com/ews/services/DiscrepancyTaskService")]
        public string EllipseDiscrepanciasExcelAddIn_DiscrepancyTaskService_DiscrepancyTaskService {
            get {
                return ((string)(this["EllipseDiscrepanciasExcelAddIn_DiscrepancyTaskService_DiscrepancyTaskService"]));
            }
        }
    }
}
