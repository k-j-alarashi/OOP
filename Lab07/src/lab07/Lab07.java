package lab07;

public class Lab07 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(8498, "Khaled");
        System.out.println("Amount      :  "+ba.getAmount()+" $ ");
        ba.deposit(2500);
        ba.deposit(300);
        ba.withdraw(1000);
        ba.display();
   }
}
