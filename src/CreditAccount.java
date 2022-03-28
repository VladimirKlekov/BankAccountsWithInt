public class CreditAccount extends Account{
    @Override
    public void pay(int amount) {
        balance -= amount;
        System.out.println(this + ". Совершен платеж в размере " + amount + " рублей.");
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Перевод не совершен. "  + this + " не поддерживает данную операцию.");
    }

    @Override
    public void addMoney(int amount) {

        balance += amount;
        System.out.println(this + ". Баланс пополнен на " + amount + " рублей.");

    }
}
