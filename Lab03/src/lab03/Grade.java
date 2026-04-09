package lab03;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Letter Grade : ");
        char g = input.next().toUpperCase().charAt(0);

        switch (g) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Try Again ...");
                break;
            default:
                System.out.println("Invaild Input");
        }
    }
}
