package easy.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0;
        int pointer2 = 0;
        int lengthNum1Unsorted = m;
        while (pointer1 < nums1.length && pointer2 < n) {
            if (nums1[pointer1] > nums2[pointer2]) {
                System.arraycopy(nums1, pointer1, nums1, pointer1 + 1, lengthNum1Unsorted);
                nums1[pointer1] = nums2[pointer2];
                pointer2++;

            } else {
                lengthNum1Unsorted--;
            }
            pointer1++;
        }
        if (pointer2 < n) {
            int lengthToCopy = n - pointer2;
            int destPos = nums1.length - lengthToCopy;
            System.arraycopy(nums2, pointer2, nums1, destPos, lengthToCopy);
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{100, 300, 500, 0, 0, 0};
        int[] num2 = new int[]{10, 2000, 4000};
        merge(num1, 3, num2, num2.length);
        Arrays.stream(num1).forEach(x -> System.out.println(x));
        Map<String, String>asd = new HashMap<>();
    }

}
