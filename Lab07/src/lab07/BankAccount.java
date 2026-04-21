package lab07;

public class BankAccount {

    private int accountId;
    private String accountHolder;
    private double amount;

    public BankAccount(int accountId, String accountHolder) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        amount = 0.0;
    }

    public BankAccount(int accountId, String accountHolder, double amount) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        System.out.println("====================================");
        System.out.println("Deposit Amount  :  " + amount+" $ ");
        System.out.println("Total Amount    :  " + getAmount()+" $ ");
        System.out.println("====================================");
    }

    public void withdraw(double amount) {
        if (amount <= this.amount) {
            this.amount = this.amount - amount;
            System.out.println("====================================");
            System.out.println("Withdraw Amount :  " + amount+" $ ");
            System.out.println("Total Amount    :  " + getAmount()+" $ ");
            System.out.println("====================================");
        }
        else {
            System.out.println("Sorry , You Don't Have Enough Cash ...!");
        }
    }
    
    public void display(){
        System.out.println("====================================");
        System.out.println("ID              :   "+getAccountId());
        System.out.println("NAME            :   "+getAccountHolder());
        System.out.println("Current Amount  :   "+getAmount()+" $ ");
        System.out.println("====================================");
    }

}
