package dev.lpa.util;

import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList<S extends Student & QueryItem> extends ArrayList<S> {

//    private List<S> items;

    public QueryList() {
    }

    public QueryList(List<S> items) {
        super(items);
//        this.items = items;
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

    public QueryList<S> getMatches(String field, String value) {

        QueryList<S> matches = new QueryList<>();
        for (var item : this) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
