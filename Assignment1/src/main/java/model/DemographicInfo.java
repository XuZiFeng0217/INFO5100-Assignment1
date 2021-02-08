/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author zzz
 */
public class DemographicInfo {
    private String firtName;
    private String lastName;
    private String phoneNumber;
    private String dob;
    private int age;
    private double height;
    private double weight;
    private String socialSecurityNumber;

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    
}
