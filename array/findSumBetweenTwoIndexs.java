package array;

public class findSumBetweenTwoIndexs {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] prefetchSum = prefixSum(arr);
        getSum(prefetchSum, 0, 2);
    }

    private static int[] prefixSum(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
    private static void getSum(int[] arr, int i1, int i2) {
        if(i1 == 0){
            System.out.println(arr[i2]);
        }else{
            System.out.println(arr[i2] - arr[i1-1]);
        }

    }
}
