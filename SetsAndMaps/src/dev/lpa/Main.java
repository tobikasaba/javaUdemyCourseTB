package dev.lpa;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);


        int index = emails.indexOf(new Contact(("Robin Hood")));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("Rd@sherwoodforest.com", "Rd@sherwoodforest.org");
        System.out.println(robinHood);

        /*
        combines the email list and the phone list excluding all duplicates
         */
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        /*
        includes the elements that are present in both the email and phones list
        the email list takes presence since the hashset was created using it
        */
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) with phones (B)", intersectAB);

        /*
        this includes the elements that are in the email list that aren't in the phones list
        the email list takes presence since the hashset was created using it
        */
        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)", AMinusB);

        Set<Contact> BMinusA = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(B - A) phones (B) - emails (A)", BMinusA);

        /*
        Set symmetric difference are all elements that don't intersect
         */
        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric Difference: phones and emails", symmetricDiff);


        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectAB);
        printData("Symmetric Difference: phones and emails", symmetricDiff2);
    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-----------------------------");
        System.out.println(header);
        System.out.println("-----------------------------");
        contacts.forEach(System.out::println);
    }
}