package array;

/**
 * loop will run n/2 times so in terms of big o notation Time Complexity is  n
 * space 1
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8};
        reverseArray(arr);
        ArrayUtil.displayArray(arr);
    }


    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}
