package assesment.codeverse;

public class RecursiveSum {
    public static int recSum(int[] numbers) {
        return rec(numbers, 0);
    }

    public static int rec(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + rec(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] num = new int[]{10, 2, 3, 90};
        System.out.println(recSum(num));

    }

}
