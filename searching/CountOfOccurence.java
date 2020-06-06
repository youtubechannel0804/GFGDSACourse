package searching;

public class CountOfOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 3, 7, 9, 6, 8, 9, 9, 9};
        System.out.println(countOccurence(arr, 0, arr.length - 1, 3));
        System.out.println(countOccurence(arr, 0, arr.length - 1, 10));

        int[] arr1 = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(leftIndex(arr1, 0, arr1.length - 1, 1));
    }

    private static int countOccurence(int[] arr, int low, int high, int val) {

        int leftIndex = leftIndex(arr, low, high, val);
        int rightIndex = rightIndex(arr, low, high, val);

        if (leftIndex == -1) {
            return -1;
        } else {
            return rightIndex - leftIndex + 1;
        }
    }

    private static int rightIndex(int[] arr, int low, int high, int val) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == val && (mid == arr.length - 1 || arr[mid] != arr[mid + 1])) {
                return mid;
            } else if (arr[mid] > val) {
                return rightIndex(arr, low, mid - 1, val);
            } else {
                return rightIndex(arr, mid + 1, high, val);
            }
        } else {
            return -1;
        }
    }

    private static int leftIndex(int[] arr, int low, int high, int val) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == val && (mid == 0 || arr[mid] != arr[mid - 1])) {
                return mid;
            } else if (arr[mid] >= val) {
                return leftIndex(arr, low, mid - 1, val);
            } else {
                return leftIndex(arr, mid + 1, high, val);
            }
        } else {
            return -1;
        }
    }
}
