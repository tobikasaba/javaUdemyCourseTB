public class Main {

    public static void main(String[] args) {
//        int value = 1;
//
//        if (value == 1) {
//            System.out.println("Value was 1");
//
//        } else if ( value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");

            // testing for multiple cases
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        int day = 7;

        DayOfTheWeekChallenge.printDayOfTheWeek(day);
        DayOfTheWeekChallenge.printWeekDay(day);
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st"; // eg -> {yield "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
//                yield is a keyword introduce for switch to return a value back.
//                it has to be in a code block in order for it to work
            }
        };

    }


}