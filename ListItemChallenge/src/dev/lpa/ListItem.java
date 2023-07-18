package dev.lpa;


public abstract class ListItem {

    protected ListItem rightLink;

    protected ListItem leftLink;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    protected abstract ListItem next();

    protected abstract ListItem setNext(ListItem item);

    protected abstract ListItem previous();

    protected abstract ListItem setPrevious(ListItem item);

//    protected abstract ListItem compareTo();

    protected abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}