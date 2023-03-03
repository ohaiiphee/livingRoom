public class Account {
    public static void main(String[] args) {

        //Create a method that returns the account balance and has these parameters

        int years = 10;
        double investment = 2000;
        double interestRate = 0.025;

        //Write the account balance of every year to the console
        //How much money is in the account after 10 years if there is a starting wealth of 2.000€ and an interest rate of 2.5% per year?

        calculateAccountBalance(years, investment, interestRate);

    }

    public static double calculateAccountBalance(int years, double investment, double interestRate) {
        double accountBalance = investment;
        for (int i = 1; i <= years; i++) {
            accountBalance = accountBalance + (accountBalance * interestRate);
            System.out.println(accountBalance + "Euros in year " + i);
        }
        return accountBalance;
    }

}





