package easy.tasks;

import java.util.Arrays;

public class MinCostClimbingStairs {
    //Input: cost = [1,100,1,1,1,100,1,1,100,1]
    public static int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    public static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int k = i+1; k < array.length; k++ ){
                if (array[i] == target - array[k]){
                    result[0] =i;
                    result[1]= k;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
     //   System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
       // System.out.println(minCostClimbingStairs(new int[]{15, 20, 200, 98}));
        System.out.println(Arrays.toString(twoSum(new int[]{15, 20, 200, 98}, 35)));
    }
}
