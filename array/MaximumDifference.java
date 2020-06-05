package array;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 10};
        maximumdifference(arr);

        int[] arr1 = {7, 9, 5, 6, 3, 2};
        maximumdifference(arr1);

        int[] arr2 = {10, 20, 30};
        maximumdifference(arr2);

        int[] arr3 = {30, 10, 8, 2};
        maximumdifference(arr3);
    }

    private static void maximumdifference(int[] arr) {

        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
            if (arr[i] < arr[min] && i < max) {
                min = i;
            }

        }
        System.out.println(arr[max] - arr[min]);
    }
}
