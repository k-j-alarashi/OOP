package lab04;

public class Lab04 {
    public static void main(String[] args) {
        Rectangle b = new Rectangle(5, 10, 20, 30);
        
        System.out.println("x : "+b.getX());
        System.out.println("y : "+b.getY());
        System.out.println("width : "+b.getWidth());
        System.out.println("height : "+b.getHeight());
        
        b.setX(99);
        System.out.println("==========================");
        
        System.out.println("x : "+b.getX());
        System.out.println("y : "+b.getY());
        System.out.println("width : "+b.getWidth());
        System.out.println("height : "+b.getHeight());
    }
}
