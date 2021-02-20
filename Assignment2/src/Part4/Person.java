/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.ArrayList;

/**
 *
 * @author zzz
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String ageGroup;
    private VitalSigns currentVitalSigns;
    private ArrayList<VitalSigns> vitalSignsHistory = new ArrayList<VitalSigns>();

    public Person(String firstName, String lastName, String ageGroup, VitalSigns currentVitalSigns) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageGroup = ageGroup;
        this.currentVitalSigns = currentVitalSigns;
    }

    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public VitalSigns getCurrentVitalSigns() {
        return currentVitalSigns;
    }

    public void setCurrentVitalSigns(VitalSigns currentVitalSigns) {
        this.currentVitalSigns = currentVitalSigns;
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    
    
}
