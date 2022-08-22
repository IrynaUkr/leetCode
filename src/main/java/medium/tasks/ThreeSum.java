package medium.tasks;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length-1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    uniqueTriplets.add(triplet);
                    left++;
                    right--;
                }else{
                    if ((nums[i] + nums[left] + nums[right])>0){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(uniqueTriplets);
    }

    public static List<List<Integer>> threeSumSlow(int[] nums) {

        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {

                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[k]);
                        triplet.add(nums[j]);

                        Collections.sort(triplet);
                        uniqueTriplets.add(triplet);
                        System.out.println(triplet + " trip");
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(uniqueTriplets);
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{-1, -2, -1, 3, -3, 0};
        List<List<Integer>> lists = threeSum(numbers);
        lists.stream().forEach(System.out::println);
    }
}
