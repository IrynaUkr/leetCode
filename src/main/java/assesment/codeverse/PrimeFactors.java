package assesment.codeverse;

public class PrimeFactors {
    public  static boolean isPrime(int n){
        boolean isPrimeNumber = true;
        for (int i = 2; i< n; i++){
            if (n % i == 0){
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
    public static void printPrimeFactors(int number){
        for(int i = 2; i< number; i++){
            if (number % i ==0){
                if( isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printPrimeFactors(15453);
    }
}
