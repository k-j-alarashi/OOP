package lab08;

public class Lab08 {

    public static void main(String[] args) {
      Student s = new Student(1, "Mohammed", 20, "IT");
      Teacher t = new Teacher(24, "Ahmed", 30, 12000);
      
        System.out.println("------- Student Data -------");
        System.out.println(s);
        System.out.println("============================");
        System.out.println("------- Teacher Data -------");
        System.out.println(t);
    }
}
