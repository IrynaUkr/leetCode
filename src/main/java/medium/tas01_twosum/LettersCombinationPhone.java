package medium.tas01_twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LettersCombinationPhone {
    public static void main(String[] args) {
        List<String> strings = letterCombinations("1234567");
        System.out.println(strings);

    }
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        String[] ss ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> s = combinations("",digits,ss);
        return s;
    }
    static ArrayList<String> combinations(String p,String up,String[] s){
        if(up.isEmpty()){
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> f = new ArrayList<>();
        int t =up.charAt(0)-'0';
        if(t==7 || t==9){
            for(int i=0;i<4;i++)
                f.addAll(combinations(p+s[t].charAt(i),up.substring(1),s));
        }
        else{
            for(int i=0;i<3;i++)
                f.addAll(combinations(p+s[t].charAt(i),up.substring(1),s));
        }
        return f;
    }
}

