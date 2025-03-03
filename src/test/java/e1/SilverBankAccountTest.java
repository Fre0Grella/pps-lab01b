package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends BankAccountTest{
    @Override
    @BeforeEach
    void init() {
        this.account = new SilverBankAccount();
    }

    @Override
    @Test
    public void testCanWithdraw() {
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(799, this.account.getBalance());
    }

    @Override
    @Test
    public void testCannotWithdrawMoreThanAvailable() {
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1200));
    }
}
