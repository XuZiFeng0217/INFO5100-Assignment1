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
public class Community {
    
    ArrayList<House> houseList;

    public Community(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public Community() {
        houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    
    
    
    
}
