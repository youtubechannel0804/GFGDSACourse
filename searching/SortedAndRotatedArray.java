package searching;

public class SortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 2, 3, 4, 5};
        System.out.println(findElement(arr, 0, arr.length - 1, 4));
    }

    private static int findElement(int[] arr, int low, int high, int val) {

        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] >= arr[low] ) {
                if (arr[low] <= val) {
                    return findElement(arr, low, mid - 1, val);
                } else {
                    return  findElement(arr, mid + 1, high, val);
                }
            } else {
                if (arr[high] >= val) {
                    return findElement(arr, mid + 1, high, val);
                } else {
                    return findElement(arr, low, mid - 1, val);
                }
            }
        }else{
            return -1;
        }
    }
}
