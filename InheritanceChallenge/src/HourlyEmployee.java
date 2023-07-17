public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    private double hoursWorked;

    public HourlyEmployee(String name, String birthDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }


    @Override
    public double collectPay() {
        hoursWorked = 40;
        return hoursWorked * hourlyPayRate;
    }

    public double getDoublePay(double hoursWorked) {
        if (hoursWorked > 40){
            System.out.println(name + " worked the required hours their pay is" ); return 2 * collectPay();
        }else{
            System.out.println("Employee didnt work enough hours. Pay remains the same");
            return collectPay();
        }

    }
}
