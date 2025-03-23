import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("نام: " + account.getAccountHolderName() +
                    " | شماره حساب: " + account.getAccountNumber() +
                    " | موجودی: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("حساب پیدا شد: " + account.getAccountHolderName());
                return account;
            }
        }
        System.out.println("حساب با این شماره پیدا نشد.");
        return null;
    }
}
