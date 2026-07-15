package bank;

import java.util.ArrayList;

public class AccountCollection {

    public void anArrayOfAccounts() {

        Account[] accounts = new Account[3];

        accounts[0] = new Account(100, 1001, AccountType.CHECKING);
        accounts[1] = new Account(200, 1002, AccountType.SAVINGS);
        accounts[2] = new Account(300, 1003, AccountType.CHECKING);

        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    public void aListOfAccounts() {

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(400, 2001, AccountType.CHECKING));
        accounts.add(new Account(500, 2002, AccountType.SAVINGS));
        accounts.add(new Account(600, 2003, AccountType.CHECKING));

        for (Account account : accounts) {
            System.out.println(account);
        }

    }

}