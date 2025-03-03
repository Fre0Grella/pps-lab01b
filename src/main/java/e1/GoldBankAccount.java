package e1;

public class GoldBankAccount extends AbstractBankAccount {
    private static final int FEE = 0;
    private static final int OVER_DRAFTUP_LIMIT = 500;

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() + OVER_DRAFTUP_LIMIT < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + FEE);
    }
}
