package easy.tasks;

public class Fibonacci {
    //0 1 1 2 3 5 8 13
    public  static int fib(int n){

        if (n == 0 || n ==1 ){
            return n;
        }
          return fib(n-1)+ fib(n-2);
    }

    public static int iterFibonacci(int number){
        // we have the sequence 0 1 1  it means we need to make one step back to have double 1
        number --;

        int first = 0;
        int second = 1;
        int result =1;
        for (int i= 0; i < number; i++){
            result= first + second;
            first = second;
            second=result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
        System.out.println(iterFibonacci(9));
    }
}
