package lab07;

public class BankAccount {

    private int accountId;
    private String accountholder;
    private double amount;

    public BankAccount(int accountId, String accountholder) {
        this.accountId = accountId;
        this.accountholder = accountholder;
        amount = 0.0;
    }

    public BankAccount(int accountId, String accountholder, double amount) {
        this.accountId = accountId;
        this.accountholder = accountholder;
        this.amount = amount;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.amount = this.amount + amount;
            System.out.println("====================================");
            System.out.println("Deposit Amount  :  " + amount + " $ ");
            System.out.println("Total Amount    :  " + getAmount() + " $ ");
            System.out.println("====================================");
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.amount && this.amount > 0) {
            this.amount = this.amount - amount;
            System.out.println("====================================");
            System.out.println("Withdraw Amount :  " + amount + " $ ");
            System.out.println("Total Amount    :  " + getAmount() + " $ ");
            System.out.println("====================================");
        } else {
            System.out.println("Sorry , You Don't Have Enough Cash ...!");
        }
    }

    public void display() {
        System.out.println("====================================");
        System.out.println("ID              :   " + getAccountId());
        System.out.println("NAME            :   " + getAccountholder());
        System.out.println("Current Amount  :   " + getAmount() + " $ ");
        System.out.println("====================================");
    }

}
