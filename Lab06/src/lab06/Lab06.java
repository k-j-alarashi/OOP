package lab06;

public class Lab06 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        System.out.println("X        : "+a.getX());
        System.out.println("Y        : "+a.getY());
        System.out.println("W        : "+a.getWidth());
        System.out.println("H        : "+a.getHeight());
        System.out.println("=========================");
        a.setX(100);
        System.out.println("X        : "+a.getX());
        System.out.println("Y        : "+a.getY());
        System.out.println("W        : "+a.getWidth());
        System.out.println("H        : "+a.getHeight());
    }
    
}
