package array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        trappingRainWater(arr);

        int[] arr1 = {3, 0, 1, 2, 5};
        trappingRainWater(arr1);
    }

    private static void trappingRainWater(int[] arr) {

        int[] leftArray = new int[arr.length];
        int[] rightArray = new int[arr.length];

        leftArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                leftArray[i] = arr[i];
            } else {
                leftArray[i] = arr[i - 1];
            }
        }

        rightArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                rightArray[i] = arr[i];
            } else {
                rightArray[i] = arr[i - 1];
            }
        }

        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            water = water + Math.abs(Math.min(leftArray[i], rightArray[i]) - arr[i]);
        }

        System.out.println(water);
    }


}
