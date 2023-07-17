public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
    }
    public static boolean isLeapYear (int year){
        if (year >= 1 && year <=9999){
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true;
                    }
                }else{
                    return true;

                }
            }

        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999 )) {
            return -1;
        } else if (isLeapYear(year) == true) {
            return switch (month) {
                case 2 -> 29;
                default -> -1;
            };
        } else {
             return switch (month) {
                 case 1, 3, 5, 7, 8, 10 -> 31;
                 case 4, 6, 9, 11 -> 30;
                 default -> 28;
                     };
        }

    }
}
