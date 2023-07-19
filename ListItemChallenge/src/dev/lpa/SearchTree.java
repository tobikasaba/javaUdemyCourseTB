package dev.lpa;

public class SearchTree implements NodeList{
    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    private boolean performRemoval(ListItem itemOne, ListItem itemTwo) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
