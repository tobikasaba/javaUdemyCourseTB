package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.EmployeeComparator;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static void main(String[] args) {
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

//      uses the top level employee comparator
        var c0 = new EmployeeComparator<StoreEmployee>();
//      uses static nested class on employee class
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
//       uses the inner class on store employee. This creates an instance of store employee first then uses that to create an instance of StoreComparator
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

//      Using local class
        class NameSort<T> implements Comparator<StoreEmployee> {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c3 = new NameSort<StoreEmployee>();
/*
    Using anonymous class
    Comparator is an interface and can't be instantiated proof that this isn't an object but rather a class
    It also has curly braces which is used to write class body

 */
        var c4 = new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    /**
     * @param list       list of
     * @param comparator "Comparator<? super T>" It means that the method expects a Comparator that can compare objects of type T or any superclass of T.
     *                   This is useful because it allows you to provide comparators that work on a wider range of types, making the method more flexible.
     * @param <T>
     */

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for (var employee : list) {
            System.out.println(employee);
        }
    }
}
