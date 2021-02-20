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
public class PersonDirectory {
    
    ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }
    
    public void addPerson(Person person){
        personList.add(person);
    }
    
    
    
}
