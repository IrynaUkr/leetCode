package easy.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExcelSheets {
    //A -> 1
    //B -> 2
    //C -> 3
    //...
    //Z -> 26
    //AA -> 27
    //AB -> 28
    public static String convert(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            res.append((char) ('A' + (columnNumber % 26)));
            columnNumber = columnNumber / 26;
        }
        return res.reverse().toString();
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int sign = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            result += (c - 64) * sign;
            sign *= 26;
        }
        return result;

    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[nums.length - 1];
        }
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else if (i == nums.length - 3) {
                return nums[nums.length - 1];
            }
        }
        return result;
    }

    public static int single(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (distinct.contains(nums[i])) {
                distinct.remove(nums[i]);
            } else {
                distinct.add(nums[i]);
            }
        }
        return distinct.stream().findFirst().get();
    }

    public static void main(String[] args) {
        //  System.out.println(convert(28));
        // int[] nums = new int[]{1, 1, 2,2, 22, 22,345};
        //   int i = single(nums);
        // System.out.println(i);
        int a = titleToNumber("AA");
        System.out.println(a);


    }

}
