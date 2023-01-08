package easy.tasks;

public class Palindrom {
    public static boolean isPalindrome(int x) {
        int number = x;
        if (number % 10 == 0) {
            return true;
        } else if (number < 0) {
            return false;
        } else {
            int length = lengthPositiveNumber(number);
            while (length > 1) {
                int firstSign = number / (int) Math.pow(10, length - 1);
                int lastSigh = number % 10;
                if (firstSign == lastSigh) {

                    number = number % (int) Math.pow(10, length - 1);
                    number = number / 10;
                    length -= 2;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static int lengthPositiveNumber(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public static boolean isValidPalindrome(String s) {
        boolean isPal = false;
        String string = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int leftIndex = 0;
        int rightIndex = string.length() - 1;
        while (leftIndex < rightIndex) {
            if (string.charAt(leftIndex) == string.charAt(rightIndex)) {
                isPal = true;
            } else {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return isPal;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
        boolean palindrome = isValidPalindrome("ac&c a");
        System.out.println(palindrome);
    }

}
