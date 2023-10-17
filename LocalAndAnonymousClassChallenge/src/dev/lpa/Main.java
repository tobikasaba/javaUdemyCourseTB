package dev.lpa;

import dev.lpa.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> listOfEmployees = new ArrayList<>(List.of(
                new Employee("John", "Travolta", "10/05/2016"),
                new Employee("Mary", "Jane", "13/03/2013"),
                new Employee("Hary", "Potter", "20/02/2015")
        ));

        processEmployees(listOfEmployees, "name");
        System.out.println();
        processEmployees(listOfEmployees, "year");
    }

    public static void processEmployees(List<Employee> eList, String sortField) {

        class MyEmployee {

            Employee containedEmployee;
            String fullName;
            int yearsWorked;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                this.fullName = containedEmployee.firstName() + " " + containedEmployee.lastName();
                this.yearsWorked = LocalDate.now().getYear() - Integer.parseInt(
                        containedEmployee.hireDate().split("/")[2]);
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(
                        fullName, yearsWorked);
            }
        }
        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : eList) {
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {

                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (MyEmployee myEmployee : list) {
            System.out.println(myEmployee);
        }
    }
}