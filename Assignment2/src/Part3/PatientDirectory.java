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
public class PatientDirectory {
    ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }
    
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    
    
    
}
