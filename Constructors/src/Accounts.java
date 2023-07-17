public class Accounts {

    String inaccessible = "can't use me in static contexts!";

    public static void main(String[] args) {

        this.inaccessible
        Account bobsAccount = new Account();

        bobsAccount.setEmail("tobi");
        bobsAccount.withdrawingFunds(200);

    }


}
