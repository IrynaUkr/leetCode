package easy.task01_twosum;

import java.util.HashMap;
import java.util.Map;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class RomanToInt {
    public static int convert(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I' -> {
                    if (i< roman.length()-1 && roman.charAt(i + 1) == 'V') {
                        result = result + 4;
                        i++;
                    }
                    else if (i< roman.length()-1 && roman.charAt(i + 1) == 'X') {
                        result = result + 9;
                        i++;
                    } else {
                        result = result + 1;
                    }
                }
                case 'V' -> result = result + 5;
                case 'X' -> {
                    if (i< roman.length()-1 && roman.charAt(i + 1) == 'L') {
                        result = result + 40;
                        i++;
                    }
                    else if (i< roman.length()-1 &&roman.charAt(i + 1) == 'C') {
                        result = result + 90;
                        i++;
                    } else {
                        result = result + 10;
                    }
                }
                case'L'-> result = result + 50;
                case 'C'->{
                    if (i< roman.length()-1 && roman.charAt(i + 1) == 'D') {
                        result = result + 400;
                        i++;
                    }
                    else if (i< roman.length()-1 &&roman.charAt(i + 1) == 'M') {
                        result = result + 900;
                        i++;
                    } else {
                        result = result + 100;
                    }
                }
                case 'D' -> result = result + 500;
                case 'M' -> result = result + 1000;
            }
        }
        return result;
    }
    public int romanToIntMap(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)))             {
                num += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            }

            else {
                num += roman.get(s.charAt(i));
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(convert("DCXXI"));
    }
}
