package lab04;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base = input.nextInt();
        
        System.out.println("Enter Exponent : ");
        int exp = input.nextInt();
        
        int res = 1 ;
        for (int i = 1; i <=exp; i++) {
            res = res * base ;
        }
        
        System.out.println("The Result is : "+res);
    }
}
