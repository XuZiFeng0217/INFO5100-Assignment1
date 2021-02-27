/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

/**
 *
 * @author zzz
 */
public class VitalSigns {
    private double respiratoryRate;
    private double heartRate;
    private double systolicBloodPressure;
    private double weightInKilos;
    private double weightInPounds;

    public VitalSigns(double respiratoryRate, double heartRate, double systolicBloodPressure, double weightInKilos, double weightInPounds) {
        
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure = systolicBloodPressure;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInPounds;
    }

    public VitalSigns() {
    }



    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "{" + "respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds + '}';
    }
    
    
}
