package lab03;

import java.util.Scanner;

public class Largest_Number_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number  : ");
        int num1 = input.nextInt();
        
        System.out.println("Enter Second Number : ");
        int num2 = input.nextInt();
        
        if (num1 >= num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
