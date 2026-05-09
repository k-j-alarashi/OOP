package lab10;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side ;
    }

    @Override
    public void display() {
        System.out.println("I'm Square ..!");
    }
    
    
}
