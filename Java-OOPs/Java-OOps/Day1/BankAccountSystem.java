public class BankAccountSystem {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    class BankAccount {
        private String accountHolderName;
        private final int accountNumber;

        public BankAccount(String accountHolderName, int accountNumber) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            totalAccounts++;
        }

        public void displayDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Holder: " + this.accountHolderName);
                System.out.println("Account Number: " + this.accountNumber);
            }
        }
    }
    
}
