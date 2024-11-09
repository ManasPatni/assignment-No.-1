import java.util.Scanner;
public class ExpressionCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of v:");
        double v = scanner.nextDouble();
        System.out.println("Enter the value of u:");
        double u = scanner.nextDouble();
        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of s:");
        double s = scanner.nextDouble();
        double result = (v*v)-(u*u)/(2*a*s);
        System.out.println("The result of the expression v^2-u^2/2as is:" +result);
        scanner.close();

    }    
}
