package searching;

public class SquareRootTODO {
    public static void main(String[] args) {
        System.out.println(sqaureRoot(5, 0, 5));
    }

    private static int sqaureRoot(int val, int low, int high) {
        if(low > high ){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (mid * mid == val) {
            return mid;
        } else if (mid * mid > val) {
            return sqaureRoot(val, 0, mid - 1);
        } else {
            return sqaureRoot(val, mid + 1, high);
        }
    }
}