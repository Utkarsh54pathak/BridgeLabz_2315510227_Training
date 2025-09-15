public class BankSystem{

    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;

    public BankSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Not a valid BankAccount instance.");
        }
    }
    public static void main(String[] args) {
        BankSystem acc1 = new BankSystem("Shiv Kumar", 101);
        BankSystem acc2 = new BankSystem("Vedant", 102);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println();
        BankSystem.getTotalAccounts();
    }
}