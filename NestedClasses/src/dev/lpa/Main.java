package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

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

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019,
                        "Target"),
                new StoreEmployee(10515, "Joe", 2021,
                        "Walmart"),
                new StoreEmployee(10105, "Tom", 2020,
                        "Macys"),
                new StoreEmployee(10215, "Marty", 2018,
                        "Walmart"),
                new StoreEmployee(10322, "Bud", 2016,
                        "Target")));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);
        /*
        Quick refresher on Comparison
        var james = new Employee(3, "James", 2004);

        var johnny = new Employee(35, "Johnny", 2008);

        EmployeeComparator compareName = new EmployeeComparator<>();

        System.out.println("After comparing names the name first is "+
                 compareName.compare(james, johnny));

         */

    }

    /**
     * In this context, "<? extends StoreEmployee>" is declaring a parameterized type that accepts a list of objects that are either of the type StoreEmployee or any subclass of StoreEmployee.
     * It allows you to pass a List of objects where the actual type could be a StoreEmployee or any class that extends or inherits from StoreEmployee.
     * It would not allow you to add elements to the "list" (via the add method) because the exact type of the list is not known, only that it's some type that extends StoreEmployee.
     *
     * @param list
     */
    public static void addPigLatinName(List<? extends StoreEmployee> list) {
/*
        last name is an effectively final variable. A local variable or a method argument are effectively final, if
        a value is assigned to them, and then never changed after that.
 */
        String lastName = "Piggy";


        /**
         * Access modifiers can't be used with Local Classes. If you were to add a "public" access moifier, it would throw an error
         */
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {

            private String pigLatinName;
            private Employee originalInstance;


            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }
//        if you pass null to the sort method on a list, it uses the comparable's sort to method
        newList.sort(null);
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
        }
    }
}
