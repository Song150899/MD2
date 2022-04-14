package Bt2;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ( float x, float y, float z ){
        super.setXY(x,y);
        this.z = z;

    }

    public float[] getXYZ(){
        float[] test = new float[3];
         super.getXY();
        test[2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + super.toString()+
                '}';
    }
}
class Point3DTest{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D= new Point3D(6);
        System.out.println(point3D);

        point3D= new Point3D(2,4,6);
        System.out.println(point3D);

    }

}
