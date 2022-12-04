package easy.tasks;

import java.sql.SQLOutput;
import java.util.*;

public class Fibonacci {
    //0 1 1 2 3 5 8 13
    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int iterFibonacci(int number) {
        // we have the sequence 0 1 1  it means we need to make one step back to have double 1
        number--;

        int first = 0;
        int second = 1;
        int result = 1;
        for (int i = 0; i < number; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static boolean isPrimeNumber(int number) {
        if(number <2){
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  static void printNumbers(int barrier) {
        Deque<Integer> primes = new ArrayDeque<>();
        for (int i = 0; i < barrier; i++) {
            if (isPrimeNumber(i)) {
                primes.add(i);
            }
        }
        Deque<Integer> fibs = new ArrayDeque<>();
        for (int i = 0; i < barrier; i++) {
            fibs.add(fib(i));
        }
        System.out.println(fibs.size() + primes.size());
       while(!primes.isEmpty() || !fibs.isEmpty()){
           if(!primes.isEmpty()){
               System.out.println(primes.removeFirst());

           }if(!fibs.isEmpty()){
               System.out.println(fibs.removeFirst() +"fibs");
           }
       }

    }

    public static void main(String[] args) {
        printNumbers(9);
    }

}
