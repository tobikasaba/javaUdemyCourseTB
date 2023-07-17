public class SwitchChallenge {

    public static void main (String[] args) {
        char switchValue =  'A';


        switch(switchValue) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            default:
                System.out.println("Letter" + switchValue + " was not found in the switch");
                break;
        }

//      enhanced switch statement of the above code
//        switch (switchValue) {
//            case 'A' -> System.out.println("Able");
//            case 'B' -> System.out.println("Baker");
//            case 'C' -> System.out.println("Charlie");
//            case 'D' -> System.out.println("Dog");
//            default -> System.out.println("Letter" + switchValue + " was not found in the switch");
//        }


//        System.out.println(NatoAlphabet(switchValue));
    }

//    using a method to write the switch code. This method is then called in the main class
//    public static String NatoAlphabet ( char switchValue) {
//        traditional switch code
//        switch(switchValue) {
//            case 'A':
//               return "A is Able";
//            case 'B':
//                return "B is Baker";
//            case 'C':
//                return "C is Charlie";
//            case 'D':
//                return " D is Dog";
//        }
//        return "Letter" + switchValue + " was not found in the switch";

//        enhanced switch code
//        return switch (switchValue) {
//            case 'A' -> "A is Able";
//            case 'B' -> "B is Baker";
//            case 'C' -> "C is Charlie";
//            case 'D' -> " D is Dog";
//            default -> "Letter" + switchValue + " was not found in the switch";
//        };
//
//        enhanced switch other format
//        return switch(switchValue) {
//
//        case 'A' -> "Able";
//        case 'B' -> "Baker";
//        case 'C' -> "Charlie";
//        case 'D' -> "Dog";
//        default -> {
//            String response = "Letter" + switchValue + " was not found in the switch";
//            yield response;
//        }
//        }
    }

