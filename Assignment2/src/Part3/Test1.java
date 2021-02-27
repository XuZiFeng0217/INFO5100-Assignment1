/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;

/**
 *
 * @author zzz
 */
public class Test1 {
    
        public static void main(String[] args) {
        Patient p = new Patient("Jack","Smith","School Age");
        VitalSigns vitalSigns1 = new VitalSigns(19,100,110,70,120);
        VitalSigns vitalSigns2 = new VitalSigns(25,80,80,22,45);
        //add the new vital signs
        p.newVitalSign(vitalSigns1);
        p.newVitalSign(vitalSigns2);
        //print the vital signs history
        p.printVitalSignsHistory();
        //print the current vital signs
        System.out.println(p.getCurrentVitalSigns());
        System.out.println(p.isPatientNormal(vitalSigns2));
        
        

    }
    
}
