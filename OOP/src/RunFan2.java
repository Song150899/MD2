public class RunFan2 {
    public static void main(String[] args) {
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
//        fan2.setOn(false);
        System.out.println(fan2);
    }
}
