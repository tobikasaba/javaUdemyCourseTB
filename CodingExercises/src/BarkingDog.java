public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay >= 0 && hourOfDay <=23) {
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            }
        }
    //        alternatively, you can just leave at this
    //        return barking && (hourOfDay < 8 || hourOfDay > 22);
//        return false;
        return false;
    }
}
