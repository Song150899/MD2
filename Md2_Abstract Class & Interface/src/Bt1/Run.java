package Bt1;
import Bt1.Shape;
import Bt1.Resizeable;
import Bt1.Rectangle;
import Bt1.Circle;
import  Bt1.Resizeable;
public class Run {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        rectangle.resize(60);
        System.out.println(rectangle);

        Circle circle = new Circle( 4);
        circle.resize(50);
        System.out.println(circle);

        Square square = new Square(5);
        square.resize(100);
        System.out.println(square);

    }
}
