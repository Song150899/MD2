import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate ;
        double totalInterest = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhập số tiền gửi");
        money = scanner.nextDouble();

        System.out.println(" Nhập tháng bạn muốn gửi");
        month = scanner.nextInt();

        System.out.println(" Nhập lãi suất bạn muốn");
        interestRate = scanner.nextDouble();

        for (int i = 0; i < month; i++) ;
        {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println(" Tổng tiền lãi bạn có là:" + totalInterest);

    }
}
