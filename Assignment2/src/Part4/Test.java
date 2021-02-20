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
public class Test {
    
    public static void main(String[] args) {
        VitalSigns vitalSigns1 = new VitalSigns(100,15,81,15,15);
        VitalSigns vitalSigns2 = new VitalSigns(150,15,140,15,15);
        VitalSigns vitalSigns3 = new VitalSigns(151,15,61,15,15);
        VitalSigns vitalSigns4 = new VitalSigns(60,15,119,15,15);
        Person person1 = new Person("Jack","Smith","Preschooler",vitalSigns1);
        Person person2 = new Person("Mary","Han","Newborn",vitalSigns2);
        Person person3 = new Person("Henry","Li","Infant",vitalSigns3);
        Person person4 = new Person("Blank","Cao","School Age",vitalSigns4);
        ArrayList<Person> personList1  = new  ArrayList<Person>();
        ArrayList<Person> personList2  = new  ArrayList<Person>();
        personList1.add(person1);
        personList1.add(person2);
        personList2.add(person3);
        personList2.add(person4);
        House house1 = new House(personList1);
        House house2 = new House(personList2);
        ArrayList<House> houseList1 = new ArrayList<House>();
        ArrayList<House> houseList2 = new ArrayList<House>();
        houseList1.add(house1);
        houseList2.add(house2);
        Community c1 = new Community(houseList1);
        Community c2 = new Community(houseList2);
        CalculateSystem calculate = new CalculateSystem();
        System.out.println(calculate.calculate(c1));
        System.out.println(calculate.calculate(c2));
        
    }
    
}
