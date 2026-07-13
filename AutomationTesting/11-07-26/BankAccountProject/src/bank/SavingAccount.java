package bank;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance -= amount;
    }
}