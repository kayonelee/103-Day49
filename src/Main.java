public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500.00, "Kayone Lee");
        BankAccount accountTom = new BankAccount(5000.00, "Tommy Lee"); // CREATE ACCOUNT $5K
        BankAccount accountTim = new BankAccount(300.00, "Tim Lee"); // CREATE ACCOUNT $300

        account1.deposit(100.00);
        accountTom.withdrawal(100.00); // CREATE ACCOUNT WITHDRAWAL $100
        accountTim.deposit(100.00); // CREATE ACCOUNT DEPOSIT $100

        System.out.println();

        account1.AccountDetails(); //  ACCOUNT DETAIL FOR KAYONE ACCT1
        System.out.println();

        accountTom.AccountDetails(); //  ACCOUNT DETAIL FOR ACCOUNTTOM
        System.out.println();

        accountTim.AccountDetails(); //  ACCOUNT DETAIL FOR ACCOUNTTIM
        System.out.println();
    }
}
//Create a class with a main method where you instantiate a BankAccount object with 500 dollars. Deposit 100 dollars
// into the account and then print the account details to the console.