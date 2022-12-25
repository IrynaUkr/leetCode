package easy.tasks;

public class Palindrom {
    public static  boolean isPalindrome(int x) {
        int number = x;
        boolean palindrome = false;
        if(number % 10 == 0){
            return true;
        }else if (number < 0) {
            return palindrome;
        } else {
            int length = lengthPositiveNumber(number);
            while (length > 1) {
                int firstSign = number / (int) Math.pow(10, length - 1);
                int lastSigh = number % 10;
                if (firstSign == lastSigh) {
                    palindrome = true;
                    number = number % (int) Math.pow(10, length - 1);
                    number = number / 10;
                    length -= 2;
                }
                else{
                    palindrome = false;
                    break;
                }
            }

        }
        return palindrome;
    }

    public static int lengthPositiveNumber(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(0);
        System.out.println(palindrome);
    }

}
