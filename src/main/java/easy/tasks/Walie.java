package easy.tasks;

public class Walie {
     public static int amountDivisible(int start, int end, int divisor){
          int amount = 0;
         for (int i = start; i< end; i++){
             if(i% divisor==0){
                 amount++;
             }
         }
         return  amount;
     }
     public static boolean isSplit(int number){
         int sq = number * number;
         int divisor= 10;
         while(divisor< sq){
             int num1 = sq / divisor;
             int num2 = sq % divisor;
             if ((num1+ num2)==number){

                 return true;
             }
             divisor *= 10;
         }
         return false;
     }

    public static void main(String[] args) {
        System.out.println(isSplit(45));
    }
}
