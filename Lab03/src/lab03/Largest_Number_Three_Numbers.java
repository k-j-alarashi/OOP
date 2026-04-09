package lab03;

import java.util.Scanner;

public class Largest_Number_Three_Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number  : ");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number  : ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
        } else {
            System.out.println("Equals");
        }
    }
}
