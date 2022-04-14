package Bt3;

public class Point {
    private float x, y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] run = new float[2];
        run[0] = this.x;
        run[1] = this.y;
        return run;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Pointest {
    public static void main(String[] args) {
        Point pointest = new Point();
        System.out.println(pointest);

        pointest = new Point(3,5);
        System.out.println(pointest);


    }
}
