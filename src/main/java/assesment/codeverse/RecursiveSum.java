package assesment.codeverse;

public class RecursiveSum {
    public static int recSum(int[] numbers) {
        return recDesc(numbers, numbers.length-1);
    }

    public static int rec(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + rec(arr, index + 1);
    }
    // desc order
    public static int recDesc(int[] arr, int index) {
        if (index == -1) {
            return 0;
        }
        int a = arr[index] + recDesc(arr, index -1);
        System.out.println(a);
        return a;
    }


    public static void main(String[] args) {
        int[] num = new int[]{10, 2, 3, 90};
        System.out.println(recSum(num));

    }

}
