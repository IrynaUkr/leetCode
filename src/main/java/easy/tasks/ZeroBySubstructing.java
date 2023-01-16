package easy.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ZeroBySubstructing {
    //number of operations needed is equal to number of unique non-zero elements
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (i != 0) set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 3, 2, 1};
        int i = new ZeroBySubstructing().minimumOperations(test);
        System.out.println(i);
    }

}

