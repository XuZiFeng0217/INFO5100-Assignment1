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
public class EcounterHistory {
    
    ArrayList<Ecounter> encounteList;

    public EcounterHistory() {
        encounteList = new ArrayList<Ecounter>();
    }
    
    public void addEcounter(Ecounter ecounter){
        encounteList.add(ecounter);
    }
    
    
    
}
