package array;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 30};
        removeDuplicates(arr);
        ArrayUtil.displayArray(arr);
    }

    private static void removeDuplicates(int[] arr) {
        int currEle = 0;
        int i = 1;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] != arr[currEle]) {
                currEle++;
                arr[currEle] = arr[i];
            }
        }
        System.out.println("total Element " + (currEle+1));
        for (i = currEle + 1; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
