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

    protected abstract void next();

    protected abstract void setNext();

    protected abstract void previous();

    protected abstract void setPrevious();

    protected abstract void compareTo();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}