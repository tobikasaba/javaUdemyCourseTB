public class Main {
    public static void main(String[] args) {
        Worker joe = new Worker("Joe", "06/11/1996");

        joe.terminate("10/03/2034");

        System.out.println(joe);


        Employee tim = new Employee("Tim", "06/11/1996",
                "20/06/2025");
        System.out.println(tim);


        SalariedEmployee tayo = new SalariedEmployee("Tayo", "16/05/1990",
                "20/06/2025", 32000.00);

        System.out.println(tayo);
        System.out.println("Tayo's paycheck = $" + tayo.collectPay());
//        calling this makes the retirement true
        tayo.retire();
        System.out.println("Tayo's pension = $" + tayo.collectPay());

        System.out.println();
        HourlyEmployee simi = new HourlyEmployee("Simi", "03/01/1986", "20/12/2030", 15);
        System.out.println(simi);
        System.out.println("Simi's pay is $" + simi.collectPay());
        System.out.println(simi.getDoublePay(50));


    }


}