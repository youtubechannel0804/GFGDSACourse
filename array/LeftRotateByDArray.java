package array;

import java.lang.reflect.Array;

public class LeftRotateByDArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // method 1:
        leftRotateByDSpace1(arr,3);
        ArrayUtil.displayArray(arr);
    }

    private static void leftRotateByDSpace1(int[] arr,int space) {
        int[] temp = new int[space];

        for(int i =0 ;i < space;i++){
            temp[i] = arr[i];
        }

        for(int i = space;i<arr.length;i++){
            arr[i-space] = arr[i];
        }
        for(int i = 0 ;i<temp.length;i++){
            arr[arr.length-space+i] = temp[i];
        }
    }
}
