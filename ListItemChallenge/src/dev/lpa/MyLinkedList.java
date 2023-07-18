package dev.lpa;


public class MyLinkedList implements NodeList {


    private ListItem root;

    public MyLinkedList(ListItem root) {
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

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
