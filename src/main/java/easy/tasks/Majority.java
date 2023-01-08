package easy.tasks;

import java.util.*;

public class Majority {
    public static int maj(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                int amount = frequency.remove(nums[i]);
                frequency.put(nums[i], amount + 1);
            } else {
                frequency.put(nums[i], 1);
            }
        }
        int maxFrequency = frequency.values().stream().max(Comparator.naturalOrder()).get();
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            if (entry.getValue() > nums.length / 2 && entry.getValue() == maxFrequency) {
                return entry.getKey();
            }
        }
        return result;
    }

}
