import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {

        System.out.println(" Linear Equation Resolver");
        System.out.println(" Given a equation as ' a * x + b = 0 ', please enter constants: ");

        Scanner scanner = new Scanner(System.in);

        System.out.print( " a: ");
        Double a = scanner.nextDouble();

        System.out.println( " b: ");
        Double b = scanner.nextDouble();


        if (a !=0 ){
            Double result = -b / a;
            System.out.println(" The result is : " + result);
        }
        else if (b==0){
            System.out.println( " The equation has no solution");
        }
        else if ( b != 0 ){
            System.out.println( " Equation with infinite solutions");
        }
    }
}
