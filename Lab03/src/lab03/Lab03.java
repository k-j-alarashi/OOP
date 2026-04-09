package lab03;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id = input.nextInt();
        
        System.out.println("Enter Name : ");
        String name = input.next();
        
        System.out.println("Enter Salary : ");
        float sal = input.nextFloat();
        
        System.out.println("Enter Position : ");
        String pos = input.next();
        
        System.out.println("=========Employee Details=========");
        System.out.println("ID            :   "+id);
        System.out.println("NAME          :   "+name);
        System.out.println("Salary        :   "+sal);
        System.out.println("Position      :   "+pos);
    }
    
}
