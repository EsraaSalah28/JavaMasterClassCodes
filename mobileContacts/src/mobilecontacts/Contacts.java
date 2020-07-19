/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecontacts;

/**
 *
 * @author esraasalah
 */
public class Contacts {
    
    String name;
    String phoneNo;

    public Contacts(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    
    public static Contacts createContact(String name ,String phoneNo)
    {
    
      return new Contacts(name,phoneNo);
    
    }
    
}
