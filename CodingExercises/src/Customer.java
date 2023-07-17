public class Customer {

    private String name;

    private double creditLimit;

    private String emailAddress;


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("nobody","nobody@gmail.com");
        System.out.println("checking Tobi");
    }

    public Customer(String name, String emailAddress) {
        this(name,100, emailAddress);
        System.out.println("checking tammy");
    }

}
