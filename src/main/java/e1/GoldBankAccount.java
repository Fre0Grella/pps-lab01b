package e1;

public class GoldBankAccount implements BankAccount {
    private int fee = 0;

    private final CoreBankAccount base = new CoreBankAccount();

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + fee);
    }
}
