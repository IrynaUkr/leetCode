package medium.tasks;

public class ReverseInteger {
    public static int reverse(int x) {
        long ans = 0;
        int current = x;
        while (current != 0) {
            ans = ans * 10 + current % 10;
            current = current / 10;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1056389759));
    }

}
