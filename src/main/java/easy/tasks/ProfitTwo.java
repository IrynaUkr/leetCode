package easy.tasks;

import java.util.Collection;
import java.util.HashMap;

public class ProfitTwo {


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (maxProfit < prices[j] - prices[i]) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitFast(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i] && i < prices.length - 1) {
                minPrice = prices[i];
            }
            if (maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = new int[]{7, 6, 4, 3, 9, 1};
        System.out.println(maxProfitFast(price));
    }

}
