/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.util.Scanner;

/**
 *
 * @author zzz
 */
public class Test2 {
    public static void main(String[] args) {
        Patient p = new Patient("Jack","Smith","School Age");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter VitalSignAttribute(RespiratoryRate,HeartRate,SystolicBloodPressure,WeightInKilos,WeightInPounds)");
        String VitalSignAttribute = sc.nextLine();
        System.out.println("Please Enter VitalSign");
        double VitalSign = sc.nextDouble();
        System.out.println(p.isThisVitalSignNormal(VitalSignAttribute, VitalSign));
    }

    
}
