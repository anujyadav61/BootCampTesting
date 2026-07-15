package bank;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super();
        accountType = AccountType.CHECKING;
    }

    public CheckingAccount(int balance, long accountNumber) {
        super(balance, accountNumber, AccountType.CHECKING);
    }

}