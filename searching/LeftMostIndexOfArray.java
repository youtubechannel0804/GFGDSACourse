package searching;

public class LeftMostIndexOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 40, 50, 70, 80};

        System.out.println(leftIndex(arr, 0, arr.length, 10));
        System.out.println(leftIndex(arr, 0, arr.length, 30));
    }

    private static int leftIndex(int[] arr, int low, int high, int val) {

        if (low < high) {
            int mid = (low + (high - low)) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] > val) {
                return leftIndex(arr, low, mid - 1, val);
            } else {
                return leftIndex(arr, mid + 1, high, val);
            }
        }else{
            return -1;
        }

    }
}
