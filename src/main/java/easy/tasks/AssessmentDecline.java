package easy.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class AssessmentDecline {
    public static double decline(String line) {

        int[] numbers = convertStringToArray(line);

        double[] prices = getPrices(numbers);

        return getMaxDecline(prices);
    }

    private static double[] getPrices(int[] numbers) {
        int p = numbers[0];
        int a = numbers[1];
        int b = numbers[2];
        int c = numbers[3];
        int d = numbers[4];
        int n = numbers[5];

        double [] prices = new double[n];
        for (int k = 1; k<= n; k++){
            double price = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
            prices[k-1]=price;
        }
        return prices;
    }

    private static int[] convertStringToArray(String line) {
        String[] strings = line.split(" ");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    public static double getMaxDecline(double[] prices){
        double max = prices[0];
        double decline = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i]> max){
                max = prices[i];
            } if (decline < (max-prices[i])){
                decline = max - prices[i];
            }
        }
        return decline;
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            double result = decline(line);
            String.format("%.3f",result);
            System.out.println( String.format("%.6f",result));
        }
    }
}
