package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(TaskData.getData("ann"));
        try{
            Set<Task> tasks = TaskData.getTasks("ann");
            sortAndPrint("All Tasks", tasks);
        } catch (Exception e){
            System.out.println("Error owners name not present try again");
        }
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {
        String lineSeperator = "_".repeat(90);
        System.out.println(lineSeperator);
        System.out.println(header);
        System.out.println(lineSeperator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }
}

