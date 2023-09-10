package dev.lpa;

import java.util.ArrayList;
import java.util.List;

class Layer<T extends Mappable> {

    private List<T> elementsList;

    /*
     *
     * @param elementsList This constructor makes an already created list become the element list
     *                     a better method would be to pass an array into the constructor
     */
//    public Layer(List<T> elementsList) {
//        this.elementsList = elementsList;
//    }

    /**
     * @param elementsArray This on the other passes an array as the parameter of the method
     *                      and the array is then added to the elementsList.
     */
    public Layer(T[] elementsArray) {
        this.elementsList = new ArrayList<>(List.of(elementsArray));
    }

    /**
     * This method uses varags by implementing "..."
     * Varargs help us avoid writing boilerplate code by introducing the new syntax that can handle an arbitrary number of parameters automatically – using an array under the hood.
     * So even if it does explicitly specify that its an array, it allows you to put in unlimited parameters or none at all and automatically groups it into an array.
     * This is why to add the elements to the list, we make use of "elementsList.addAll(List.of(elements))"
     * @param elements
     */
    public void addElementToList(T... elements) {
        elementsList.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (var element : elementsList) {
            element.render();
        }
    }
}
