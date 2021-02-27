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
public class Test1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plear input the firstName");
        String firstName = sc.nextLine();
        System.out.println("Plear input the lastName");
        String lastName = sc.nextLine();
        System.out.println("Plear input the age range");
        String ageRange = sc.nextLine();
        if(!(ageRange.equals("Newborn")||ageRange.equals("Infant")||ageRange.equals("Toddler")||ageRange.equals("Preschooler")||ageRange.equals("School Age")||ageRange.equals("Adolescent"))){
            System.out.println("Please check your input!!");
            return;
        }
        //School Age
        Patient p = new Patient(firstName,lastName,ageRange);
        VitalSigns vitalSigns1 = new VitalSigns();
        VitalSigns vitalSigns2 = new VitalSigns();
        Util util = new Util();
        try{
            util.createVS(vitalSigns1); 
            util.createVS(vitalSigns2); 
        }catch(Exception e){
            System.out.println("Please check your input");
            return;
        }
        //add the new vital signs
        p.newVitalSign(vitalSigns1);
        p.newVitalSign(vitalSigns2);
        //print the vital signs history
        p.printVitalSignsHistory();
        //print the current vital signs
        System.out.println("current vital signs:"+ p.getCurrentVitalSigns());
        System.out.println(p.isPatientNormal(vitalSigns2));
        
        

    }
}
