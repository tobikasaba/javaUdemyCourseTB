package dev.lpa;

import jdk.jshell.spi.SPIResolutionException;

import java.sql.SQLOutput;
import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
//        Comparator<Contact> mySort = (contact1, contact2) -> contact1.getName().compareTo(contact2.getName());
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        /*
        fullList is a list that contains elements 'phone' of type Contact.
        sorted is a NavigableSet of Contact objects with a specified comparator (mySort), and I am using the same comparator to sort the fullList.
        The sort method of the List interface in Java is being used here. It sorts the elements of the list according to their natural order or using a specified comparator.
        In this scenario, sorted.comparator() provides the comparator associated with the sorted set, which, is Comparator.comparing(Contact::getName).
        This comparator compares Contact objects based on their names.
        fullList.sort(sorted.comparator()) sorts the elements in fullList using the comparator obtained from the sorted set.
        The result is that the fullList is now sorted based on the names of the Contact objects.

        In summary, it is sorting fullList using the same order I used to sort the sorted NavigableSet,
         */
        fullList.sort(sorted.comparator());
        System.out.println("----------------------------");
        fullList.forEach(System.out::println);

//      a, this block of code has the same function as b
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());
//      b
        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("--------------------------------");
        System.out.printf("min = %s, first = %s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last = %s %n", max.getName(), last.getName());
        System.out.println("------------------------------------");


        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());
        copiedSet.forEach((System.out::println));
        System.out.println("--------------------------------------");
    }
}

