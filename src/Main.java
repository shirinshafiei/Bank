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

        saving1.deposit(300);
        transaction1.withdraw(100);
        saving2.calculateInterest();

        transaction2.withdraw(-50);
        transaction3.withdraw(800);
        transaction3.withdraw(100);

        bank.showAllBalances();
    }
}
