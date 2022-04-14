package Bt1;

import java.util.Arrays;

public class Cylinder extends Circle {
    private double height = 1.0;

    public  Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' +
                "which is a subclass of" + super.toString();
    }
}
class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println( cylinder);

        cylinder = new Cylinder(5);
        System.out.println(cylinder);

        cylinder=new Cylinder(5,"Blue",3);
        System.out.println(cylinder);
    }

}
