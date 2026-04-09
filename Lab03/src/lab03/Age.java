package lab03;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();

        if (age >= 50) {
            System.out.println("old");
        } else if (age >= 30) {
            System.out.println("Adult");
        } else if (age >= 15) {
            System.out.println("Young");
        } else {
            System.out.println("Child");
        }
    }
}
