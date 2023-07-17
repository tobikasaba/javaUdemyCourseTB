public class Account {
    private int accountNumber;

    private double accountBalance;

    private String customerName;

    private String email;

    private String phoneNumber;

    private String customerEmail;


//        public Account() {
////        calling another constructor within this constructor.
////        this means if i call this constructor with no values in it you can use
////        the parameters from the previous constructor
////        this has to be the very first line in constructor
//            this(56789, 2.5, "Default name",
//                    "Default address", "Default phone");
//            System.out.println("Empty constructor called ");
//        }

    //    constructor
    public Account(int accountNumber, double accountBalance, String customerName,
                   String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
//      this is only required if the parameter in the constructor and the variable have the same name
        customerEmail = email;
    }

    public Account(String customerName, String email, String hisphoneNumber) {
        this(99999, 100.55, customerName, email, hisphoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void depositingFunds(double amount) {
        accountBalance += amount;
        System.out.println("You made a deposit of $" + amount +
                " Your new account balance is $" + accountBalance);
    }

    public void withdrawingFunds(double amount) {
        if ((accountBalance - amount) >= 0) {
            accountBalance -= amount;
            System.out.println("You made a withdrawal of $" + amount + "." +
                    " Your new account balance is $" + accountBalance);
        } else {
            System.out.println("Withdrawal of $" + amount +
                    " because your balance will be below $" + 0);
        }
    }
}
