package easy.tasks;

import java.util.Arrays;

public class TwoSum2 {
    //only for sorted array
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int[] answer = new int[2];
        int left = 0;
        int right = nums.length - 1;

        while ((nums[left] + nums[right]) != target && left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        answer[0] = left;
        answer[1] = right;
        return answer;
    }






            public static void main (String[]args){
                int[] numbers = new int[]{4,3,2};
                int[] ints = twoSum(numbers, 6);
                System.out.println(ints[0] + " " + ints[1]);
            }
        }

