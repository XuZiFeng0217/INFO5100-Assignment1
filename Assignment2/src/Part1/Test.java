/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author zzz
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the FirstName");
        String firstName = sc.nextLine();
        System.out.println("Please input the LastName");
        String lastName = sc.nextLine();
        System.out.println("Please input the AgeGroup");
        String ageGroup = sc.nextLine();
        System.out.println("Please input the RespiratoryRate");
        double respiratoryRate = sc.nextDouble();
        System.out.println("Please input the HeartRate");
        double heartRate = sc.nextDouble();
        System.out.println("Please input the SystolicBloodPressure");
        double systolicBloodPressure = sc.nextDouble();
        System.out.println("Please input the WeightInKilos");
        double weightInKilos = sc.nextDouble();
        System.out.println("Please input the WeightInPounds");
        double weightInPounds = sc.nextDouble();
        Patient p = new Patient(firstName,lastName,ageGroup);
        VitalSigns vitalSigns = new VitalSigns(respiratoryRate,heartRate,systolicBloodPressure,weightInKilos,weightInPounds);
        System.out.println(p.isPatientNormal(vitalSigns));
    }
}
