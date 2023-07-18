package dev.lpa;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return rightLink;
    }

    protected ListItem setNext(ListItem item) {
        this.rightLink = item;
        return rightLink;
    }

    @Override
    protected ListItem previous() {
        return leftLink;
    }

    protected ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return leftLink;
    }

    @Override
    protected int compareTo(ListItem item) {
        /**
         * here the super keyword is used to reference the object that calls the method
         * Some uses of the super key word are
         * it is a reference variable that is used to refer parent class objects.
         * it can be used to call parent class’ variables and methods
         * Hence when super is used it references the object that called the method
         */
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
