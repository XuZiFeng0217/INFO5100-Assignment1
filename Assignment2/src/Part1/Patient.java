/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author zzz
 */
public class Patient {
    
    private String firstName;
    private String lastName;
    private String ageGroup;
    private VitalSigns vitalSigns;
    
    public Patient(String firstName, String lastName, String ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageGroup = ageGroup;
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

    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    public boolean isPatientNormal(VitalSigns vitalSigns){
        switch(this.ageGroup){
            case "Newborn":
                if(!(vitalSigns.getRespiratoryRate()>=30
                        &&vitalSigns.getRespiratoryRate()<=50
                        &&vitalSigns.getHeartRate()>=120
                        &&vitalSigns.getHeartRate()<=160
                        &&vitalSigns.getSystolicBloodPressure()>=50
                        &&vitalSigns.getSystolicBloodPressure()<=70
                        &&vitalSigns.getWeightInKilos()>=2
                        &&vitalSigns.getWeightInKilos()<=3
                        &&vitalSigns.getWeightInPounds()>=4.5
                        &&vitalSigns.getWeightInPounds()<=7)){
                    return true; 
                }else{
                    return false;
               
                            }
                
            case "Infant":
                if(!(vitalSigns.getRespiratoryRate()>=20
                        &&vitalSigns.getRespiratoryRate()<=30
                        &&vitalSigns.getHeartRate()>=80
                        &&vitalSigns.getHeartRate()<=140
                        &&vitalSigns.getSystolicBloodPressure()>=70
                        &&vitalSigns.getSystolicBloodPressure()<=100
                        &&vitalSigns.getWeightInKilos()>=4
                        &&vitalSigns.getWeightInKilos()<=10
                        &&vitalSigns.getWeightInPounds()>=9
                        &&vitalSigns.getWeightInPounds()<=22)){
                    return true;}
                else{
                            return false;
                            }
                
                
            case "Toddler":
                if(!(vitalSigns.getRespiratoryRate()>=20
                        &&vitalSigns.getRespiratoryRate()<=30
                        &&vitalSigns.getHeartRate()>=80
                        &&vitalSigns.getHeartRate()<=130
                        &&vitalSigns.getSystolicBloodPressure()>=80
                        &&vitalSigns.getSystolicBloodPressure()<=110
                        &&vitalSigns.getWeightInKilos()>=10
                        &&vitalSigns.getWeightInKilos()<=14
                        &&vitalSigns.getWeightInPounds()>=22
                        &&vitalSigns.getWeightInPounds()<=31)){
                    return true;
                }else{
                    return false;
                }
                
            case "Preschooler":
                if(!(vitalSigns.getRespiratoryRate()>=20
                        &&vitalSigns.getRespiratoryRate()<=30
                        &&vitalSigns.getHeartRate()>=80
                        &&vitalSigns.getHeartRate()<=120
                        &&vitalSigns.getSystolicBloodPressure()>=80
                        &&vitalSigns.getSystolicBloodPressure()<=110
                        &&vitalSigns.getWeightInKilos()>=14
                        &&vitalSigns.getWeightInKilos()<=18
                        &&vitalSigns.getWeightInPounds()>=31
                        &&vitalSigns.getWeightInPounds()<=40)){
                    return true;
                }else{
                    return false;
                }  
                
            case "School Age":
                if(!(vitalSigns.getRespiratoryRate()>=20
                        &&vitalSigns.getRespiratoryRate()<=30
                        &&vitalSigns.getHeartRate()>=70
                        &&vitalSigns.getHeartRate()<=110
                        &&vitalSigns.getSystolicBloodPressure()>=80
                        &&vitalSigns.getSystolicBloodPressure()<=120
                        &&vitalSigns.getWeightInKilos()>=20
                        &&vitalSigns.getWeightInKilos()<=42
                        &&vitalSigns.getWeightInPounds()>=41
                        &&vitalSigns.getWeightInPounds()<=92)){
                    return true;
                }else{
                    return false;
                } 
                
            case "Adolescent":
                if(!(vitalSigns.getRespiratoryRate()>=12
                        &&vitalSigns.getRespiratoryRate()<=20
                        &&vitalSigns.getHeartRate()>=55
                        &&vitalSigns.getHeartRate()<=105
                        &&vitalSigns.getSystolicBloodPressure()>=110
                        &&vitalSigns.getSystolicBloodPressure()<=120
                        &&vitalSigns.getWeightInKilos()>50
                        &&vitalSigns.getWeightInPounds()>110)){
                    return true;
                }else{
                    return false;
                } 
                    
        }
        return false;
    }
    
}
