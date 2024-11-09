import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 3, 50, 23, 90, 67};
        int[] topThree = findTopThree(numbers);
        System.out.println("Top 3 numbers in descending order: " + Arrays.toString(topThree));
    }
    public static int[] findTopThree(int[] numbers) {
        int[] topThree = new int[3];
        Arrays.fill(topThree, Integer.MIN_VALUE); 
        for (int num : numbers) {
            if (num > topThree[0]) {
                topThree[0] = num;
                Arrays.sort(topThree);
            }
        }
        for (int i = 0; i < topThree.length / 2; i++) {
            int temp = topThree[i];
            topThree[i] = topThree[topThree.length - 1 - i];
            topThree[topThree.length - 1 - i] = temp;
        }
        
        return topThree;
    }
}
