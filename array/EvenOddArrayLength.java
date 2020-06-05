package array;

public class EvenOddArrayLength {

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 7, 8};
        System.out.println(evenOddArrayLength(arr));

        int[] arr1 = {7, 10, 13, 14};
        System.out.println(evenOddArrayLength(arr1));

        int[] arr2 = {10, 12, 8, 4};
        System.out.println(evenOddArrayLength(arr2));
    }

    private static int evenOddArrayLength(int[] arr) {

        int res = 1;
        int length = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i - 1] % 2 == 0 && arr[i] % 2 != 0) || (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)) {
                length++;
                res = Math.max(length, res);
            } else {
                length = 1;
            }
        }
        return res;
    }
}
