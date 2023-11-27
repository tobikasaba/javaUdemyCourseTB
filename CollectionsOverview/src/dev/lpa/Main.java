package dev.lpa;


import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Collection<String> list = new TreeSet<>();
        Collection<String> list = new HashSet<>();
        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};

        list.addAll(Arrays.asList(names));
        list.add("Fred");
        System.out.println(list);

        System.out.println("----------");
        list.add("Fred");
        list.addAll(Arrays.asList("Gorge", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println("----------");
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));
//        list.sort();
    }
}