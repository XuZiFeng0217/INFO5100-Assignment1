/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.ArrayList;

/**
 *
 * @author zzz
 */
public class CalculateSystem {
    PatientDirectory patienetDirectory;
    PersonDirectory personDirectory;
    City city;

    public PatientDirectory getPatienetDirectory() {
        return patienetDirectory;
    }

    public void setPatienetDirectory(PatientDirectory patienetDirectory) {
        this.patienetDirectory = patienetDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public int  calculate(Community community){
        ArrayList<House> houseList  = community.getHouseList();
        int num = 0;
        for(House s : houseList){
            Patient patient = new Patient();
            for(int i=0;i<s.getPersonList().size();i++){
              Person p = s.getPersonList().get(i);
              if(!patient.isThisVitalSignNormal("systolicBloodPressure", p.getCurrentVitalSigns().getSystolicBloodPressure(),p)){
                num++;
            }
            }

        }
        return num;
    }
}
