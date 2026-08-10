package lab06;

public class Rectangle {

    int x;
    int y;
    double width;
    double height;

    public Rectangle() {
        x = 0;
        y = 0;
        width = 0.0;
        height = 0.0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void display(){
        System.out.println("Hi , I'm Rectangle ...");
    }

}
