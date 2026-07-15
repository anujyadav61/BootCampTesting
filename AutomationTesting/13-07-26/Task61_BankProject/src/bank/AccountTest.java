package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountTest {

    // Arrange - create an account using the no-argument constructor
    @Test
    public void testDepositUsingNoArgumentConstructor() {

        Account account = new Account();

        // Act
        account.deposit(10);

        // Assert
        assertEquals(10, account.getBalance());
    }

    // Arrange - create a checking account using the parameterized constructor
    @Test
    public void testCheckingAccountWithdraw() {

        CheckingAccount account = new CheckingAccount(0, 12345);

        // Act
        account.deposit(10);

        account.withdraw(20);

        // Assert
        assertEquals(-10, account.getBalance());
    }

    // Exception Test
    @Test
    public void testSavingsAccountException() {

        SavingsAccount account = new SavingsAccount();

        assertThrows(ArithmeticException.class, () -> {
            account.withdraw(10);
        });

    }

    // Parameterized Test
    @ParameterizedTest
    @CsvSource({
        "0,10",
        "5,5",
        "10,0"
    })
    public void testSavingsWithdraw(int withdrawAmount, int expectedBalance) {

        SavingsAccount account = new SavingsAccount();

        account.deposit(10);

        account.withdraw(withdrawAmount);

        assertEquals(expectedBalance, account.getBalance());

    }

}