package e1;

public class BronzeBankAccount extends AbstractBankAccount {

    @Override
    public void withdraw(int amount) {
        int fee = 1;
        if (amount < 100) {
            fee = 0;
        }
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + fee);
    }
}
