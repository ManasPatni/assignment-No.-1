import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int targetSum1 = 5;
        int targetSum2 = 6;
        findPairsWithSum(numbers, targetSum1);
        findPairsWithSum(numbers, targetSum2);
    }

    public static void findPairsWithSum(int[] numbers, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Pairs with sum " + targetSum + ":");

        for (int number : numbers) {
            int complement = targetSum - number;

            if (map.containsKey(complement)) {
                System.out.println(complement + " + " + number);
            }

            // Add the current number to the map
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
    }
}
