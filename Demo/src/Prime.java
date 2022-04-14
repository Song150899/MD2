import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào 1 số: ");
        int number = scanner.nextInt();
        int a = 1;
        System.out.println(Math.sqrt(number));
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " Không phải số nguyên tố");
                a = 0;
                break;
            }
        }
        if (a == 1) {
            System.out.println(number + " Là sô nguyên tố.");
        }
    }
}
