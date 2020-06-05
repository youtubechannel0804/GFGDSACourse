package array;

public class WindowSlidingTechnique {

    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        maxmimumSumOfKConsecutiveArray(arr, 3);

        int[] arr1 = {5, -10, 6, 90, 3};
        maxmimumSumOfKConsecutiveArray(arr1, 2);
    }

    private static void maxmimumSumOfKConsecutiveArray(int[] arr, int k) {

        int sum = 0;
        for (int z = 0; z < k; z++) {
            sum = sum + arr[z];
        }
        int i = 0;
        int j = k;
        int maxSum = sum;
        while (j < arr.length) {
            sum = sum + arr[j] - arr[j - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
            j++;
        }
        System.out.println(maxSum);
    }
}
