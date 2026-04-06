package lab02;

import java.util.Locale;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Enter ID : ");
        int id = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter NAME : ");
        String name = input.nextLine();
        
        System.out.println("Enter SALARY : ");
        float sal = input.nextFloat();
        
        System.out.println("Enter JOB : ");
        String job = input.next();
        
        System.out.println("============================");
        System.out.println("ID       :    "+id);
        System.out.println("NAME     :    "+name);
        System.out.println("SALARY   :    "+sal);
        System.out.println("JOB      :    "+job);
        
        // formatted String
       // System.out.printf("ID      :   %d     NAME   :  %s     SALARY   :  %f     JOB   :  %s \n",id,name,sal,job);
        
    }
}
