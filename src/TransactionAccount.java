public class TransactionAccount extends BankAccount {
        private final double overDraftLimit = 500;

        public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
            super(accountNumber, accountHolderName, initialBalance);
        }

        @Override
        public void calculateInterest() {
            System.out.println("برای این حساب سودی محاسبه نمی‌شود.");
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= (balance + overDraftLimit)) {
                balance -= amount;
                System.out.println(amount + " از حساب جاری برداشت شد.");
            } else {
                System.out.println("مقدار وارد شده نادرست است یا بیشتر از حد مجاز است.");
            }
        }
    }

