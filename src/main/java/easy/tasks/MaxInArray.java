package easy.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class MaxInArray {
    public static int[][] reverceArray(int[][] inputArr) {
        int[][] revercedArray = new int[inputArr[0].length][inputArr.length];
        for (int out = 0; out < inputArr.length; out++)
            for (int inside = 0; inside < inputArr[0].length; inside++) {
                revercedArray[inside][out] = inputArr[out][inside];
            }
        return revercedArray;

    }

    public static void checkPassword(String input) {
        String badPass = "bad";
        if (!input.matches(
                "(.*\\d.*)(.*[A-Z]).*(.*[a-z].*)(.*[@,#$%].*$)")) {
            System.out.println(badPass);
        }
    }

    public static int numberDivisors(int a, int b, int divisor) {
        int amount = 0;
        for (int i = a; i < b; i++) {
            if (i % a == 0) {
                amount++;
            }
        }
        return amount;
    }

    //1,5,6
    //1,9,70
    public static Set<Integer> commonNumbers(int[] one, int[] two) {
        Set<Integer> common = new HashSet<>();
        int oneIndex = 0;
        int twoIndex = 0;
        while (oneIndex < one.length && twoIndex < two.length) {
            if (one[oneIndex] == two[twoIndex]) {
                common.add(one[oneIndex]);
                oneIndex++;
                twoIndex++;
            } else {
                if (one[oneIndex] < two[twoIndex]) {
                    oneIndex++;
                } else {
                    twoIndex++;
                }
            }
        }
        return common;
    }


    public static void main(String[] args) {
       A ob =new A();
       ob.name= "kk";
        System.out.println(ob.name);
    }

}
class A{
    protected String name;
}
