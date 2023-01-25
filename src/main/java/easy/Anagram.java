package easy;

import java.util.Arrays;


public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        Arrays.sort(first);
        char[] second = t.toCharArray();
        Arrays.sort(second);
        return  Arrays.equals(first, second);
    }
    public boolean isAnagram2(String one, String two){
        int [] alphabet =  new int [26];
        for(int i = 0; i< one.length(); i++){
            alphabet[one.charAt(i) -'a']++;
        }
        for(int i = 0; i< two.length(); i++){
            alphabet[two.charAt(i) -'a']--;
        }
        for(int i = 0; i < 26; i++){
            if (alphabet[i] != 0){
                return false;
            }
        }
        return true;
    }
}

