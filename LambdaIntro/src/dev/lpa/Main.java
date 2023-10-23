package dev.lpa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    /**
     * By default, records are implicitly static when used as an inner class just like enums and interfaces are.
     * This means that they can be accessed directly using in this example, the Main class if you wanted to create an instance of it outside the Mains class
     */
    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            StringBuilder fullName = new StringBuilder();
            fullName.append(firstName + " " + lastName);
            return fullName.toString();
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

//        using anonymous class
        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        /*
         *         people.sort(new Comparator<Person>() {
         *             @Override
         *             public int compare(Person o1, Person o2) {
         *                 return o1.lastName.compareTo(o2.lastName);
         *             }
         *         });
         */

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);


        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);
    }
}