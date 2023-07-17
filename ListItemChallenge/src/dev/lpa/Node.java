package dev.lpa;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    protected void next() {
        return rightLink;
    }

    @Override
    protected void setNext() {

    }

    @Override
    protected void previous() {

    }

    @Override
    protected void setPrevious() {

    }

    @Override
    protected void compareTo() {

    }
}
