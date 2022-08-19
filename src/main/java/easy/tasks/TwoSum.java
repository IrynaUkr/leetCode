package easy.tasks;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] result=new int[2];
        for (int i= 0; i< nums.length; i++){
            for(int k = i + 1 ; k < nums.length; k++){
                if (nums[i]+nums[k] == target){
                    result[0] = i;
                    result[1] = k;
                    break;
                }
            }
        }
        return result;
    }
    public static int[]twoSumHash(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] result = new int [2];
        for(int i= 0; i< nums.length;i++ ){
            int neededValue = target - nums[i];
            if(map.containsKey(neededValue)){
                result[0] = map.get(neededValue);
                result[1] = i;
            }
            else{
                map.put(neededValue, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{10, 20, 30, 1, 2, 6}, 3);
        System.out.println(ints[0]+" "+ ints[1]);

    }
}
