package bank;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
        accountType = AccountType.SAVINGS;
    }

    public SavingsAccount(int balance, long accountNumber) {
        super(balance, accountNumber, AccountType.SAVINGS);
    }

}