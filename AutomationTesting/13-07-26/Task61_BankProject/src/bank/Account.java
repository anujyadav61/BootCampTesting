package bank;

public class Account {

    protected int balance;
    protected long accountNumber;
    protected AccountType accountType;

    // No-Argument Constructor
    public Account() {
        this.balance = 0;
        this.accountNumber = 12345;
        this.accountType = AccountType.CHECKING;
    }

    // Parameterized Constructor
    public Account(int balance, long accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // Get Balance
    public int getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(int amount) {
        balance += amount;
    }

    // Withdraw
    public void withdraw(int amount) {

        if (accountType == AccountType.SAVINGS && balance - amount < 0) {
            throw new ArithmeticException("Cannot overdraw from Savings Account");
        }

        balance -= amount;
    }

    @Override
    public String toString() {

        return "The account with number " + accountNumber
                + " is of type '" + accountType
                + "' and has a balance of " + balance;
    }

}