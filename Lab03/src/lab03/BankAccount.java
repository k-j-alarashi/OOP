package lab03;

public class BankAccount {

    public static void main(String[] args) {
        double currecntAmount = 10000.0;
        double futureAmount = 2 * currecntAmount;
        int years = 0 ;
        
        while(currecntAmount <= futureAmount){
            currecntAmount = currecntAmount + (currecntAmount * 5/100);
            years++;
        }
        
        System.out.println("Years    :    "+years);
    }
}
