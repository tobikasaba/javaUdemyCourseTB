package dev.lpa;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contact {

    private String name;
    Set<String> emails = new HashSet<>();
    Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if (email != null) {
            emails.add(email);
        }
        if (phone != 0) {
//            String phoneToString = Long.toString(phone);
            String phoneToString = String.valueOf(phone);
            String phoneNumber = "(" + phoneToString.substring(0, 3) + ") " + phoneToString.substring(3, 6) + "-" + phoneToString.substring(6);
            phones.add(phoneNumber);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + emails + phones;
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }
}
