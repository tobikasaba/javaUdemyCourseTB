package dev.lpa.util;

import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList<S extends Student & QueryItem> {

    private List<S> items;

    public QueryList(List<S> items) {
        this.items = items;
    }

    /**
     * generic classes cant be used in a static method
     * i.e public static List<T> getMatches(List<T> items, String field, String value) throws an error
     * making this  a generic method allows you to make it static
     * The <T> used in this method is different from <T> in the generic class
     */
    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value) {

        List<T> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public List<S> getMatches(String field, String value) {

        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
