import java.util.Scanner;

public class scannerdemo {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1");
        //int a = sc.nextInt();
       float a = scanner.nextFloat();
        System.out.println("enter the number 2");
        //int b = sc.nextInt();
        float b = scanner.nextFloat();
        //int sum = a+b;
        float sum = a+b;
        System.out.println("the sum of two number is:");
        System.out.println(sum);

        scanner.close();
    }
}