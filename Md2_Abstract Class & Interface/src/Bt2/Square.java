package Bt2;

public class Square implements Colorable {
    private String color;
    public Square() {

    }

    public Square(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
class Run{
    public static void main(String[] args) {
        Square square = new Square( "Black");
        square.howToColor();
        System.out.println(square);
    }
}




