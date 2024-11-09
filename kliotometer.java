import java.util.Scanner;

public class kliotometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double conversionfactor = 0.621371;
        double miles = kilometers * conversionfactor;

        System.out.println(kilometers + "kilometer is equal to" +miles+ "miles");
        scanner.close();
    }
    
}
