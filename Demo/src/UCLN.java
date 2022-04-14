import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner number = new Scanner(System.in);

        System.out.println(" Nhập số a:");
        a = number.nextInt();

        System.out.println(" Nhập số b:");
        b = number.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) ;
        System.out.println(" Hai số không có Ước chung lớn nhất ");

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println(" Ước chung lớn nhất là: " + a);
        }


    }
}
