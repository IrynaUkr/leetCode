package algoritms;

import java.util.Arrays;

public class Recursion {
    public static int sumOfArray(int[] arr, int length){
        if(length==0){
            return 0;
        }else {
            return sumOfArray(arr, length-1)+ arr[length-1];
        }
    }

    public static void main(String[] args) {
        int i = sumOfArray(new int[]{1, 2, 3},3);
        System.out.println(i);
    }
}
