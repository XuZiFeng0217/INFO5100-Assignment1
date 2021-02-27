/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;

import java.util.Scanner;

/**
 *
 * @author zzz
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient p = new Patient("Jack","Smith","School Age");
        Scanner sc = new Scanner(System.in);
        double VitalSign = 0.0;
        System.out.println("Please Enter VitalSignAttribute(RespiratoryRate,HeartRate,SystolicBloodPressure,WeightInKilos,WeightInPounds)");
        String VitalSignAttribute = sc.nextLine();
        if(!(VitalSignAttribute.equals("RespiratoryRate")||VitalSignAttribute.equals("HeartRate")||VitalSignAttribute.equals("SystolicBloodPressure")||VitalSignAttribute.equals("WeightInKilos")||VitalSignAttribute.equals("WeightInPounds"))){
            System.out.println("Please check your input!!");
            return;
        }
        System.out.println("Please Enter VitalSign");
        try{
            VitalSign = sc.nextDouble();
        }catch(Exception e){
            
            System.out.println("Please check your input!!");
            return;
        }
        System.out.println(p.isThisVitalSignNormal(VitalSignAttribute, VitalSign));
    }
}
