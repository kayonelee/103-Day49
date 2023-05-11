import java.text.DecimalFormat; //formatting to two decimal places

public class BankAccount {
    private double balance;
    private String accountHolder;

    ////    CONSTRUCTOR-Create a constructor that can accept both attributes as the parameters.
    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    ////METHOD 1-DEPOSIT-NO RETURN-ADD TO ACCT BAL
    public void deposit(double amount) {
        balance += amount;
    }

    ////METHOD 2-WITHDRAWAL-NO RETURN-SUBTRACT FROM ACCT BAL
    public void withdrawal(double amount) {
        balance -= amount;
    }

    ////METHOD 3- ACCOUNT DETAILS-NO PARAMETERS-NO RETURNS. PRINT AS FOLLOWED
    public void AccountDetails() {
        DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");
        String formattedBalance = currencyFormat.format(balance);
        System.out.println("Name of Account: " + accountHolder);
        System.out.println("Current Balance: " + formattedBalance);
    }
}