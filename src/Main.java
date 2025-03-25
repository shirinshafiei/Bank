public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingAccount saving1 = new SavingAccount("1001", "شیرین", 1000);
        SavingAccount saving2 = new SavingAccount("1002", "مریم", 2000);
        SavingAccount saving3 = new SavingAccount("1003", "ژینا", 8000);

        TransactionAccount transaction1 = new TransactionAccount("2001", "نیلوفر", 500);
        TransactionAccount transaction2 = new TransactionAccount("2002", "شمیلا", 700);
        TransactionAccount transaction3 = new TransactionAccount("2003", "آیناز", 300);

        bank.addAccount(saving1);
        bank.addAccount(saving2);
        bank.addAccount(saving3);
        bank.addAccount(transaction1);
        bank.addAccount(transaction2);
        bank.addAccount(transaction3);

        bank.findAccount("1001");
        bank.findAccount("9999");

        System.out.println(saving1.balance);
        saving1.deposit(300);
        System.out.println(saving1.balance);

        saving2.deposit(-100);

        transaction1.calculateInterest();
        saving2.calculateInterest();
        System.out.println(transaction1.balance);
        System.out.println(saving2.balance);

        transaction1.withdraw(-50);
        transaction2.withdraw(2000);
        transaction3.withdraw(100);

        saving1.withdraw(-50);
        saving2.withdraw(2500);
        saving3.withdraw(100);

        bank.showAllBalances();
    }
}
