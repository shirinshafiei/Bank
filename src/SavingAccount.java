public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("سود " + interest + " به حساب پس‌اندازی اضافه شد.");
    }
}