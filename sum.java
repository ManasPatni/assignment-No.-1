import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number:");
        int c = scanner.nextInt();

       // int sum = a+b+c;
       int sum = a-b-c;
        System.out.println("The sum of the three numbers is: ");
        System.out.println(sum);
        scanner.close();
    }
}
