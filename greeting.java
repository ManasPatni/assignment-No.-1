import java.util.Scanner;
public class greeting {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name:");
        String name = scanner.nextLine();

        System.out.println("hello"+name+",have a good day!");

        scanner.close();
    }
    }

