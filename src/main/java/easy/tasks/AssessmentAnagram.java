package easy.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AssessmentAnagram {
    public static void isAnagram(String one, String two) {
        boolean status;
        if (one.length() != two.length()) {
            status = false;
        } else {
            char[] oneArray = one.toCharArray();
            char[] twoArray = two.toCharArray();
            Arrays.sort(oneArray);
            Arrays.sort(twoArray);
            status = Arrays.equals(oneArray, twoArray);
        }
        if (status) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);

        }
    }

}
