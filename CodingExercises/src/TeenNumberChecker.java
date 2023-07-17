public class TeenNumberChecker {

    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter){
        if (firstParameter >= 13 && firstParameter <=19 || secondParameter >=13 && secondParameter <=19
        || thirdParameter>=13 && thirdParameter <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen (int num) {
        if (num >= 13 && num <=19) {
            return true;
        }
        return false;
    }
}
