/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;

import Part3.*;
import java.util.Scanner;

/**
 *
 * @author zzz
 */
public class Util {
    public void createVS(VitalSigns vitalSigns){
        Scanner sc = new Scanner(System.in);
        double respiratoryRate = 0;
        double heartRate = 0;
        double systolicBloodPressure = 0;
        double weightInKilos = 0;
        double weightInPounds = 0;
        System.out.println("Please input the RespiratoryRate");
        try{
            respiratoryRate = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }
        System.out.println("Please input the HeartRate");
        try{
            heartRate = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }
        
        System.out.println("Please input the SystolicBloodPressure");
        try{
            systolicBloodPressure = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }

        System.out.println("Please input the WeightInKilos");
        try{
            weightInKilos = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }
        
        System.out.println("Please input the WeightInPounds");
        try{
            weightInPounds = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }
        vitalSigns.setHeartRate(heartRate);
        vitalSigns.setRespiratoryRate(respiratoryRate);
        vitalSigns.setSystolicBloodPressure(systolicBloodPressure);
        vitalSigns.setWeightInKilos(weightInKilos);
        vitalSigns.setWeightInPounds(weightInPounds);
       
    }
}
