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
public class MedicalRecord {
    private String medicalRecordNumber;
    private String alergy1;
    private String alergy2;
    private String alergy3;

    public String getMedicakRecordNumber() {
        return medicalRecordNumber;
    }

    public String getAlergy1() {
        return alergy1;
    }

    public String getAlergy2() {
        return alergy2;
    }

    public String getAlergy3() {
        return alergy3;
    }

    public void setMedicakRecordNumber(String medicakRecordNumber) {
        this.medicalRecordNumber = medicakRecordNumber;
    }

    public void setAlergy1(String alergy1) {
        this.alergy1 = alergy1;
    }

    public void setAlergy2(String alergy2) {
        this.alergy2 = alergy2;
    }

    public void setAlergy3(String alergy3) {
        this.alergy3 = alergy3;
    }
    
    
}
