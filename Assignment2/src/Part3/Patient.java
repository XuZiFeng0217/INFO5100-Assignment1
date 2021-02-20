/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;
import java.util.ArrayList;

/**
 *
 * @author zzz
 */
public class Patient {
    private String firstName;
    private String lastName;
    private String ageGroup;
    private VitalSigns currentVitalSigns;
    private ArrayList<VitalSigns> vitalSignsHistory;
    private ArrayList<EcounterHistory> ecounterHistoryList;

    public Patient(String firstName, String lastName, String ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageGroup = ageGroup;
        ecounterHistoryList = new ArrayList<EcounterHistory>();
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public Patient() {
        ecounterHistoryList = new ArrayList<EcounterHistory>();
        vitalSignsHistory = new ArrayList<VitalSigns>();
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
    
    public void newVitalSign(VitalSigns vitalSigns){
        this.currentVitalSigns = vitalSigns;
        vitalSignsHistory.add(vitalSigns);
    }
    
    public void printVitalSignsHistory(){
        String str = "FullName:"+firstName+lastName+"--";
        for(int i = 0; i < vitalSignsHistory.size();i++ ){
            str = str +"vitalSigns"+(i+1)+":"+vitalSignsHistory.get(i)+";";
        }
        System.out.println(str);
    }
    
    public boolean isThisVitalSignNormal(String VitalSignAttribute, double VitalSign){
       try{
        if(VitalSignAttribute.equalsIgnoreCase("RespiratoryRate")){
            switch(this.ageGroup){
                case "Newborn":
                    if(VitalSign>=30&&VitalSign<=50){
                        return true;
                    }else{
                        return false;
                    }
                case "Infant":
                    if(VitalSign>=20&&VitalSign<=30){
                        return true;
                    }else{
                        return false;
                    }
                case "Toddler":
                    if(VitalSign>=20&&VitalSign<=30){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Preschooler":
                    if(VitalSign>=20&&VitalSign<=30){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "School Age":
                    if(VitalSign>=20&&VitalSign<=30){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Adolescent":
                    if(VitalSign>=12&&VitalSign<=20){
                        return true;
                    }else{
                        return false;
                    }

            }
                    
        }
        //HeartRate
        if(VitalSignAttribute.equalsIgnoreCase("HeartRate")){
            switch(this.ageGroup){
                case "Newborn":
                    if(VitalSign>=120&&VitalSign<=160){
                        return true;
                    }else{
                        return false;
                    }
                case "Infant":
                    if(VitalSign>=80&&VitalSign<=140){
                        return true;
                    }else{
                        return false;
                    }
                case "Toddler":
                    if(VitalSign>=80&&VitalSign<=130){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Preschooler":
                    if(VitalSign>=80&&VitalSign<=120){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "School Age":
                    if(VitalSign>=70&&VitalSign<=110){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Adolescent":
                    if(VitalSign>=55&&VitalSign<=105){
                        return true;
                    }else{
                        return false;
                    }

            }
                    
        }
        //SystolicBloodPressure
        if(VitalSignAttribute.equalsIgnoreCase("SystolicBloodPressure")){
            switch(this.ageGroup){
                case "Newborn":
                    if(VitalSign>=50&&VitalSign<=70){
                        return true;
                    }else{
                        return false;
                    }
                case "Infant":
                    if(VitalSign>=70&&VitalSign<=100){
                        return true;
                    }else{
                        return false;
                    }
                case "Toddler":
                    if(VitalSign>=80&&VitalSign<=110){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Preschooler":
                    if(VitalSign>=80&&VitalSign<=110){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "School Age":
                    if(VitalSign>=80&&VitalSign<=120){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Adolescent":
                    if(VitalSign>=110&&VitalSign<=120){
                        return true;
                    }else{
                        return false;
                    }

            }}
        //WeightInKilos
        if(VitalSignAttribute.equalsIgnoreCase("WeightInKilos")){
            switch(this.ageGroup){
                case "Newborn":
                    if(VitalSign>=2&&VitalSign<=3){
                        return true;
                    }else{
                        return false;
                    }
                case "Infant":
                    if(VitalSign>=4&&VitalSign<=10){
                        return true;
                    }else{
                        return false;
                    }
                case "Toddler":
                    if(VitalSign>=10&&VitalSign<=14){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Preschooler":
                    if(VitalSign>=14&&VitalSign<=18){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "School Age":
                    if(VitalSign>=20&&VitalSign<=42){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Adolescent":
                    if(VitalSign>50){
                        return true;
                    }else{
                        return false;
                    }

            }}
        //WeightInPounds 
        if(VitalSignAttribute.equalsIgnoreCase("WeightInPounds")){
            switch(this.ageGroup){
                case "Newborn":
                    if(VitalSign>=4.5&&VitalSign<=7){
                        return true;
                    }else{
                        return false;
                    }
                case "Infant":
                    if(VitalSign>=9&&VitalSign<=22){
                        return true;
                    }else{
                        return false;
                    }
                case "Toddler":
                    if(VitalSign>=22&&VitalSign<=31){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Preschooler":
                    if(VitalSign>=31&&VitalSign<=40){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "School Age":
                    if(VitalSign>=41&&VitalSign<=92){
                        return true;
                    }else{
                        return false;
                    }
                    
                case "Adolescent":
                    if(VitalSign>110){
                        return true;
                    }else{
                        return false;
                    }

            }
                    
        }
        
        System.out.println("Please enter the right VitalSignAttribute");
        return false;
       }
       catch(Exception e){
           System.out.println("Please check the input!");
           return false;
       }
    }
}

