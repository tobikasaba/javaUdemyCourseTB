package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("emails");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("--------------------------------");

        Map<String, Contact> contacts = new HashMap<>();

        for (Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }

        System.out.println("--------------------------------");
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("--------------------------------");
//      using the key to print out a value from the Map. This uses the get method in the Map interface.
        System.out.println(contacts.get("Charlie Brown"));

//        when a key isnt present in a Map, you get null
        System.out.println(contacts.get("Chuck Brown"));

        /*
        The getOrDefault(key, defaultValue) is designed to get the value corresponding to the key in the HashMap.
        If there is a value associated with the key, then that value is returned.
        On the other hand, if the value is not available, then the defaultValue passed as a parameter to this method is returned
        Hence, Chuck Brown is never added to the contacts Map.
         */
        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("--------------------------------");
        contacts.clear();
        for (Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("--------------------------------");
        contacts.clear();

        for (Contact contact : fullList) {
            /*
             * putIfAbsent won't put an updated element if it already finds a value in place for the key
             * Hence it only works if the key is absent in the Map
             */
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("--------------------------------");
        contacts.clear();

        for (Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if (duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("--------------------------------");
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
//                (previous, current) -> previous.mergeContactData(current)
                Contact::mergeContactData
                /*
                {
                System.out.println("prev: " + previous + " : current " + current);
                Contact merged = previous.mergeContactData(current);
                System.out.println("merged: " + merged);
                return merged;
                }
                 */
        ));
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));
    }
}
