package assesment.codeverse;

public class RecursiveMultiplier {
    public static int recursiveMultiplier(int [] numbers){
        return recursiveM(numbers, 0, numbers.length);

    }
    public static int recursiveM(int[] arr, int index, int length){
        if (index == length){
            return 1;
        }
        int i = arr[index] * recursiveM(arr, index + 1, length);
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        int[] num= new int[]{10,2,3,90};
        int i = recursiveMultiplier(num);
        System.out.println(i);
    }
}
