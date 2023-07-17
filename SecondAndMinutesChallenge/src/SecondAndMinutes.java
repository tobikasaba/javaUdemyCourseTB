public class SecondAndMinutes {

    public static String getDurationString(int seconds){
        if (seconds >= 0){
//            int hours = seconds / 3600;
            int minutes = ( seconds/ 60);
//            seconds = seconds - ((hours * 3600) + (minutes * 60));

//            return "The time is " +  hours + "h " + minutes + "m " + seconds + "s";
            return getDurationString(minutes, seconds);

        }else{
            return "This is an invalid value";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds > 0 && seconds <= 59)){
            int hours = minutes / 60;
            minutes = minutes % 60;
            return "The time is " +  hours + "h " + minutes + "m " + seconds + "s";
        }else{
            return "This is an invalid value";
        }
    }
}
