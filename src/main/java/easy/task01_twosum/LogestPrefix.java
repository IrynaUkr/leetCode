package easy.task01_twosum;

public class LogestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String shortestString = strs[0];
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
                shortestString = strs[i];
            }
        }

        int minIndexSubString = shortestString.length();
        for (int i = 0; i < strs.length; i++) {
            for (int k = 0; k < strs[i].length() && k < minIndexSubString; k++) {
                if (strs[i].charAt(k) != shortestString.charAt(k)) {
                    minIndexSubString = k;
                }
            }
        }
        return shortestString.substring(0, minIndexSubString);
    }

    public static void main(String[] args) {
        String[] popo = new String[]{"reflower","flow","flight"};

        System.out.println(longestCommonPrefix(popo));
    }

}
