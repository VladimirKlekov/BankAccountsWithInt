public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
//операция со счетами
        System.out.println("____________________________________________");
        savingsAccount.addMoney(500); // положил на сберегательный счет 500 рублей.
        System.out.println("____________________________________________");
        savingsAccount.pay(500); // попробовал заплатить со сберегательного счета
        System.out.println("____________________________________________");
        savingsAccount.transfer(checkingAccount, 500); //перевел со сберегательного счета на расчетный счет
        System.out.println("____________________________________________");
        checkingAccount.pay(200); // заплатил с расчетного счета
        System.out.println("____________________________________________");
        checkingAccount.addMoney(200); //пополнил расчетный счет
        System.out.println("____________________________________________");
        checkingAccount.transfer(savingsAccount, 200);//перевел с расчетного счета на сберегательный
        System.out.println("____________________________________________");
        creditAccount.pay(600);//заплатил с кредитного счета
        System.out.println("____________________________________________");
        creditAccount.addMoney(700);//добавил на кредитный счет
        System.out.println("____________________________________________");
        creditAccount.transfer(savingsAccount, 100);//попробовал перевести с кредитного счета
        System.out.println("____________________________________________");
        System.out.println("P.S. Я понял как это работает. Все методы проверил");
        System.out.println("Спасибо за помощь в учебе!!! \uD83E\uDD17" );
    }
}