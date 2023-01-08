package easy.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReturnToTechSortRoman {

    /*
     * Complete the 'sortRoman' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY names as parameter.
     */

    public static List<String> sortRoman(List<String> names) {
        List<String> result = new ArrayList<>(names);
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1Name = o1.split(" ")[0];
                String o2Name = o2.split(" ")[0];
                if (!o1Name.equals(o2Name)) {
                    return o1.compareTo(o2);
                }
                String o1Roman = o1.split(" ")[1];
                String o2Roman = o2.split(" ")[1];
                int o111 = romanToInt(o1Roman);
                int o222 = romanToInt(o2Roman);
                return o111 - o222;
            }
        });
        return result;

    }

// //   public static int romanToInt(String roman) {
//        int result = 0;
//        for (int i = 0; i < roman.length(); i++) {
//            switch (roman.charAt(i)) {
//                case 'I':
//                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'V') {
//                        result = result + 4;
//                        i++;
//                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'X') {
//                        result = result + 9;
//                        i++;
//                    } else {
//                        result = result + 1;
//                    }
//                    break;
//                case 'V':
//                    result = result + 5;
//                    break;
//                case 'X':
//                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'L') {
//                        result = result + 40;
//                        i++;
//                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'C') {
//                        result = result + 90;
//                        i++;
//                    } else {
//                        result = result + 10;
//                    }
//                    break;
//                case 'L':
//                    result = result + 50;
//                    break;
//                case 'C':
//                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'D') {
//                        result = result + 400;
//                        i++;
//                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'M') {
//                        result = result + 900;
//                        i++;
//                    } else {
//                        result = result + 100;
//                    }
//                    break;
//                case 'D':
//                    result = result + 500;
//                    break;
//                case 'M':
//                    result = result + 1000;
//                    break;
//            }
//        }
//        return result;
//    }

    public static int romanToInt(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I' -> {
                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'V') {
                        result = result + 4;
                        i++;
                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'X') {
                        result = result + 9;
                        i++;
                    } else {
                        result = result + 1;
                    }
                }
                case 'V' -> result = result + 5;
                case 'X' -> {
                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'L') {
                        result = result + 40;
                        i++;
                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'C') {
                        result = result + 90;
                        i++;
                    } else {
                        result = result + 10;
                    }
                }
                case 'L' -> result = result + 50;
                case 'C' -> {
                    if (i < roman.length() - 1 && roman.charAt(i + 1) == 'D') {
                        result = result + 400;
                        i++;
                    } else if (i < roman.length() - 1 && roman.charAt(i + 1) == 'M') {
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

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Louis X");
        names.add("Louis VIII");
        // names.add("Andrey I");
        List<String> result = sortRoman(names);
        for (String s : result) {
            System.out.println(s);
        }


    }


}
