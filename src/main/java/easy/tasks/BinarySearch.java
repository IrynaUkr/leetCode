package easy.tasks;
//https://leetcode.com/problems/binary-search/submissions/

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int highIndex = nums.length - 1;
        int lowIndex = 0;
        int index = -1;


        while (lowIndex <= highIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;
            if (nums[mid] < target) {
                lowIndex = mid + 1;
            }
            if (nums[mid] > target) {
                highIndex= mid - 1;
            } else if(nums[mid]== target){
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int search = search(new int[]{-1, 2, 3, 4,6,9, 24, 35}, 28);
        System.out.println(search);
    }
}
