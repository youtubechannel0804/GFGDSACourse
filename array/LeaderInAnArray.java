package array;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        leaderInArray(arr);
    }

    private static void leaderInArray(int[] arr) {
       // System.out.println(arr[arr.length-1]);
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(max < arr[i]){
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
