public class Main {
    public static void main(String[] args) {

        Printer hpEnvy = new Printer(99, true);

        System.out.println(hpEnvy.addToner(2));
        System.out.println("page count " + hpEnvy.getPagesPrinted());

        int pagesPrinted = hpEnvy.printPages(5);
        System.out.printf("Current Job Pages %d, Printer total: %d %n", pagesPrinted,
                hpEnvy.getPagesPrinted());

        pagesPrinted = hpEnvy.printPages(10);
        System.out.printf("Current Job Pages %d, Printer total: %d %n", pagesPrinted,
                hpEnvy.getPagesPrinted());

        System.out.println("Its " + 5/2);
    }


}