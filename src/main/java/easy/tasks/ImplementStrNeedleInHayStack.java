package easy.tasks;

public class ImplementStrNeedleInHayStack {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i= 0; i<= haystack.length()-needle.length(); i++){
            char currentCharHayStack = haystack.charAt(i);
            char firstCharNeedle = needle.charAt(0);
            if(currentCharHayStack==firstCharNeedle){
                //boolean startsWith(String str, index fromIndex):
                // It returns true if the String begins with str,
                // it starts looking from the specified index “fromIndex”.
                if(haystack.startsWith(needle, i)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("bqwertaa", "aa"));
    }
}
