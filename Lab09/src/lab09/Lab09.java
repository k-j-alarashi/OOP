package lab09;

import java.util.Scanner;

public class Lab09 {

    public static void main(String[] args) {
        Author a = new Author("Khaled", 24, "Sana'a");
        Book book1 = new Book(1, "Big Java", a); // Aggregation ---> weak
        Book book2 = new Book(2, "Big Java", "Khaled", 24, "Sana'a"); // Composition ---> strong
        
        
        
        Scanner input = new Scanner(System.in);
        ChoiceQuestion chq = new ChoiceQuestion();
        chq.setText("Which Programming Language is the best ?");
        chq.addChoice("c++", false);
        chq.addChoice("java", true);
        chq.addChoice("python", false);
        chq.addChoice("js", false);

        chq.display();
        
        System.out.println("Enter Your Choice : ");
        String ans = input.next();
        System.out.println("Your Answer is : "+chq.checkAnswer(ans));
    }
}
