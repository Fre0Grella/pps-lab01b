package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends BankAccountTest {

    @Override
    @BeforeEach
    void init() {
        account = new GoldBankAccount();
    }

    @Override
    @Test
    public void testCanWithdraw() {
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(800, this.account.getBalance());
    }

    @Test
    public  void testCanWithdrawMoreThanBalance() {
        this.account.deposit(1000);
        this.account.withdraw(1200);
        assertEquals(-200, this.account.getBalance());
    }

    @Override
    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1600));
    }
}
