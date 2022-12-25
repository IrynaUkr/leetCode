package easy.tasks;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void printMultiplesThreeEndSeven() {
        for (int i = 199; i > 0; i--) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static float divide(int a, int b) throws RuntimeException {
        if (b == 0) {
            throw new RuntimeException();
        }
        return (float) a / b;
    }

    public static void main(String[] args) {

        System.out.println(divide(10, 7));

    }

}
