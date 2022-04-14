public class Rectangle {
    double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double S() {
        return this.width * this.height;
    }

    public double C() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle { " + "Width = " + width + " Height = " + height + " } " ;
    }


}

