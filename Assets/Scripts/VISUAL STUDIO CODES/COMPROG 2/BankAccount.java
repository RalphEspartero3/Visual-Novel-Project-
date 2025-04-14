public class BankAccount{    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(7116690, "Cede James D. Evangelista", 500);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder name: " + account.getAccountHolderName());` 
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\nProcess completed.");
    }
}
