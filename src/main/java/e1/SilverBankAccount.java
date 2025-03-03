package e1;

public class SilverBankAccount extends AbstractBankAccount {
    private static final int FEE = 1;

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + FEE);
    }
}
