package easy.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        //amount letters on the exactly right place
        int bulls = 0;

        //amount right letters but on the wrong place
        int cows = 0;
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
            if (secretMap.containsKey(secret.charAt(i))) {
                Integer secretKey = secretMap.get(secret.charAt(i));
                secretMap.put(secret.charAt(i), secretKey + 1);
            }else{
                secretMap.put(secret.charAt(i), 1);
            }
            if (guessMap.containsKey(guess.charAt(i))) {
                Integer guessKey = guessMap.get(guess.charAt(i));
                guessMap.put(guess.charAt(i), guessKey + 1);
            } else {
                guessMap.put(guess.charAt(i), 1);
            }
        }

        List<Character> keys = new ArrayList<>(secretMap.keySet());


        for (Character key : keys) {
            if (guessMap.containsKey(key)) {
                int guessAmount = guessMap.remove(key);
                int secretAmount = secretMap.remove(key);

                if (secretAmount > guessAmount) {
                    cows = cows + guessAmount;
                } else {
                    cows = cows + secretAmount;

                }
            }
        }
        cows = cows - bulls;
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        String hint = getHint("11", "01");
        System.out.println(hint);
    }

}
