package medium.tasks;

import java.util.*;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int currentSize = 0;
        int longestSize = 0;
        Set<Character> current = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (current.add(s.charAt(i))) {
                currentSize++;
            } else {
                if (longestSize < currentSize) {
                    longestSize = currentSize;
                }
                current.clear();
                currentSize = 0;
                current.add(s.charAt(i));
            }
        }
        int size = current.size();
        if (longestSize < size) {
            longestSize = size;
        }
        return longestSize;

    }

    public static int longest(String s) {
        int currentLargest = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> currentUniq = new HashSet<Character>();
            for (int j = i; j < s.length(); j++) {
                if (!currentUniq.contains(s.charAt(j))) {
                    currentUniq.add(s.charAt(j));
                } else {
                    break;
                }
            }
            currentLargest = Math.max(currentLargest, currentUniq.size());
        }

        return currentLargest;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("absdd23456789"));
        System.out.println(longest("aabaab!bb"));


    }
}
