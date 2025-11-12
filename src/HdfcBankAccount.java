public class HdfcBankAccount implements BankAccount {
    private int balance;

    public HdfcBankAccount(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if (balance >= money) {
            this.balance -= money;
            return true;
        }

        return false;
    }
}
