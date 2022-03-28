public class CheckingAccount extends Account{
    @Override
    public void pay(int amount) {
        if (balance >= amount) {
            balance-=amount;
            System.out.println(this + ". Совершен платеж в размере " + amount + " рублей.");
        }else{
            System.out.println("На счете недостаточно денег");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            account.addMoney(amount);
            balance -= amount;
            System.out.println(this + ". С баланса переведено " + amount + " рублей.");
        } else {
            System.out.println("На счете недостаточно денег");
        }
    }

    @Override
    public void addMoney(int amount) {
        balance+=amount;
        System.out.println(this + ". Баланс пополнен на " + amount + " рублей.");
    }
}
