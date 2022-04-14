public class QuadraticEquation {
    private double a, b, c;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double root1() {
        return (-this.b + Math.sqrt(delta() / 2 * this.a));
    }

    public double root2() {
        return (-this.b - Math.sqrt(delta() / 2 * this.a));
    }

    public double root3() {
        return (-this.b / (2 * a));
    }

    public void display() {
        if (delta() > 0) {
            System.out.println(" Phương trình có 2 nghiệm phân biệt" + root1() + "," + root2());
        } else if (delta() == 0) {
            System.out.println(" Phương trình có nghiệm kép" + root3());
        } else {
            System.out.println(" Phương trình vô nghiệm");
        }

    }

    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(4, -2, -6);
        System.out.println(a.delta());
        a.display();

    }
}
