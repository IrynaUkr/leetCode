package easy;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int dec = 0;
        int current1 = 0;
        int current2 = 0;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 >= 0) {
                current1 = num1.charAt(index1) - 48;
            }
            if (index2 >= 0) {
                current2 = num2.charAt(index2) - 48;
            }
            int x = dec + current1 + current2;
            if (x > 9) {
                dec = 1;
                result.append(x % 10);
            } else {
                result.append(x);
                dec = 0;
            }
            index1--;
            index2--;
            current2 =0;
            current1 =0;
        }
        if (dec == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
       addStrings("9", "99");
    }

}
