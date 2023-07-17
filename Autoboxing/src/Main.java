import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

//        Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);

        var ourList2 = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList2);

//        LinkedList<Integer> myIntegers = new LinkedList<Integer>();
    }

    private static ArrayList<Integer> getList(int... varargs) {

        // varargs represent a variable argument declaration for the int primitive. Meaning that it can be called 0 to many int values
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

//    private static ArrayList<Integer> getList2 (Integer... varargs) {
//
//        // varargs represent a variable argument declaration for the int primitive. Meaning that it can be called 0 to many int values
//        ArrayList<Integer> aList = new ArrayList<>();
//        for (int i : varargs) {
//            aList.add(i);
//        }
//        return aList;
//    }

    private static int returnAnInt(Integer i) {
//        this is unboxing
        return i;
    }

    private static Integer returnAnInteger(int i) {
//        this is boxing
        return i;
    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.00); // making it clear that we are returning an object of type Double

    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}