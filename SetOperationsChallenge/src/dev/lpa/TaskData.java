package dev.lpa;

import java.util.*;

public class TaskData {

    private static String tasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    private static String annsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium, In Progress
            Research, Cloud solutions, Medium, In Progress
            Data Design, Encryption Policy, High
            Data Design, Project Table, Medium
            Data Access, Write Views, Low, In Progress
            """;

    private static String bobsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low, In Progress
            """;

    private static String carolsTasks = """
            Infrastructure, Logging, High, In Progress
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task> getTasks(String owner) {

        Set<Task> taskList = new HashSet<>();

//        String taskOwner = switch (owner.toLowerCase()) {
//            case "all" -> tasks;
//            case "ann" -> annsTasks;
//            case "bob" -> bobsTasks;
//            case "carol" -> carolsTasks;
//            default -> null;
//        };

        String user = ("ann,bob,carol".contains(owner.toLowerCase())) ? owner : null;

        String selectedList = switch (owner.toLowerCase()) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> tasks;
        };

        for (String taskData : selectedList.split("\n")) {
            String[] data = taskData.split(",");
            Arrays.asList(data).replaceAll(String::trim);

            Status status = (data.length <= 3) ? Status.IN_QUEUE : Status.valueOf(data[3]
                    .toUpperCase().replace(' ', '_'));
            Priority priority = Priority.valueOf(data[2].toUpperCase());
            taskList.add(new Task(owner, data[0], data[1], status, priority));
        }
        return taskList;
        /*
        if (owner.equals("All")) {
            List<String> taskArray = new ArrayList<>(List.of(tasks.split("\n")));
            taskList.addAll(taskArray);
        } else if (owner.equals("Anns")) {
            List<String> taskArray = new ArrayList<>(List.of(annsTasks.split("\n")));
            taskList.addAll(taskArray);
        } else if (owner.equals("Bob")) {
            List<String> taskArray = new ArrayList<>(List.of(bobsTasks.split("\n")));
            taskList.addAll(taskArray);
        } else if (owner.equals("Carol")) {
            List<String> taskArray = new ArrayList<>(List.of(carolsTasks.split("\n")));
            taskList.addAll(taskArray);
        }
         */
    }
}