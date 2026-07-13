package bank;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}