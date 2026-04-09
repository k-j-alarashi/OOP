package lab03;

import java.util.Scanner;

public class Age_Nesteed_If {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();

        if (age >= 15) {
            if (age >= 30) {
                if (age >= 50) {
                    System.out.println("old");
                } else {
                    System.out.println("Adult");
                }
            } else {
                System.out.println("Young");
            }
        } else {
            System.out.println("Child");
        }
    }
}
