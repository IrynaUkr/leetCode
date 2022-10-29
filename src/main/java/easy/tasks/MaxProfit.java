package easy.tasks;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min && i < prices.length - 1) {
                min = prices[i];
            }
            if (profit < (prices[i] - min)) {
                profit = (prices[i] - min);
            }
        }
        return profit;
    }
    public static void main(String[] args) {

        int[] prices = new int[]{3, 2, 6, 5, 0, 3};

        int i = maxProfit(prices);
        System.out.println(i);
        }
}
