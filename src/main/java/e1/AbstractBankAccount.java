package e1;

public abstract class AbstractBankAccount implements BankAccount {

    protected final CoreBankAccount base = new CoreBankAccount();

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        base.deposit(amount);
    }

    @Override
    public abstract void withdraw(int amount);
}
