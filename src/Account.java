public abstract  class Account {

    protected int balance;

    public Account() {

    }

    public int getMany() {
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    @Override
    public String toString() {
        return "Счет " + getClass().getSimpleName();
    }
}
