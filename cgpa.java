import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for sbuject 1: ");
        float subject1 = scanner.nextFloat();
        System.out.println("Enter the marks for sbuject 2: ");
        float subject2 = scanner.nextFloat();
        System.out.println("Enter the marks for sbuject 3: ");
        float subject3 = scanner.nextFloat();

        float totalmarks = subject1+subject2+subject3;
        float marks = totalmarks/3;

        float cgpa = marks/9.5f ;
        System.out.println("The total marks are: " + totalmarks);
        System.out.println("The CGPA is: "+cgpa);
        scanner.close();
    }
}
