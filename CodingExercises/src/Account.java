public class Account {

//    public ClassChallenge.Account Account;
//
//    public void main(String[] args) {
//
//        Account bobsAccount = new Account();
//
//        bobsAccount.setEmail("tobi");
//        bobsAccount.withdrawingFunds(200);
//
//    }

    //    public class Account {
    private int accountNumber;

    private double accountBalance;

    private String customerName;

    private String email;

    private String phoneNumber;

    private String customerEmail;

    public Account() {
        System.out.println("empty constructor called");
    }

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

//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setAccountBalance(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int setAccountNumber() {
//        return accountNumber;
//    }


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
//}
