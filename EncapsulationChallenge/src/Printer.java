public class Printer {

    private int tonerLevel;

    private int pagesPrinted;

    private boolean duplex;

//    public Printer(int tonerLevel, boolean duplex) {
//        this(tonerLevel, 200, duplex);
//        this.tonerLevel = tonerLevel;
//        this.duplex = duplex;
//    }

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > 100) {
            System.out.println("The toner level cant be above 100% please set it again");
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


    public int addToner(int tonerAmount) {
        if (tonerAmount <= 100 && tonerAmount > 0) {
            if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0) {
                return -1;
            } else {
                return tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        if (duplex) {
            pagesPrinted = (pages / 2);
        } else {
            pagesPrinted = pages;
        }
        return pagesPrinted;

//        int jobPages = (duplex) ? (pages%2) + (pages % 2) : pages;
//        pagesPrinted += jobPages;
//        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
