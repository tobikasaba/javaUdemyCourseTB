package dev.lpa;

import java.util.HashSet;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }

    public void addEmail(String companyName) {

        String[] names = name.split("");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length - 1],
                companyName.replaceAll(" ", "").toLowerCase());
        if (!emails.add(email)) {
            System.out.println(name + " already has email " + email);
        } else {
            System.out.println(name + " now has email " + email);
        }
    }

    public void replaceEmailIfExists(String oldEmail, String newEmail) {

        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact = (Contact) o;
//        return getName().equals(contact.getName()) &&
//                Objects.equals(emails, contact.emails) &&
//                Objects.equals(phones, contact.phones);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), emails, phones);
//}
}
