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
       
        VitalSigns vitalSigns = new VitalSigns();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the FirstName");
        String firstName = sc.nextLine();
        System.out.println("Please input the LastName");
        String lastName = sc.nextLine();
        System.out.println("Please input the AgeGroup");
        String ageGroup = sc.nextLine();
        if(!(ageGroup.equals("Newborn")||ageGroup.equals("Infant")||ageGroup.equals("Toddler")||ageGroup.equals("Preschooler")||ageGroup.equals("School Age")||ageGroup.equals("Adolescent"))){
            System.out.println("Please check your input!!");
            return;
        }
        Util util = new Util();
        try{
            util.createVS(vitalSigns); 
        }catch(Exception e){
            System.out.println("Please check your input");
            return;
        }
        Patient p = new Patient(firstName,lastName,ageGroup);    
        System.out.println(p.isPatientNormal(vitalSigns));
    }
}
