package medium.tasks;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
public class LambdaCheckNumber {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        int divisor = 2;
        while (divisor < number / 2) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
    public static boolean isPalindrome(int number){
        int reverseNumber =0;
        int copy =Math.abs(number);
        while(copy > 0){
            reverseNumber = reverseNumber *10 +copy % 10;
            copy = copy / 10;
        }
        return number == Math.abs(reverseNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTests = Integer.parseInt(scanner.nextLine());
        while (numberTests > 0) {
            numberTests--;
            String s = scanner.nextLine();
            String[] testCase = s.split(" ");
            int methodCode = Integer.parseInt(testCase[0]);
            int number = Integer.parseInt(testCase[1]);
            String result = "";
            switch (methodCode) {
                case 1 -> result = isOdd(number) ? "ODD" : "EVEN";
                case 2 -> result = isPrime(number) ? "PRIME" : "COMPOSITE";
                case 3 -> result = isPalindrome(number) ? "PALINDROME" : "NOT PALINDROME";
                default -> result = "mistake";
            }
            System.out.println(result);
        }

    }

}
