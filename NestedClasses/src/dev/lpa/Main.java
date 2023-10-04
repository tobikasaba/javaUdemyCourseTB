package dev.lpa;

import dev.lpa.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)));

//        System.out.println(employees);

        /*
        var comparator = new EmployeeComparator<>();
        employees.sort(comparator);
        this comparator is accessed through the employee class
        similar to " employees.sort(comparator);", once you call the comparator, you're telling java to use the logic you used
        in the EmployeeComparator to be used here. That is, sorting based on that logic
 */
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

        /*
        Quick refresher on Comparison
        var james = new Employee(3, "James", 2004);

        var johnny = new Employee(35, "Johnny", 2008);

        EmployeeComparator compareName = new EmployeeComparator<>();

        System.out.println("After comparing names the name first is "+
                 compareName.compare(james, johnny));

         */
    }
}