
package com.mincom.enterpriseservice.ellipse.employee;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.mincom.enterpriseservice.ellipse.AbstractDTO;


/**
 * <p>Java class for EmployeeServiceModifyRequestDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeServiceModifyRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ellipse.enterpriseservice.mincom.com}AbstractDTO">
 *       &lt;sequence>
 *         &lt;element name="actualFTEPercent" type="{http://employee.ellipse.enterpriseservice.mincom.com}actualFTEPercent" minOccurs="0"/>
 *         &lt;element name="authorityPercent" type="{http://employee.ellipse.enterpriseservice.mincom.com}authorityPercent" minOccurs="0"/>
 *         &lt;element name="barcode" type="{http://employee.ellipse.enterpriseservice.mincom.com}barcode" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="candidateId" type="{http://employee.ellipse.enterpriseservice.mincom.com}candidateId" minOccurs="0"/>
 *         &lt;element name="citizenIndicator" type="{http://employee.ellipse.enterpriseservice.mincom.com}citizenIndicator" minOccurs="0"/>
 *         &lt;element name="copyResAddrPostal" type="{http://employee.ellipse.enterpriseservice.mincom.com}copyResAddrPostal" minOccurs="0"/>
 *         &lt;element name="countryOfBirth" type="{http://employee.ellipse.enterpriseservice.mincom.com}countryOfBirth" minOccurs="0"/>
 *         &lt;element name="dataReferenceNo" type="{http://employee.ellipse.enterpriseservice.mincom.com}dataReferenceNo" minOccurs="0"/>
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathReason" type="{http://employee.ellipse.enterpriseservice.mincom.com}deathReason" minOccurs="0"/>
 *         &lt;element name="disabledInd" type="{http://employee.ellipse.enterpriseservice.mincom.com}disabledInd" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://employee.ellipse.enterpriseservice.mincom.com}emailAddress" minOccurs="0"/>
 *         &lt;element name="employee" type="{http://employee.ellipse.enterpriseservice.mincom.com}employee" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{http://employee.ellipse.enterpriseservice.mincom.com}employeeType" minOccurs="0"/>
 *         &lt;element name="entitleId" type="{http://employee.ellipse.enterpriseservice.mincom.com}entitleId" minOccurs="0"/>
 *         &lt;element name="ethnicity" type="{http://employee.ellipse.enterpriseservice.mincom.com}ethnicity" minOccurs="0"/>
 *         &lt;element name="excludeTalentExtract" type="{http://employee.ellipse.enterpriseservice.mincom.com}excludeTalentExtract" minOccurs="0"/>
 *         &lt;element name="externalCreate" type="{http://employee.ellipse.enterpriseservice.mincom.com}externalCreate" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://employee.ellipse.enterpriseservice.mincom.com}firstName" minOccurs="0"/>
 *         &lt;element name="fixedAssetsDistrict" type="{http://employee.ellipse.enterpriseservice.mincom.com}fixedAssetsDistrict" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://employee.ellipse.enterpriseservice.mincom.com}gender" minOccurs="0"/>
 *         &lt;element name="globalProfile" type="{http://employee.ellipse.enterpriseservice.mincom.com}globalProfile" minOccurs="0"/>
 *         &lt;element name="healthPlan" type="{http://employee.ellipse.enterpriseservice.mincom.com}healthPlan" minOccurs="0"/>
 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeFacsimileNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}homeFacsimileNumber" minOccurs="0"/>
 *         &lt;element name="homeMobilePhoneNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}homeMobilePhoneNumber" minOccurs="0"/>
 *         &lt;element name="homeTelephoneNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}homeTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="jobClassLevel" type="{http://employee.ellipse.enterpriseservice.mincom.com}jobClassLevel" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}languageCode" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://employee.ellipse.enterpriseservice.mincom.com}lastName" minOccurs="0"/>
 *         &lt;element name="leaveForecastDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalRepIndicator" type="{http://employee.ellipse.enterpriseservice.mincom.com}legalRepIndicator" minOccurs="0"/>
 *         &lt;element name="legalRepName" type="{http://employee.ellipse.enterpriseservice.mincom.com}legalRepName" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://employee.ellipse.enterpriseservice.mincom.com}maritalStatus" minOccurs="0"/>
 *         &lt;element name="messagePreference" type="{http://employee.ellipse.enterpriseservice.mincom.com}messagePreference" minOccurs="0"/>
 *         &lt;element name="nationalIdCode1" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdCode1" minOccurs="0"/>
 *         &lt;element name="nationalIdCode2" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdCode2" minOccurs="0"/>
 *         &lt;element name="nationalIdCode3" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdCode3" minOccurs="0"/>
 *         &lt;element name="nationalIdCode4" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdCode4" minOccurs="0"/>
 *         &lt;element name="nationalIdCode5" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdCode5" minOccurs="0"/>
 *         &lt;element name="nationalIdType1" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdType1" minOccurs="0"/>
 *         &lt;element name="nationalIdType2" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdType2" minOccurs="0"/>
 *         &lt;element name="nationalIdType3" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdType3" minOccurs="0"/>
 *         &lt;element name="nationalIdType4" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdType4" minOccurs="0"/>
 *         &lt;element name="nationalIdType5" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationalIdType5" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://employee.ellipse.enterpriseservice.mincom.com}nationality" minOccurs="0"/>
 *         &lt;element name="notifyEDIMsgRecieved" type="{http://employee.ellipse.enterpriseservice.mincom.com}notifyEDIMsgRecieved" minOccurs="0"/>
 *         &lt;element name="passportExpiryDate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportExpiryDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportExpiryDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportIssuedBy1" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportIssuedBy1" minOccurs="0"/>
 *         &lt;element name="passportIssuedBy2" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportIssuedBy2" minOccurs="0"/>
 *         &lt;element name="passportIssuedBy3" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportIssuedBy3" minOccurs="0"/>
 *         &lt;element name="passportNumber1" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportNumber1" minOccurs="0"/>
 *         &lt;element name="passportNumber2" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportNumber2" minOccurs="0"/>
 *         &lt;element name="passportNumber3" type="{http://employee.ellipse.enterpriseservice.mincom.com}passportNumber3" minOccurs="0"/>
 *         &lt;element name="paySlipDistMethod" type="{http://employee.ellipse.enterpriseservice.mincom.com}paySlipDistMethod" minOccurs="0"/>
 *         &lt;element name="persEmpStatus" type="{http://employee.ellipse.enterpriseservice.mincom.com}persEmpStatus" minOccurs="0"/>
 *         &lt;element name="personType" type="{http://employee.ellipse.enterpriseservice.mincom.com}personType" minOccurs="0"/>
 *         &lt;element name="personalEmail" type="{http://employee.ellipse.enterpriseservice.mincom.com}personalEmail" minOccurs="0"/>
 *         &lt;element name="personnelClass1" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass1" minOccurs="0"/>
 *         &lt;element name="personnelClass10" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass10" minOccurs="0"/>
 *         &lt;element name="personnelClass2" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass2" minOccurs="0"/>
 *         &lt;element name="personnelClass3" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass3" minOccurs="0"/>
 *         &lt;element name="personnelClass4" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass4" minOccurs="0"/>
 *         &lt;element name="personnelClass5" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass5" minOccurs="0"/>
 *         &lt;element name="personnelClass6" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass6" minOccurs="0"/>
 *         &lt;element name="personnelClass7" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass7" minOccurs="0"/>
 *         &lt;element name="personnelClass8" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass8" minOccurs="0"/>
 *         &lt;element name="personnelClass9" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelClass9" minOccurs="0"/>
 *         &lt;element name="personnelStatus" type="{http://employee.ellipse.enterpriseservice.mincom.com}personnelStatus" minOccurs="0"/>
 *         &lt;element name="photoPathname" type="{http://employee.ellipse.enterpriseservice.mincom.com}photoPathname" minOccurs="0"/>
 *         &lt;element name="physicalLocReason" type="{http://employee.ellipse.enterpriseservice.mincom.com}physicalLocReason" minOccurs="0"/>
 *         &lt;element name="physicalLocation" type="{http://employee.ellipse.enterpriseservice.mincom.com}physicalLocation" minOccurs="0"/>
 *         &lt;element name="position" type="{http://employee.ellipse.enterpriseservice.mincom.com}position" minOccurs="0"/>
 *         &lt;element name="positionClassUDef1" type="{http://employee.ellipse.enterpriseservice.mincom.com}positionClassUDef1" minOccurs="0"/>
 *         &lt;element name="positionClassUDef2" type="{http://employee.ellipse.enterpriseservice.mincom.com}positionClassUDef2" minOccurs="0"/>
 *         &lt;element name="positionReason" type="{http://employee.ellipse.enterpriseservice.mincom.com}positionReason" minOccurs="0"/>
 *         &lt;element name="positionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalAddressLine1" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalAddressLine1" minOccurs="0"/>
 *         &lt;element name="postalAddressLine2" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalAddressLine2" minOccurs="0"/>
 *         &lt;element name="postalAddressLine3" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalAddressLine3" minOccurs="0"/>
 *         &lt;element name="postalCountry" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalCountry" minOccurs="0"/>
 *         &lt;element name="postalState" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalState" minOccurs="0"/>
 *         &lt;element name="postalZipCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}postalZipCode" minOccurs="0"/>
 *         &lt;element name="preferredName" type="{http://employee.ellipse.enterpriseservice.mincom.com}preferredName" minOccurs="0"/>
 *         &lt;element name="previousEmployeeId" type="{http://employee.ellipse.enterpriseservice.mincom.com}previousEmployeeId" minOccurs="0"/>
 *         &lt;element name="previousFirstName" type="{http://employee.ellipse.enterpriseservice.mincom.com}previousFirstName" minOccurs="0"/>
 *         &lt;element name="previousLastName" type="{http://employee.ellipse.enterpriseservice.mincom.com}previousLastName" minOccurs="0"/>
 *         &lt;element name="previousSecondName" type="{http://employee.ellipse.enterpriseservice.mincom.com}previousSecondName" minOccurs="0"/>
 *         &lt;element name="previousThirdName" type="{http://employee.ellipse.enterpriseservice.mincom.com}previousThirdName" minOccurs="0"/>
 *         &lt;element name="printerName1" type="{http://employee.ellipse.enterpriseservice.mincom.com}printerName1" minOccurs="0"/>
 *         &lt;element name="printerName2" type="{http://employee.ellipse.enterpriseservice.mincom.com}printerName2" minOccurs="0"/>
 *         &lt;element name="printerName3" type="{http://employee.ellipse.enterpriseservice.mincom.com}printerName3" minOccurs="0"/>
 *         &lt;element name="printerName4" type="{http://employee.ellipse.enterpriseservice.mincom.com}printerName4" minOccurs="0"/>
 *         &lt;element name="printerName5" type="{http://employee.ellipse.enterpriseservice.mincom.com}printerName5" minOccurs="0"/>
 *         &lt;element name="professionalServiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rehireCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}rehireCode" minOccurs="0"/>
 *         &lt;element name="reinstatementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredAttributes" type="{http://employee.ellipse.enterpriseservice.mincom.com}EmployeeServiceModifyRequiredAttributesDTO" minOccurs="0"/>
 *         &lt;element name="residentialAddressEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentialAddressLine1" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialAddressLine1" minOccurs="0"/>
 *         &lt;element name="residentialAddressLine2" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialAddressLine2" minOccurs="0"/>
 *         &lt;element name="residentialAddressLine3" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialAddressLine3" minOccurs="0"/>
 *         &lt;element name="residentialCountry" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialCountry" minOccurs="0"/>
 *         &lt;element name="residentialState" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialState" minOccurs="0"/>
 *         &lt;element name="residentialZipCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}residentialZipCode" minOccurs="0"/>
 *         &lt;element name="resourceClass" type="{http://employee.ellipse.enterpriseservice.mincom.com}resourceClass" minOccurs="0"/>
 *         &lt;element name="resourceCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}resourceCode" minOccurs="0"/>
 *         &lt;element name="retirementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seasonalInd" type="{http://employee.ellipse.enterpriseservice.mincom.com}seasonalInd" minOccurs="0"/>
 *         &lt;element name="secondName" type="{http://employee.ellipse.enterpriseservice.mincom.com}secondName" minOccurs="0"/>
 *         &lt;element name="serviceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sigDateReason1" type="{http://employee.ellipse.enterpriseservice.mincom.com}sigDateReason1" minOccurs="0"/>
 *         &lt;element name="sigDateReason2" type="{http://employee.ellipse.enterpriseservice.mincom.com}sigDateReason2" minOccurs="0"/>
 *         &lt;element name="sigDateReason3" type="{http://employee.ellipse.enterpriseservice.mincom.com}sigDateReason3" minOccurs="0"/>
 *         &lt;element name="sigDateReason4" type="{http://employee.ellipse.enterpriseservice.mincom.com}sigDateReason4" minOccurs="0"/>
 *         &lt;element name="significantDate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="significantDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="significantDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="significantDate4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}siteCode" minOccurs="0"/>
 *         &lt;element name="skillsPassportCode1" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportCode1" minOccurs="0"/>
 *         &lt;element name="skillsPassportCode2" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportCode2" minOccurs="0"/>
 *         &lt;element name="skillsPassportCode3" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportCode3" minOccurs="0"/>
 *         &lt;element name="skillsPassportType1" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportType1" minOccurs="0"/>
 *         &lt;element name="skillsPassportType2" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportType2" minOccurs="0"/>
 *         &lt;element name="skillsPassportType3" type="{http://employee.ellipse.enterpriseservice.mincom.com}skillsPassportType3" minOccurs="0"/>
 *         &lt;element name="smokerInd" type="{http://employee.ellipse.enterpriseservice.mincom.com}smokerInd" minOccurs="0"/>
 *         &lt;element name="socialInsuranceNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}socialInsuranceNumber" minOccurs="0"/>
 *         &lt;element name="socialSecurityNoType" type="{http://employee.ellipse.enterpriseservice.mincom.com}socialSecurityNoType" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}socialSecurityNumber" minOccurs="0"/>
 *         &lt;element name="staffCategory" type="{http://employee.ellipse.enterpriseservice.mincom.com}staffCategory" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://employee.ellipse.enterpriseservice.mincom.com}supplier" minOccurs="0"/>
 *         &lt;element name="thirdName" type="{http://employee.ellipse.enterpriseservice.mincom.com}thirdName" minOccurs="0"/>
 *         &lt;element name="title" type="{http://employee.ellipse.enterpriseservice.mincom.com}title" minOccurs="0"/>
 *         &lt;element name="unionCode" type="{http://employee.ellipse.enterpriseservice.mincom.com}unionCode" minOccurs="0"/>
 *         &lt;element name="updateCandidate" type="{http://employee.ellipse.enterpriseservice.mincom.com}updateCandidate" minOccurs="0"/>
 *         &lt;element name="userDefContact1" type="{http://employee.ellipse.enterpriseservice.mincom.com}userDefContact1" minOccurs="0"/>
 *         &lt;element name="userDefContact2" type="{http://employee.ellipse.enterpriseservice.mincom.com}userDefContact2" minOccurs="0"/>
 *         &lt;element name="userDefContact3" type="{http://employee.ellipse.enterpriseservice.mincom.com}userDefContact3" minOccurs="0"/>
 *         &lt;element name="userDefContact4" type="{http://employee.ellipse.enterpriseservice.mincom.com}userDefContact4" minOccurs="0"/>
 *         &lt;element name="userDefContact5" type="{http://employee.ellipse.enterpriseservice.mincom.com}userDefContact5" minOccurs="0"/>
 *         &lt;element name="veteranStatus" type="{http://employee.ellipse.enterpriseservice.mincom.com}veteranStatus" minOccurs="0"/>
 *         &lt;element name="visaCode1" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaCode1" minOccurs="0"/>
 *         &lt;element name="visaCode2" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaCode2" minOccurs="0"/>
 *         &lt;element name="visaCode3" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaCode3" minOccurs="0"/>
 *         &lt;element name="visaEffectiveDate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaEffectiveDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaEffectiveDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaExpiryDate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaExpiryDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaExpiryDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaIssuedBy1" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaIssuedBy1" minOccurs="0"/>
 *         &lt;element name="visaIssuedBy2" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaIssuedBy2" minOccurs="0"/>
 *         &lt;element name="visaIssuedBy3" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaIssuedBy3" minOccurs="0"/>
 *         &lt;element name="visaNumber1" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaNumber1" minOccurs="0"/>
 *         &lt;element name="visaNumber2" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaNumber2" minOccurs="0"/>
 *         &lt;element name="visaNumber3" type="{http://employee.ellipse.enterpriseservice.mincom.com}visaNumber3" minOccurs="0"/>
 *         &lt;element name="workFacsimileNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}workFacsimileNumber" minOccurs="0"/>
 *         &lt;element name="workLocation" type="{http://employee.ellipse.enterpriseservice.mincom.com}workLocation" minOccurs="0"/>
 *         &lt;element name="workMobilePhoneNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}workMobilePhoneNumber" minOccurs="0"/>
 *         &lt;element name="workOrderPrefix" type="{http://employee.ellipse.enterpriseservice.mincom.com}workOrderPrefix" minOccurs="0"/>
 *         &lt;element name="workTelephoneExtension" type="{http://employee.ellipse.enterpriseservice.mincom.com}workTelephoneExtension" minOccurs="0"/>
 *         &lt;element name="workTelephoneNumber" type="{http://employee.ellipse.enterpriseservice.mincom.com}workTelephoneNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeServiceModifyRequestDTO", propOrder = {
    "actualFTEPercent",
    "authorityPercent",
    "barcode",
    "birthDate",
    "candidateId",
    "citizenIndicator",
    "copyResAddrPostal",
    "countryOfBirth",
    "dataReferenceNo",
    "deathDate",
    "deathReason",
    "disabledInd",
    "emailAddress",
    "employee",
    "employeeType",
    "entitleId",
    "ethnicity",
    "excludeTalentExtract",
    "externalCreate",
    "firstName",
    "fixedAssetsDistrict",
    "gender",
    "globalProfile",
    "healthPlan",
    "hireDate",
    "homeFacsimileNumber",
    "homeMobilePhoneNumber",
    "homeTelephoneNumber",
    "jobClassLevel",
    "languageCode",
    "lastName",
    "leaveForecastDate",
    "legalRepIndicator",
    "legalRepName",
    "maritalStatus",
    "messagePreference",
    "nationalIdCode1",
    "nationalIdCode2",
    "nationalIdCode3",
    "nationalIdCode4",
    "nationalIdCode5",
    "nationalIdType1",
    "nationalIdType2",
    "nationalIdType3",
    "nationalIdType4",
    "nationalIdType5",
    "nationality",
    "notifyEDIMsgRecieved",
    "passportExpiryDate1",
    "passportExpiryDate2",
    "passportExpiryDate3",
    "passportIssuedBy1",
    "passportIssuedBy2",
    "passportIssuedBy3",
    "passportNumber1",
    "passportNumber2",
    "passportNumber3",
    "paySlipDistMethod",
    "persEmpStatus",
    "personType",
    "personalEmail",
    "personnelClass1",
    "personnelClass10",
    "personnelClass2",
    "personnelClass3",
    "personnelClass4",
    "personnelClass5",
    "personnelClass6",
    "personnelClass7",
    "personnelClass8",
    "personnelClass9",
    "personnelStatus",
    "photoPathname",
    "physicalLocReason",
    "physicalLocation",
    "position",
    "positionClassUDef1",
    "positionClassUDef2",
    "positionReason",
    "positionStartDate",
    "postalAddressLine1",
    "postalAddressLine2",
    "postalAddressLine3",
    "postalCountry",
    "postalState",
    "postalZipCode",
    "preferredName",
    "previousEmployeeId",
    "previousFirstName",
    "previousLastName",
    "previousSecondName",
    "previousThirdName",
    "printerName1",
    "printerName2",
    "printerName3",
    "printerName4",
    "printerName5",
    "professionalServiceDate",
    "rehireCode",
    "reinstatementDate",
    "requiredAttributes",
    "residentialAddressEffDate",
    "residentialAddressLine1",
    "residentialAddressLine2",
    "residentialAddressLine3",
    "residentialCountry",
    "residentialState",
    "residentialZipCode",
    "resourceClass",
    "resourceCode",
    "retirementDate",
    "seasonalInd",
    "secondName",
    "serviceDate",
    "sigDateReason1",
    "sigDateReason2",
    "sigDateReason3",
    "sigDateReason4",
    "significantDate1",
    "significantDate2",
    "significantDate3",
    "significantDate4",
    "siteCode",
    "skillsPassportCode1",
    "skillsPassportCode2",
    "skillsPassportCode3",
    "skillsPassportType1",
    "skillsPassportType2",
    "skillsPassportType3",
    "smokerInd",
    "socialInsuranceNumber",
    "socialSecurityNoType",
    "socialSecurityNumber",
    "staffCategory",
    "supplier",
    "thirdName",
    "title",
    "unionCode",
    "updateCandidate",
    "userDefContact1",
    "userDefContact2",
    "userDefContact3",
    "userDefContact4",
    "userDefContact5",
    "veteranStatus",
    "visaCode1",
    "visaCode2",
    "visaCode3",
    "visaEffectiveDate1",
    "visaEffectiveDate2",
    "visaEffectiveDate3",
    "visaExpiryDate1",
    "visaExpiryDate2",
    "visaExpiryDate3",
    "visaIssuedBy1",
    "visaIssuedBy2",
    "visaIssuedBy3",
    "visaNumber1",
    "visaNumber2",
    "visaNumber3",
    "workFacsimileNumber",
    "workLocation",
    "workMobilePhoneNumber",
    "workOrderPrefix",
    "workTelephoneExtension",
    "workTelephoneNumber"
})
public class EmployeeServiceModifyRequestDTO
    extends AbstractDTO
{

    protected BigDecimal actualFTEPercent;
    protected BigDecimal authorityPercent;
    protected String barcode;
    protected String birthDate;
    protected String candidateId;
    protected String citizenIndicator;
    protected Boolean copyResAddrPostal;
    protected String countryOfBirth;
    protected String dataReferenceNo;
    protected String deathDate;
    protected String deathReason;
    protected Boolean disabledInd;
    protected String emailAddress;
    protected String employee;
    protected String employeeType;
    protected String entitleId;
    protected String ethnicity;
    protected Boolean excludeTalentExtract;
    protected Boolean externalCreate;
    protected String firstName;
    protected String fixedAssetsDistrict;
    protected String gender;
    protected String globalProfile;
    protected String healthPlan;
    protected String hireDate;
    protected String homeFacsimileNumber;
    protected String homeMobilePhoneNumber;
    protected String homeTelephoneNumber;
    protected String jobClassLevel;
    protected String languageCode;
    protected String lastName;
    protected String leaveForecastDate;
    protected Boolean legalRepIndicator;
    protected String legalRepName;
    protected String maritalStatus;
    protected String messagePreference;
    protected String nationalIdCode1;
    protected String nationalIdCode2;
    protected String nationalIdCode3;
    protected String nationalIdCode4;
    protected String nationalIdCode5;
    protected String nationalIdType1;
    protected String nationalIdType2;
    protected String nationalIdType3;
    protected String nationalIdType4;
    protected String nationalIdType5;
    protected String nationality;
    protected Boolean notifyEDIMsgRecieved;
    protected String passportExpiryDate1;
    protected String passportExpiryDate2;
    protected String passportExpiryDate3;
    protected String passportIssuedBy1;
    protected String passportIssuedBy2;
    protected String passportIssuedBy3;
    protected String passportNumber1;
    protected String passportNumber2;
    protected String passportNumber3;
    protected String paySlipDistMethod;
    protected String persEmpStatus;
    protected String personType;
    protected String personalEmail;
    protected String personnelClass1;
    protected String personnelClass10;
    protected String personnelClass2;
    protected String personnelClass3;
    protected String personnelClass4;
    protected String personnelClass5;
    protected String personnelClass6;
    protected String personnelClass7;
    protected String personnelClass8;
    protected String personnelClass9;
    protected String personnelStatus;
    protected String photoPathname;
    protected String physicalLocReason;
    protected String physicalLocation;
    protected String position;
    protected String positionClassUDef1;
    protected String positionClassUDef2;
    protected String positionReason;
    protected String positionStartDate;
    protected String postalAddressLine1;
    protected String postalAddressLine2;
    protected String postalAddressLine3;
    protected String postalCountry;
    protected String postalState;
    protected String postalZipCode;
    protected String preferredName;
    protected String previousEmployeeId;
    protected String previousFirstName;
    protected String previousLastName;
    protected String previousSecondName;
    protected String previousThirdName;
    protected String printerName1;
    protected String printerName2;
    protected String printerName3;
    protected String printerName4;
    protected String printerName5;
    protected String professionalServiceDate;
    protected String rehireCode;
    protected String reinstatementDate;
    protected EmployeeServiceModifyRequiredAttributesDTO requiredAttributes;
    protected String residentialAddressEffDate;
    protected String residentialAddressLine1;
    protected String residentialAddressLine2;
    protected String residentialAddressLine3;
    protected String residentialCountry;
    protected String residentialState;
    protected String residentialZipCode;
    protected String resourceClass;
    protected String resourceCode;
    protected String retirementDate;
    protected String seasonalInd;
    protected String secondName;
    protected String serviceDate;
    protected String sigDateReason1;
    protected String sigDateReason2;
    protected String sigDateReason3;
    protected String sigDateReason4;
    protected String significantDate1;
    protected String significantDate2;
    protected String significantDate3;
    protected String significantDate4;
    protected String siteCode;
    protected String skillsPassportCode1;
    protected String skillsPassportCode2;
    protected String skillsPassportCode3;
    protected String skillsPassportType1;
    protected String skillsPassportType2;
    protected String skillsPassportType3;
    protected Boolean smokerInd;
    protected String socialInsuranceNumber;
    protected String socialSecurityNoType;
    protected String socialSecurityNumber;
    protected String staffCategory;
    protected String supplier;
    protected String thirdName;
    protected String title;
    protected String unionCode;
    protected Boolean updateCandidate;
    protected String userDefContact1;
    protected String userDefContact2;
    protected String userDefContact3;
    protected String userDefContact4;
    protected String userDefContact5;
    protected String veteranStatus;
    protected String visaCode1;
    protected String visaCode2;
    protected String visaCode3;
    protected String visaEffectiveDate1;
    protected String visaEffectiveDate2;
    protected String visaEffectiveDate3;
    protected String visaExpiryDate1;
    protected String visaExpiryDate2;
    protected String visaExpiryDate3;
    protected String visaIssuedBy1;
    protected String visaIssuedBy2;
    protected String visaIssuedBy3;
    protected String visaNumber1;
    protected String visaNumber2;
    protected String visaNumber3;
    protected String workFacsimileNumber;
    protected String workLocation;
    protected String workMobilePhoneNumber;
    protected String workOrderPrefix;
    protected String workTelephoneExtension;
    protected String workTelephoneNumber;

    /**
     * Gets the value of the actualFTEPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualFTEPercent() {
        return actualFTEPercent;
    }

    /**
     * Sets the value of the actualFTEPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualFTEPercent(BigDecimal value) {
        this.actualFTEPercent = value;
    }

    /**
     * Gets the value of the authorityPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorityPercent() {
        return authorityPercent;
    }

    /**
     * Sets the value of the authorityPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorityPercent(BigDecimal value) {
        this.authorityPercent = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the candidateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCandidateId() {
        return candidateId;
    }

    /**
     * Sets the value of the candidateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCandidateId(String value) {
        this.candidateId = value;
    }

    /**
     * Gets the value of the citizenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenIndicator() {
        return citizenIndicator;
    }

    /**
     * Sets the value of the citizenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenIndicator(String value) {
        this.citizenIndicator = value;
    }

    /**
     * Gets the value of the copyResAddrPostal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyResAddrPostal() {
        return copyResAddrPostal;
    }

    /**
     * Sets the value of the copyResAddrPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyResAddrPostal(Boolean value) {
        this.copyResAddrPostal = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the dataReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataReferenceNo() {
        return dataReferenceNo;
    }

    /**
     * Sets the value of the dataReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataReferenceNo(String value) {
        this.dataReferenceNo = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDate(String value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the deathReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathReason() {
        return deathReason;
    }

    /**
     * Sets the value of the deathReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathReason(String value) {
        this.deathReason = value;
    }

    /**
     * Gets the value of the disabledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledInd() {
        return disabledInd;
    }

    /**
     * Sets the value of the disabledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledInd(Boolean value) {
        this.disabledInd = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployee(String value) {
        this.employee = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeType(String value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the entitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitleId() {
        return entitleId;
    }

    /**
     * Sets the value of the entitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitleId(String value) {
        this.entitleId = value;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicity(String value) {
        this.ethnicity = value;
    }

    /**
     * Gets the value of the excludeTalentExtract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeTalentExtract() {
        return excludeTalentExtract;
    }

    /**
     * Sets the value of the excludeTalentExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeTalentExtract(Boolean value) {
        this.excludeTalentExtract = value;
    }

    /**
     * Gets the value of the externalCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalCreate() {
        return externalCreate;
    }

    /**
     * Sets the value of the externalCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalCreate(Boolean value) {
        this.externalCreate = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fixedAssetsDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAssetsDistrict() {
        return fixedAssetsDistrict;
    }

    /**
     * Sets the value of the fixedAssetsDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAssetsDistrict(String value) {
        this.fixedAssetsDistrict = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the globalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProfile() {
        return globalProfile;
    }

    /**
     * Sets the value of the globalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProfile(String value) {
        this.globalProfile = value;
    }

    /**
     * Gets the value of the healthPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthPlan() {
        return healthPlan;
    }

    /**
     * Sets the value of the healthPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthPlan(String value) {
        this.healthPlan = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHireDate(String value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the homeFacsimileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeFacsimileNumber() {
        return homeFacsimileNumber;
    }

    /**
     * Sets the value of the homeFacsimileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeFacsimileNumber(String value) {
        this.homeFacsimileNumber = value;
    }

    /**
     * Gets the value of the homeMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeMobilePhoneNumber() {
        return homeMobilePhoneNumber;
    }

    /**
     * Sets the value of the homeMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeMobilePhoneNumber(String value) {
        this.homeMobilePhoneNumber = value;
    }

    /**
     * Gets the value of the homeTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTelephoneNumber() {
        return homeTelephoneNumber;
    }

    /**
     * Sets the value of the homeTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTelephoneNumber(String value) {
        this.homeTelephoneNumber = value;
    }

    /**
     * Gets the value of the jobClassLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClassLevel() {
        return jobClassLevel;
    }

    /**
     * Sets the value of the jobClassLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClassLevel(String value) {
        this.jobClassLevel = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the leaveForecastDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveForecastDate() {
        return leaveForecastDate;
    }

    /**
     * Sets the value of the leaveForecastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveForecastDate(String value) {
        this.leaveForecastDate = value;
    }

    /**
     * Gets the value of the legalRepIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalRepIndicator() {
        return legalRepIndicator;
    }

    /**
     * Sets the value of the legalRepIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalRepIndicator(Boolean value) {
        this.legalRepIndicator = value;
    }

    /**
     * Gets the value of the legalRepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRepName() {
        return legalRepName;
    }

    /**
     * Sets the value of the legalRepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRepName(String value) {
        this.legalRepName = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the messagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePreference() {
        return messagePreference;
    }

    /**
     * Sets the value of the messagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePreference(String value) {
        this.messagePreference = value;
    }

    /**
     * Gets the value of the nationalIdCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdCode1() {
        return nationalIdCode1;
    }

    /**
     * Sets the value of the nationalIdCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdCode1(String value) {
        this.nationalIdCode1 = value;
    }

    /**
     * Gets the value of the nationalIdCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdCode2() {
        return nationalIdCode2;
    }

    /**
     * Sets the value of the nationalIdCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdCode2(String value) {
        this.nationalIdCode2 = value;
    }

    /**
     * Gets the value of the nationalIdCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdCode3() {
        return nationalIdCode3;
    }

    /**
     * Sets the value of the nationalIdCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdCode3(String value) {
        this.nationalIdCode3 = value;
    }

    /**
     * Gets the value of the nationalIdCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdCode4() {
        return nationalIdCode4;
    }

    /**
     * Sets the value of the nationalIdCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdCode4(String value) {
        this.nationalIdCode4 = value;
    }

    /**
     * Gets the value of the nationalIdCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdCode5() {
        return nationalIdCode5;
    }

    /**
     * Sets the value of the nationalIdCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdCode5(String value) {
        this.nationalIdCode5 = value;
    }

    /**
     * Gets the value of the nationalIdType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdType1() {
        return nationalIdType1;
    }

    /**
     * Sets the value of the nationalIdType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdType1(String value) {
        this.nationalIdType1 = value;
    }

    /**
     * Gets the value of the nationalIdType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdType2() {
        return nationalIdType2;
    }

    /**
     * Sets the value of the nationalIdType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdType2(String value) {
        this.nationalIdType2 = value;
    }

    /**
     * Gets the value of the nationalIdType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdType3() {
        return nationalIdType3;
    }

    /**
     * Sets the value of the nationalIdType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdType3(String value) {
        this.nationalIdType3 = value;
    }

    /**
     * Gets the value of the nationalIdType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdType4() {
        return nationalIdType4;
    }

    /**
     * Sets the value of the nationalIdType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdType4(String value) {
        this.nationalIdType4 = value;
    }

    /**
     * Gets the value of the nationalIdType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdType5() {
        return nationalIdType5;
    }

    /**
     * Sets the value of the nationalIdType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdType5(String value) {
        this.nationalIdType5 = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the notifyEDIMsgRecieved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyEDIMsgRecieved() {
        return notifyEDIMsgRecieved;
    }

    /**
     * Sets the value of the notifyEDIMsgRecieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyEDIMsgRecieved(Boolean value) {
        this.notifyEDIMsgRecieved = value;
    }

    /**
     * Gets the value of the passportExpiryDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportExpiryDate1() {
        return passportExpiryDate1;
    }

    /**
     * Sets the value of the passportExpiryDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportExpiryDate1(String value) {
        this.passportExpiryDate1 = value;
    }

    /**
     * Gets the value of the passportExpiryDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportExpiryDate2() {
        return passportExpiryDate2;
    }

    /**
     * Sets the value of the passportExpiryDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportExpiryDate2(String value) {
        this.passportExpiryDate2 = value;
    }

    /**
     * Gets the value of the passportExpiryDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportExpiryDate3() {
        return passportExpiryDate3;
    }

    /**
     * Sets the value of the passportExpiryDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportExpiryDate3(String value) {
        this.passportExpiryDate3 = value;
    }

    /**
     * Gets the value of the passportIssuedBy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuedBy1() {
        return passportIssuedBy1;
    }

    /**
     * Sets the value of the passportIssuedBy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuedBy1(String value) {
        this.passportIssuedBy1 = value;
    }

    /**
     * Gets the value of the passportIssuedBy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuedBy2() {
        return passportIssuedBy2;
    }

    /**
     * Sets the value of the passportIssuedBy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuedBy2(String value) {
        this.passportIssuedBy2 = value;
    }

    /**
     * Gets the value of the passportIssuedBy3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuedBy3() {
        return passportIssuedBy3;
    }

    /**
     * Sets the value of the passportIssuedBy3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuedBy3(String value) {
        this.passportIssuedBy3 = value;
    }

    /**
     * Gets the value of the passportNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber1() {
        return passportNumber1;
    }

    /**
     * Sets the value of the passportNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber1(String value) {
        this.passportNumber1 = value;
    }

    /**
     * Gets the value of the passportNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber2() {
        return passportNumber2;
    }

    /**
     * Sets the value of the passportNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber2(String value) {
        this.passportNumber2 = value;
    }

    /**
     * Gets the value of the passportNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber3() {
        return passportNumber3;
    }

    /**
     * Sets the value of the passportNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber3(String value) {
        this.passportNumber3 = value;
    }

    /**
     * Gets the value of the paySlipDistMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaySlipDistMethod() {
        return paySlipDistMethod;
    }

    /**
     * Sets the value of the paySlipDistMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaySlipDistMethod(String value) {
        this.paySlipDistMethod = value;
    }

    /**
     * Gets the value of the persEmpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersEmpStatus() {
        return persEmpStatus;
    }

    /**
     * Sets the value of the persEmpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersEmpStatus(String value) {
        this.persEmpStatus = value;
    }

    /**
     * Gets the value of the personType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Sets the value of the personType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonType(String value) {
        this.personType = value;
    }

    /**
     * Gets the value of the personalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalEmail() {
        return personalEmail;
    }

    /**
     * Sets the value of the personalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalEmail(String value) {
        this.personalEmail = value;
    }

    /**
     * Gets the value of the personnelClass1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass1() {
        return personnelClass1;
    }

    /**
     * Sets the value of the personnelClass1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass1(String value) {
        this.personnelClass1 = value;
    }

    /**
     * Gets the value of the personnelClass10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass10() {
        return personnelClass10;
    }

    /**
     * Sets the value of the personnelClass10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass10(String value) {
        this.personnelClass10 = value;
    }

    /**
     * Gets the value of the personnelClass2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass2() {
        return personnelClass2;
    }

    /**
     * Sets the value of the personnelClass2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass2(String value) {
        this.personnelClass2 = value;
    }

    /**
     * Gets the value of the personnelClass3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass3() {
        return personnelClass3;
    }

    /**
     * Sets the value of the personnelClass3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass3(String value) {
        this.personnelClass3 = value;
    }

    /**
     * Gets the value of the personnelClass4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass4() {
        return personnelClass4;
    }

    /**
     * Sets the value of the personnelClass4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass4(String value) {
        this.personnelClass4 = value;
    }

    /**
     * Gets the value of the personnelClass5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass5() {
        return personnelClass5;
    }

    /**
     * Sets the value of the personnelClass5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass5(String value) {
        this.personnelClass5 = value;
    }

    /**
     * Gets the value of the personnelClass6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass6() {
        return personnelClass6;
    }

    /**
     * Sets the value of the personnelClass6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass6(String value) {
        this.personnelClass6 = value;
    }

    /**
     * Gets the value of the personnelClass7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass7() {
        return personnelClass7;
    }

    /**
     * Sets the value of the personnelClass7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass7(String value) {
        this.personnelClass7 = value;
    }

    /**
     * Gets the value of the personnelClass8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass8() {
        return personnelClass8;
    }

    /**
     * Sets the value of the personnelClass8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass8(String value) {
        this.personnelClass8 = value;
    }

    /**
     * Gets the value of the personnelClass9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelClass9() {
        return personnelClass9;
    }

    /**
     * Sets the value of the personnelClass9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelClass9(String value) {
        this.personnelClass9 = value;
    }

    /**
     * Gets the value of the personnelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelStatus() {
        return personnelStatus;
    }

    /**
     * Sets the value of the personnelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelStatus(String value) {
        this.personnelStatus = value;
    }

    /**
     * Gets the value of the photoPathname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoPathname() {
        return photoPathname;
    }

    /**
     * Sets the value of the photoPathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoPathname(String value) {
        this.photoPathname = value;
    }

    /**
     * Gets the value of the physicalLocReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalLocReason() {
        return physicalLocReason;
    }

    /**
     * Sets the value of the physicalLocReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalLocReason(String value) {
        this.physicalLocReason = value;
    }

    /**
     * Gets the value of the physicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalLocation(String value) {
        this.physicalLocation = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the positionClassUDef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionClassUDef1() {
        return positionClassUDef1;
    }

    /**
     * Sets the value of the positionClassUDef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionClassUDef1(String value) {
        this.positionClassUDef1 = value;
    }

    /**
     * Gets the value of the positionClassUDef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionClassUDef2() {
        return positionClassUDef2;
    }

    /**
     * Sets the value of the positionClassUDef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionClassUDef2(String value) {
        this.positionClassUDef2 = value;
    }

    /**
     * Gets the value of the positionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionReason() {
        return positionReason;
    }

    /**
     * Sets the value of the positionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionReason(String value) {
        this.positionReason = value;
    }

    /**
     * Gets the value of the positionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionStartDate() {
        return positionStartDate;
    }

    /**
     * Sets the value of the positionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionStartDate(String value) {
        this.positionStartDate = value;
    }

    /**
     * Gets the value of the postalAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddressLine1() {
        return postalAddressLine1;
    }

    /**
     * Sets the value of the postalAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddressLine1(String value) {
        this.postalAddressLine1 = value;
    }

    /**
     * Gets the value of the postalAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddressLine2() {
        return postalAddressLine2;
    }

    /**
     * Sets the value of the postalAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddressLine2(String value) {
        this.postalAddressLine2 = value;
    }

    /**
     * Gets the value of the postalAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddressLine3() {
        return postalAddressLine3;
    }

    /**
     * Sets the value of the postalAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddressLine3(String value) {
        this.postalAddressLine3 = value;
    }

    /**
     * Gets the value of the postalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCountry() {
        return postalCountry;
    }

    /**
     * Sets the value of the postalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCountry(String value) {
        this.postalCountry = value;
    }

    /**
     * Gets the value of the postalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalState() {
        return postalState;
    }

    /**
     * Sets the value of the postalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalState(String value) {
        this.postalState = value;
    }

    /**
     * Gets the value of the postalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalZipCode() {
        return postalZipCode;
    }

    /**
     * Sets the value of the postalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalZipCode(String value) {
        this.postalZipCode = value;
    }

    /**
     * Gets the value of the preferredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Sets the value of the preferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredName(String value) {
        this.preferredName = value;
    }

    /**
     * Gets the value of the previousEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousEmployeeId() {
        return previousEmployeeId;
    }

    /**
     * Sets the value of the previousEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousEmployeeId(String value) {
        this.previousEmployeeId = value;
    }

    /**
     * Gets the value of the previousFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousFirstName() {
        return previousFirstName;
    }

    /**
     * Sets the value of the previousFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousFirstName(String value) {
        this.previousFirstName = value;
    }

    /**
     * Gets the value of the previousLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousLastName() {
        return previousLastName;
    }

    /**
     * Sets the value of the previousLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousLastName(String value) {
        this.previousLastName = value;
    }

    /**
     * Gets the value of the previousSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSecondName() {
        return previousSecondName;
    }

    /**
     * Sets the value of the previousSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSecondName(String value) {
        this.previousSecondName = value;
    }

    /**
     * Gets the value of the previousThirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousThirdName() {
        return previousThirdName;
    }

    /**
     * Sets the value of the previousThirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousThirdName(String value) {
        this.previousThirdName = value;
    }

    /**
     * Gets the value of the printerName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName1() {
        return printerName1;
    }

    /**
     * Sets the value of the printerName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName1(String value) {
        this.printerName1 = value;
    }

    /**
     * Gets the value of the printerName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName2() {
        return printerName2;
    }

    /**
     * Sets the value of the printerName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName2(String value) {
        this.printerName2 = value;
    }

    /**
     * Gets the value of the printerName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName3() {
        return printerName3;
    }

    /**
     * Sets the value of the printerName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName3(String value) {
        this.printerName3 = value;
    }

    /**
     * Gets the value of the printerName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName4() {
        return printerName4;
    }

    /**
     * Sets the value of the printerName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName4(String value) {
        this.printerName4 = value;
    }

    /**
     * Gets the value of the printerName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName5() {
        return printerName5;
    }

    /**
     * Sets the value of the printerName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName5(String value) {
        this.printerName5 = value;
    }

    /**
     * Gets the value of the professionalServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalServiceDate() {
        return professionalServiceDate;
    }

    /**
     * Sets the value of the professionalServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalServiceDate(String value) {
        this.professionalServiceDate = value;
    }

    /**
     * Gets the value of the rehireCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRehireCode() {
        return rehireCode;
    }

    /**
     * Sets the value of the rehireCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRehireCode(String value) {
        this.rehireCode = value;
    }

    /**
     * Gets the value of the reinstatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinstatementDate() {
        return reinstatementDate;
    }

    /**
     * Sets the value of the reinstatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinstatementDate(String value) {
        this.reinstatementDate = value;
    }

    /**
     * Gets the value of the requiredAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeServiceModifyRequiredAttributesDTO }
     *     
     */
    public EmployeeServiceModifyRequiredAttributesDTO getRequiredAttributes() {
        return requiredAttributes;
    }

    /**
     * Sets the value of the requiredAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeServiceModifyRequiredAttributesDTO }
     *     
     */
    public void setRequiredAttributes(EmployeeServiceModifyRequiredAttributesDTO value) {
        this.requiredAttributes = value;
    }

    /**
     * Gets the value of the residentialAddressEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialAddressEffDate() {
        return residentialAddressEffDate;
    }

    /**
     * Sets the value of the residentialAddressEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialAddressEffDate(String value) {
        this.residentialAddressEffDate = value;
    }

    /**
     * Gets the value of the residentialAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialAddressLine1() {
        return residentialAddressLine1;
    }

    /**
     * Sets the value of the residentialAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialAddressLine1(String value) {
        this.residentialAddressLine1 = value;
    }

    /**
     * Gets the value of the residentialAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialAddressLine2() {
        return residentialAddressLine2;
    }

    /**
     * Sets the value of the residentialAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialAddressLine2(String value) {
        this.residentialAddressLine2 = value;
    }

    /**
     * Gets the value of the residentialAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialAddressLine3() {
        return residentialAddressLine3;
    }

    /**
     * Sets the value of the residentialAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialAddressLine3(String value) {
        this.residentialAddressLine3 = value;
    }

    /**
     * Gets the value of the residentialCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialCountry() {
        return residentialCountry;
    }

    /**
     * Sets the value of the residentialCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialCountry(String value) {
        this.residentialCountry = value;
    }

    /**
     * Gets the value of the residentialState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialState() {
        return residentialState;
    }

    /**
     * Sets the value of the residentialState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialState(String value) {
        this.residentialState = value;
    }

    /**
     * Gets the value of the residentialZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialZipCode() {
        return residentialZipCode;
    }

    /**
     * Sets the value of the residentialZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialZipCode(String value) {
        this.residentialZipCode = value;
    }

    /**
     * Gets the value of the resourceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceClass() {
        return resourceClass;
    }

    /**
     * Sets the value of the resourceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceClass(String value) {
        this.resourceClass = value;
    }

    /**
     * Gets the value of the resourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * Sets the value of the resourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceCode(String value) {
        this.resourceCode = value;
    }

    /**
     * Gets the value of the retirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetirementDate() {
        return retirementDate;
    }

    /**
     * Sets the value of the retirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetirementDate(String value) {
        this.retirementDate = value;
    }

    /**
     * Gets the value of the seasonalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalInd() {
        return seasonalInd;
    }

    /**
     * Sets the value of the seasonalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalInd(String value) {
        this.seasonalInd = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the sigDateReason1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigDateReason1() {
        return sigDateReason1;
    }

    /**
     * Sets the value of the sigDateReason1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigDateReason1(String value) {
        this.sigDateReason1 = value;
    }

    /**
     * Gets the value of the sigDateReason2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigDateReason2() {
        return sigDateReason2;
    }

    /**
     * Sets the value of the sigDateReason2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigDateReason2(String value) {
        this.sigDateReason2 = value;
    }

    /**
     * Gets the value of the sigDateReason3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigDateReason3() {
        return sigDateReason3;
    }

    /**
     * Sets the value of the sigDateReason3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigDateReason3(String value) {
        this.sigDateReason3 = value;
    }

    /**
     * Gets the value of the sigDateReason4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigDateReason4() {
        return sigDateReason4;
    }

    /**
     * Sets the value of the sigDateReason4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigDateReason4(String value) {
        this.sigDateReason4 = value;
    }

    /**
     * Gets the value of the significantDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDate1() {
        return significantDate1;
    }

    /**
     * Sets the value of the significantDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDate1(String value) {
        this.significantDate1 = value;
    }

    /**
     * Gets the value of the significantDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDate2() {
        return significantDate2;
    }

    /**
     * Sets the value of the significantDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDate2(String value) {
        this.significantDate2 = value;
    }

    /**
     * Gets the value of the significantDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDate3() {
        return significantDate3;
    }

    /**
     * Sets the value of the significantDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDate3(String value) {
        this.significantDate3 = value;
    }

    /**
     * Gets the value of the significantDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDate4() {
        return significantDate4;
    }

    /**
     * Sets the value of the significantDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDate4(String value) {
        this.significantDate4 = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the skillsPassportCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportCode1() {
        return skillsPassportCode1;
    }

    /**
     * Sets the value of the skillsPassportCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportCode1(String value) {
        this.skillsPassportCode1 = value;
    }

    /**
     * Gets the value of the skillsPassportCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportCode2() {
        return skillsPassportCode2;
    }

    /**
     * Sets the value of the skillsPassportCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportCode2(String value) {
        this.skillsPassportCode2 = value;
    }

    /**
     * Gets the value of the skillsPassportCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportCode3() {
        return skillsPassportCode3;
    }

    /**
     * Sets the value of the skillsPassportCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportCode3(String value) {
        this.skillsPassportCode3 = value;
    }

    /**
     * Gets the value of the skillsPassportType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportType1() {
        return skillsPassportType1;
    }

    /**
     * Sets the value of the skillsPassportType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportType1(String value) {
        this.skillsPassportType1 = value;
    }

    /**
     * Gets the value of the skillsPassportType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportType2() {
        return skillsPassportType2;
    }

    /**
     * Sets the value of the skillsPassportType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportType2(String value) {
        this.skillsPassportType2 = value;
    }

    /**
     * Gets the value of the skillsPassportType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsPassportType3() {
        return skillsPassportType3;
    }

    /**
     * Sets the value of the skillsPassportType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsPassportType3(String value) {
        this.skillsPassportType3 = value;
    }

    /**
     * Gets the value of the smokerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokerInd() {
        return smokerInd;
    }

    /**
     * Sets the value of the smokerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokerInd(Boolean value) {
        this.smokerInd = value;
    }

    /**
     * Gets the value of the socialInsuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    /**
     * Sets the value of the socialInsuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialInsuranceNumber(String value) {
        this.socialInsuranceNumber = value;
    }

    /**
     * Gets the value of the socialSecurityNoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNoType() {
        return socialSecurityNoType;
    }

    /**
     * Sets the value of the socialSecurityNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNoType(String value) {
        this.socialSecurityNoType = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the staffCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCategory() {
        return staffCategory;
    }

    /**
     * Sets the value of the staffCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCategory(String value) {
        this.staffCategory = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the thirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Sets the value of the thirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the unionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionCode() {
        return unionCode;
    }

    /**
     * Sets the value of the unionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionCode(String value) {
        this.unionCode = value;
    }

    /**
     * Gets the value of the updateCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateCandidate() {
        return updateCandidate;
    }

    /**
     * Sets the value of the updateCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCandidate(Boolean value) {
        this.updateCandidate = value;
    }

    /**
     * Gets the value of the userDefContact1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefContact1() {
        return userDefContact1;
    }

    /**
     * Sets the value of the userDefContact1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefContact1(String value) {
        this.userDefContact1 = value;
    }

    /**
     * Gets the value of the userDefContact2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefContact2() {
        return userDefContact2;
    }

    /**
     * Sets the value of the userDefContact2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefContact2(String value) {
        this.userDefContact2 = value;
    }

    /**
     * Gets the value of the userDefContact3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefContact3() {
        return userDefContact3;
    }

    /**
     * Sets the value of the userDefContact3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefContact3(String value) {
        this.userDefContact3 = value;
    }

    /**
     * Gets the value of the userDefContact4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefContact4() {
        return userDefContact4;
    }

    /**
     * Sets the value of the userDefContact4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefContact4(String value) {
        this.userDefContact4 = value;
    }

    /**
     * Gets the value of the userDefContact5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefContact5() {
        return userDefContact5;
    }

    /**
     * Sets the value of the userDefContact5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefContact5(String value) {
        this.userDefContact5 = value;
    }

    /**
     * Gets the value of the veteranStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranStatus() {
        return veteranStatus;
    }

    /**
     * Sets the value of the veteranStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranStatus(String value) {
        this.veteranStatus = value;
    }

    /**
     * Gets the value of the visaCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaCode1() {
        return visaCode1;
    }

    /**
     * Sets the value of the visaCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaCode1(String value) {
        this.visaCode1 = value;
    }

    /**
     * Gets the value of the visaCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaCode2() {
        return visaCode2;
    }

    /**
     * Sets the value of the visaCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaCode2(String value) {
        this.visaCode2 = value;
    }

    /**
     * Gets the value of the visaCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaCode3() {
        return visaCode3;
    }

    /**
     * Sets the value of the visaCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaCode3(String value) {
        this.visaCode3 = value;
    }

    /**
     * Gets the value of the visaEffectiveDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaEffectiveDate1() {
        return visaEffectiveDate1;
    }

    /**
     * Sets the value of the visaEffectiveDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaEffectiveDate1(String value) {
        this.visaEffectiveDate1 = value;
    }

    /**
     * Gets the value of the visaEffectiveDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaEffectiveDate2() {
        return visaEffectiveDate2;
    }

    /**
     * Sets the value of the visaEffectiveDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaEffectiveDate2(String value) {
        this.visaEffectiveDate2 = value;
    }

    /**
     * Gets the value of the visaEffectiveDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaEffectiveDate3() {
        return visaEffectiveDate3;
    }

    /**
     * Sets the value of the visaEffectiveDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaEffectiveDate3(String value) {
        this.visaEffectiveDate3 = value;
    }

    /**
     * Gets the value of the visaExpiryDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaExpiryDate1() {
        return visaExpiryDate1;
    }

    /**
     * Sets the value of the visaExpiryDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaExpiryDate1(String value) {
        this.visaExpiryDate1 = value;
    }

    /**
     * Gets the value of the visaExpiryDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaExpiryDate2() {
        return visaExpiryDate2;
    }

    /**
     * Sets the value of the visaExpiryDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaExpiryDate2(String value) {
        this.visaExpiryDate2 = value;
    }

    /**
     * Gets the value of the visaExpiryDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaExpiryDate3() {
        return visaExpiryDate3;
    }

    /**
     * Sets the value of the visaExpiryDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaExpiryDate3(String value) {
        this.visaExpiryDate3 = value;
    }

    /**
     * Gets the value of the visaIssuedBy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssuedBy1() {
        return visaIssuedBy1;
    }

    /**
     * Sets the value of the visaIssuedBy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssuedBy1(String value) {
        this.visaIssuedBy1 = value;
    }

    /**
     * Gets the value of the visaIssuedBy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssuedBy2() {
        return visaIssuedBy2;
    }

    /**
     * Sets the value of the visaIssuedBy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssuedBy2(String value) {
        this.visaIssuedBy2 = value;
    }

    /**
     * Gets the value of the visaIssuedBy3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssuedBy3() {
        return visaIssuedBy3;
    }

    /**
     * Sets the value of the visaIssuedBy3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssuedBy3(String value) {
        this.visaIssuedBy3 = value;
    }

    /**
     * Gets the value of the visaNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber1() {
        return visaNumber1;
    }

    /**
     * Sets the value of the visaNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber1(String value) {
        this.visaNumber1 = value;
    }

    /**
     * Gets the value of the visaNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber2() {
        return visaNumber2;
    }

    /**
     * Sets the value of the visaNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber2(String value) {
        this.visaNumber2 = value;
    }

    /**
     * Gets the value of the visaNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber3() {
        return visaNumber3;
    }

    /**
     * Sets the value of the visaNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber3(String value) {
        this.visaNumber3 = value;
    }

    /**
     * Gets the value of the workFacsimileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkFacsimileNumber() {
        return workFacsimileNumber;
    }

    /**
     * Sets the value of the workFacsimileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkFacsimileNumber(String value) {
        this.workFacsimileNumber = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkLocation(String value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the workMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkMobilePhoneNumber() {
        return workMobilePhoneNumber;
    }

    /**
     * Sets the value of the workMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkMobilePhoneNumber(String value) {
        this.workMobilePhoneNumber = value;
    }

    /**
     * Gets the value of the workOrderPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderPrefix() {
        return workOrderPrefix;
    }

    /**
     * Sets the value of the workOrderPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderPrefix(String value) {
        this.workOrderPrefix = value;
    }

    /**
     * Gets the value of the workTelephoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTelephoneExtension() {
        return workTelephoneExtension;
    }

    /**
     * Sets the value of the workTelephoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTelephoneExtension(String value) {
        this.workTelephoneExtension = value;
    }

    /**
     * Gets the value of the workTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTelephoneNumber() {
        return workTelephoneNumber;
    }

    /**
     * Sets the value of the workTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTelephoneNumber(String value) {
        this.workTelephoneNumber = value;
    }

}
