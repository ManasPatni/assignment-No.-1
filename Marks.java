import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for subject 1: ");
        float subject1 = scanner.nextFloat();

        System.out.println("Enter the marks for subject 2: ");
        float subject2 = scanner.nextFloat();

        System.out.println("Enter the marks for subject 3: ");
        float subject3 = scanner.nextFloat();

        System.out.println("Enter the marks for subject 4: ");
        float subject4 = scanner.nextFloat();

        System.out.println("Enter the marks for subject 5: ");
        float subject5 = scanner.nextFloat();

        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (totalMarks / 500) * 100;

        System.out.println("The total marks are: " + totalMarks);
        System.out.println("The percentage is: " + percentage + "%");

        scanner.close();
    }

}
