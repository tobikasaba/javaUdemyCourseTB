package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}
public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        students.add(new LPAStudent());

//        printList(lpaStudents);
        printMoreList(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));
//        testList(new ArrayList<Object>(List.of(1,"Barry",3)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreList(matches);

        var students2021 = QueryList.getMatches(students,
                "YearStarted", "2021");
        printMoreList(students2021);

//        var students2021 = QueryList.<Student>getMatches(new ArrayList<>(),
//                "YearStarted", "2021");
//        printMoreList(students2021);

//        QueryList<Employee> employeeList = new QueryList<Employee>();

    }

    /**
     * This is a wildcard syntax in Java and is represented by a question mark
     *
     * @param students
     */
    public static void printMoreList(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {

        for (var element : list) {
            if (element instanceof String stringElement) {
                System.out.println("String: " + stringElement.toUpperCase());
            } else if (element instanceof Integer) {
                Integer i = (Integer) element;
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list) {
//
//        for (var element : list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer> list) {
//
//        for (var element : list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }
//    public static <T extends Student> void printList(List<T> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}