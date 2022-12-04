package easy.tasks;

import java.util.HashMap;
import java.util.Map;

public class Subsequence {
    public static int[] generateCode(String input) {
        Map<Character, Integer> code = new HashMap<>();
        int[] codedString = new int[input.length()];
        int currentValue = 5;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (code.containsKey(currentChar)) {
                codedString[i] = code.get(currentChar);
            } else {
                codedString[i] = currentValue;
                code.put(currentChar, currentValue);
                currentValue++;
            }
        }
        return codedString;
    }

    public static boolean isSubsequence(String sub, String full) {
        int subCurrentIndex = 0;
        int fullCurrentIndex = 0;
        while (subCurrentIndex < sub.length() && fullCurrentIndex < full.length()) {
            if (sub.charAt(subCurrentIndex) == full.charAt(fullCurrentIndex)) {
                subCurrentIndex++;
                fullCurrentIndex++;
            } else {
                fullCurrentIndex++;
            }
        }
        return subCurrentIndex == sub.length();
    }

    public static void main(String[] args) {
        boolean subsequence = isSubsequence("abc", "9acp");
        System.out.println(subsequence);
    }

}
