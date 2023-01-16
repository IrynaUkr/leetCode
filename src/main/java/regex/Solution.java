package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static boolean check(String input){
        String regex = "^((.){3}\\.)+(.){3}$";
        String triplets = "^((.){3}\\.){3}(.){3}$";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean ch = check("123.456.abc.def");
        System.out.println(ch);

    }
}
