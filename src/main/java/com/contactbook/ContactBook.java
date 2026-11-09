package com.contactbook;
import java.util.List;
import java.util.ArrayList;

public class ContactBook {
    List<Contact> contactbook = new ArrayList<>();

    public  void addContact(Contact contact){
     contactbook.add(contact);
     System.out.println("Contact successfully added.");

    }

    public void removeContact(Contact contact){
        contactbook.remove(contact);
        System.out.println("Contact successfully removed.");
    }
    public void listAll(){
        for (Contact contact : contactbook){
            System.out.println(contact);
        }
    }

    public boolean searchContact(String name){
        for(Contact contact : contactbook){
            if(contact.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
