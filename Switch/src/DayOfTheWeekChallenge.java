public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek ( int day) {

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield "an Invalid Day";

        }
//        return switch(day) {
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Wednesday";
//            case 3 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            default -> {
//                yield "Invalid Day";
//            }
        };

        System.out.println("When the day is " + day + " its " + dayOfWeek);
    }

    public static void printWeekDay (int day) {

        String dayOfTheWeek = null;

        if (day == 0) {
            dayOfTheWeek = "Sunday";
        } else if ( day ==  1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        }else if (day == 3){
            dayOfTheWeek = "Wednesday";
        } else if ( day == 4) {
            dayOfTheWeek = "Thursday";
        } else if ( day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        }else{
            dayOfTheWeek = "an Invalid Day";
        }



        System.out.println("The number " + day + " stands for " + dayOfTheWeek);
    }

}
