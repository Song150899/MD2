package Th1;

public class Rectangle extends Shape {

    private double width = 1.0 ;
    private double lenght = 1.0 ;

    public Rectangle() {

    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }

    public double setS(){
        return this.lenght * this.width;
    }

    public double setC(){
        return 2 * ( this.width + this.lenght );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}' +
                " is a subclass of " + super.toString();
    }


}
class RectangleTesst {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle( 3,5 );
        System.out.println(rectangle);

        rectangle = new Rectangle( "Yellow" , false , 5, 7);
        System.out.println(rectangle);

    }

}
