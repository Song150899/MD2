package Bt1;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void resize(double percent) {
        radius= radius * (percent/100);
    }
}
class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("Blue", false, 3.5);
        System.out.println(circle);
    }
}
