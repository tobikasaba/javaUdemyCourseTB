package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

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

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.print(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {
    private static final Random random = new Random();
    private static int LAST_ID = 1000;
    protected int id;
    protected double gpa;
    String name;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    /**
     * This method takes an argument of type Object, which means it can compare the current object (of type Student) with any other object.
     * One of the differences between this and the commented compareTo method below is, this method already uses references the Student class as the type of its parameter.
     * Hence, we don't need to cast the parameter to the Student class anymore.
     *
     * @param o the object to be compared.
     * @return comparison of the two objects
     */
    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
//        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
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