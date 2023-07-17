public class MinutesToYearsandDaysCalculator {

    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long days = (minutes/(1440)) % 365 ;
            long years = (minutes/1440) / 365;

            System.out.println(minutes + " min = " + years +
                    " y and " + days + " d");
        }
    }
}
