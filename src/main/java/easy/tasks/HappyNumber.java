package easy.tasks;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int number) {
        Set<Integer> inLoop = new HashSet<>();
        int result = number;
        if (number < 0) {
            return false;
        } else {
            while (inLoop.add(result)) {
                if (result == 1) {
                    return true;
                } else {
                    result = getSumSqrOfDigit(result);
                }
            }
        }
        return false;
    }


    public static int getSumSqrOfDigit(int number) {
        int sum = 0;
        while (number > 0) {
            sum += Math.pow(number % 10, 2);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumSqrOfDigit(222));
        System.out.println(isHappy(19));
    }

}
