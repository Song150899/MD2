public class Fan {
    public static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private double radius = 5;
    private String color = "blue";
    private boolean on = false;
    private int speed = SLOW;

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


   public String toString(){
        if (on==true){
            return "Thông tin quạt:"+ "mức " + this.speed + "," + "màu " + this.color+ ","+ "radius " + this.radius+ " Quạt đang bật";
        }
        else {
            return "Thông tin quạt:"+ "mức " + this.speed + "," + "màu " + this.color+ ","+ "radius " + this.radius+ " Quạt đang tắt";

        }

    }
}

