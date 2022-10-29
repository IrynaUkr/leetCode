package easy.tasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPal(String output) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < output.length(); i++) {
            Character current = output.charAt(i);
            if (frequency.containsKey(current)) {
                Integer curAmount = frequency.remove(current);
                frequency.put(current, curAmount + 1);
            } else {
                frequency.put(current, 1);
            }
        }
        int result = 0;
        boolean isOddPresent = false;
        Collection<Integer> values = frequency.values();
        for (Integer integer : values) {
            if (integer % 2 == 0) {
                result += integer;
            } else {
                result += (integer - 1);
                isOddPresent = true;
            }
        }
        if (isOddPresent) {
            return result + 1;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        int aabaa = longestPal("aabaabq");
        System.out.println(aabaa);
    }
}
