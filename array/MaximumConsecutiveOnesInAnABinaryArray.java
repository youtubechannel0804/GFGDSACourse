package array;

public class MaximumConsecutiveOnesInAnABinaryArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1,0, 1, 0};
        System.out.print(maximumConsecutive(arr));
    }

    private static int maximumConsecutive(int[] arr) {
        int result = 0;
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result = Math.max(result, currentIndex);
                currentIndex = 0;
            } else {
                currentIndex++;
            }
        }
        return result;
    }
}
