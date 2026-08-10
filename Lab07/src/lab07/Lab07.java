package lab07;

public class Lab07 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(142, "Khaled");
        System.out.println("amount      :  "+b.getAmount());
        b.deposit(3000);
        b.deposit(4000);
        b.withdraw(2000);
        b.display();
   }
}
