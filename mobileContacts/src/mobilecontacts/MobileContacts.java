/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecontacts;

import java.util.Scanner;

/**
 *
 * @author esraasalah
 */
public class MobileContacts {

    /**
     * @param args the command line arguments
     */
     private static Scanner scanner = new Scanner(System.in);
     private static MobilePhone mobilePhone = new MobilePhone("0111 26 333 60");
    public static void main(String[] args) {
        // TODO code application logic here
        boolean quit = false;
        startPhone();
        printActions();
        
        while (!quit) {     
            System.out.println("\n Enter Action :(6 to show the actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch(action){
                case 0:
                    System.out.println("\n Quit");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                  break;
                case 2:
                    addNewContact();
                    break;
                case 3 :
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                
            
            
            
            
            }
            
        }
        
       
    }
    
    
    private static void startPhone()
    {
        System.out.println("Starting Phone ");
    
    
    }
    
    private static  void printActions()
    {
    
        System.out.println("\n Available Actions \n Press");
        System.out.println("0 - to quit\n"
                + "1- to print Contacts\n"
                + "2- to add a new Contact\n"
                + "3- to update existing contacts\n"
                + "4-to remove contact\n"
                + "5- query if a contact exists"
                + "6- to print a list of avaliable actions");
        
        System.out.println(" Choose your actions: ");
    
    
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name :");
        String name =scanner.nextLine();
        System.out.println(" Enter phone number:");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone.addNewContacts(newContact))
        {
            System.out.println("New Contact added: name ="+ name +"phone ="+phone);
            
        }
        
        else
        {
        
            System.out.println("Cannot add "+ name+" already on file");        
        }
    
    }

    private static void updateContact() {
     System.out.println("Enter existing contact name ");
      String name =scanner.nextLine();
      Contacts exsitingContact = mobilePhone.queryContact(name);
      if(exsitingContact == null)
      {
          System.out.println("contact not found");
      
       return ;}
      
      else{
          System.out.println("Enter new Contant name");
          String newName = scanner.nextLine();
          System.out.println("Enter new Contact phone");
          String newPhone = scanner.nextLine();
          Contacts newContact = Contacts.createContact(newName, newPhone);
          if(mobilePhone.updateContact(exsitingContact, newContact))
          {
              System.out.println(" Updated");
          
          }
          
          else
          {
              System.out.println("Eroor while updating");
          
          }
      
      }
      
    }

    private static void removeContact() {
         System.out.println("Enter existing contact name ");
      String name =scanner.nextLine();
      Contacts exsitingContact = mobilePhone.queryContact(name);
      if(exsitingContact == null)
      {
          System.out.println("contact not found");
      
       return ;}
        if( mobilePhone.removeContact(exsitingContact))
        { System.out.println("Successfully deleted");
        
        
        }
        else
        {
            System.out.println("Error deleting  contact ");
        
        }

    }

    private static void queryContact() {
        
          System.out.println("Enter existing contact name ");
      String name =scanner.nextLine();
      Contacts exsitingContact = mobilePhone.queryContact(name);
      if(exsitingContact == null)
      {
          System.out.println("contact not found");
      
       return ;}
      
        System.out.println("Name:" + exsitingContact.getName()+"Phone number"+exsitingContact.getPhoneNo());
    }
    
}
