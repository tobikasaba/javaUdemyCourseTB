package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:" + (int) 'A' + " " + "a:" + (int) 'a');
        System.out.println("B:" + (int) 'B' + " " + "b:" + (int) 'b');
        System.out.println("P:" + (int) 'P' + " " + "p:" + (int) 'p');

        Student tobs = new Student("Tobi");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        Arrays.sort(students);
        /*
        this is not going to work because the class has to be derived from comparable. Meaning it has to implement comparable,
        or an interface that extends comparable
        */
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tobs.compareTo(new Student("TOBI")));
    }
}

class Student implements Comparable<Student> {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * This method takes an argument of type Object, which means it can compare the current object (of type Student) with any other object.
     * When called, the compareTo method compares the "name" of the object calling the method to the "name" paramter passed inside the method.
     * The difference between this and the commented compareTo method below is, this method already uses references the Student class as the type of its parameter
     * Hence we don't need to cast the parameter to the Student class anymore.
     *
     * @param o the object to be compared.
     * @return comparison of the two objects
     */
    @Override
    public int compareTo(Student o) {
        /*
         * This line performs the actual comparison based on the name property of the Student objects. It calls the compareTo method of the String class (since name is assumed to be a String) to compare the names of the two Student objects.
         * If the name of the current Student object is lexicographically less than other.name, it returns a negative integer.
         * If the name of the current Student object is lexicographically greater than other.name, it returns a positive integer.
         * If the name of both Student objects is the same, it returns 0, indicating that they are considered equal in terms of ordering.*/
        return name.compareTo(o.name);
    }
    /*
    @Override
    public int compareTo(Object o) {
         // Here, the Object argument o is explicitly cast to a Student object, assuming that the object being compared is indeed an instance of the Student class.
         // This is done to access the name property of the Student objects for comparison.
        Student other = (Student) o;
        return name.compareTo(other.name);
    }*/
}