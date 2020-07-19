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
import java.util.ArrayList;
public class MobilePhone {
        private String myNumber;
        private ArrayList<Contacts> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts =new ArrayList<Contacts>();
    }
        
   public boolean addNewContacts(Contacts contact)
   {
       if(findContact(contact.getName())>=0)
       {  System.out.println("Contact is already in file");
          return false;
       
                      
       }
     contacts.add(contact);
     return true;
   
   }
        
 private int findContact(Contacts contact)
         
 {   return this.contacts.indexOf(contact);
           
 
 
 }
 
 private int findContact(String contactName)
    
 {  
     for(int i=0;i<this.contacts.size();i++)
     {
       Contacts contact = this.contacts.get(i);
       if(contact.getName().equals(contactName))
       {
       
         return i;
       }
     
     } 
     return -1;
 
 
 }
 
 public boolean updateContact(Contacts oldcontact,Contacts newcontact)
 {  int oldPostion = findContact(oldcontact);
     if(oldPostion>=0)
     {
         this.contacts.set(oldPostion, newcontact);
         System.out.println(oldcontact.getName()+", was replaced with "+newcontact.getName());
         return  true;
     
     }
      
     System.out.println(oldcontact.getName()+" was not found ");
 
 
 
return false; }
 
 
 
 public String queryContact(Contacts contact)
 {  if (findContact(contact)>=0)
      { 
      return contact.getName();
      }
 
 
     return null;
}
 
public Contacts queryContact (String name)
{  int position = findContact(name);
  if (position>=0)
  {
   return this.contacts.get(position);
  }

return null;

}
 
 public boolean removeContact (Contacts contact)
 {
      int foundContact= findContact(contact);
       if(foundContact < 0)
       {
           System.out.println(contact.getName()+"was not found ");
           return  false;
       
       
       }
         
       this.contacts.remove(foundContact);
 
 
     System.out.println(contact.getName()+"was deleted "); 
     return  true;
 }
 
 
 public  void printContacts()
  
 {
     System.out.println("Contact List");
     for(int i=0; i< this.contacts.size();i++)
     { //System.out.println(contacts.isEmpty());
         System.out.println((i+1)+"."+
                       this.contacts.get(i).getName()+"==>"+
                        this.contacts.get(i).getPhoneNo());
      
     }
   
 
 
 }
 
 
}
