public class sumacc {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int targetSum1 = 5;
        int targetSum2 = 6;

        System.out.println("Pairs with sum " + targetSum1 + ":");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum1) {
                    System.out.println(numbers[i] + " + " + numbers[j]);
                }
            }
        }
        System.out.println("Pairs with sum " + targetSum2 + ":");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum2) {
                    System.out.println(numbers[i] + " + " + numbers[j]);
                }
            }
        }
    }
}
