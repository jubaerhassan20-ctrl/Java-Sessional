class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Jubaer Hassan");
        account.setAccountNumber(543828);
        account.setBalance(90000.00);
        System.out.println("Bank Account Information.");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
