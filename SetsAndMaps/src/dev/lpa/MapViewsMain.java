package dev.lpa;

import java.util.*;

public class MapViewsMain {

    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        /*
        using keySet() to get a view of the keys in the Map
        the set returned from the keySet() method is backed by the mao
        This means that changes to the map are reflected in set, and vice-versa
        can't use add() and allAll()
        */
        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

//        this puts the keys set in alphabetical order
        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");
        }

//        removing element from the map
        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(copyOfKeys);
        contacts.forEach((k, v) -> System.out.println(v));

//        using retainAll() to keep only a selected amount of keys (names) in the set
        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);

        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        /*
        in order to put the names back in the key views, we didn't have to manually add it back because the keySet() is backed by the Map.
        so any changes to the Map would affect the keySet
         */
        System.out.println(keysView);


        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));


        System.out.println("--------------------------------");
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println("--------------------------------");
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if(set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate Values are in my Map");
        }

        var nodeSet = contacts.entrySet();
        for (var node: nodeSet){
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())){
                System.out.println(node.getClass().getName());
                System.out.println("Key doesn't match name: " + node.getKey() + ": " + node.getValue());
            }
        }
    }
}
