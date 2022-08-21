package easy.tasks;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int dozen = 0;
        int[] answer = new int[digits.length + 1];
        if (digits[digits.length - 1] + 1 >= 10) {
            dozen = 1;
            answer[digits.length] = digits[digits.length - 1] + 1 - 10;
        } else {
            answer[digits.length] = digits[digits.length - 1] + 1;
        }

        for (int i = (digits.length - 2); i >= 0; i--) {
            if ((digits[i] + dozen) >= 10) {
                answer[i + 1] = (digits[i] + dozen) % 10;
                dozen = 1;
            } else {
                answer[i + 1] = digits[i] + dozen;
                dozen = 0;
            }
        }
        if (dozen == 1) {
            answer[0] = 1;
        } else {
            answer = Arrays.copyOfRange(answer, 1, digits.length + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{8, 9, 9, 9});
        Arrays.stream(ints).forEach(System.out::println);
    }
}
