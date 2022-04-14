package Bt1;

public class Square extends Rectangle implements Resizeable{
    private double side;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);

    }


    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth ( double width){
        setSide(width);
    }

    @Override
    public void setLength (double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = "  + getSide() +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        side = side * (percent/100);

    }
}
class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5);
        System.out.println( square);

        square = new Square( "black", true,5);
        System.out.println(square);
    }
}
