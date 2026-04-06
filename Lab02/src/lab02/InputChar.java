package lab02;

import java.util.Scanner;

public class InputChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Char : ");
        char c = input.next().charAt(0);
        
        System.out.println("The Char You Entered is : "+c);
    }
}
