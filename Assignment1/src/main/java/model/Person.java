/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zzz
 */
public class Person {
     private DemographicInfo demographicInfo;
     private AddressInfo addressInfo;
     private DriverLicenseInfo driverLicenseInfo;
     private AccountInfo savingAccountInfo;
     private AccountInfo checkingAccountInfo;
     private MedicalRecord medicalRecord;

    public DemographicInfo getDemographicInfo() {
        return demographicInfo;
    }

    public void setDemographicInfo(DemographicInfo demographicInfo) {
        this.demographicInfo = demographicInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public DriverLicenseInfo getDriverLicenseInfo() {
        return driverLicenseInfo;
    }

    public void setDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        this.driverLicenseInfo = driverLicenseInfo;
    }

    public AccountInfo getSavingAccountInfo() {
        return savingAccountInfo;
    }

    public void setSavingAccountInfo(AccountInfo savingAccountInfo) {
        this.savingAccountInfo = savingAccountInfo;
    }

    public AccountInfo getCheckingAccountInfo() {
        return checkingAccountInfo;
    }

    public void setCheckingAccountInfo(AccountInfo checkingAccountInfo) {
        this.checkingAccountInfo = checkingAccountInfo;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Person(DemographicInfo demographicInfo, AddressInfo addressInfo, DriverLicenseInfo driverLicenseInfo, AccountInfo savingAccountInfo, AccountInfo checkingAccountInfo, MedicalRecord medicalRecord) {
        this.demographicInfo = demographicInfo;
        this.addressInfo = addressInfo;
        this.driverLicenseInfo = driverLicenseInfo;
        this.savingAccountInfo = savingAccountInfo;
        this.checkingAccountInfo = checkingAccountInfo;
        this.medicalRecord = medicalRecord;
    }

     
     
     
}
