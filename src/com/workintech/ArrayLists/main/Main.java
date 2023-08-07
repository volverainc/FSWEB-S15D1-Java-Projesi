package com.workintech.ArrayLists.main;

import com.workintech.ArrayLists.mobile.Contact;
import com.workintech.ArrayLists.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("5550943212");
        phone.addNewContact(new Contact("Ahmet", "5550943212"));
        phone.printContact();
    }
}