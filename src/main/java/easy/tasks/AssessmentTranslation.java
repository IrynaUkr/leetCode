package easy.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class AssessmentTranslation {
    public static boolean isTranslation(Map<Character, Character> vocabulary, String word, String translation) {
        boolean isTranslation = false;
        if (word.length() != translation.length()) {
            return false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                Character tranChar = translation.charAt(i);
                Character wordChar = word.charAt(i);
                if (vocabulary.containsKey(tranChar) && vocabulary.get(tranChar).equals(wordChar)) {
                    isTranslation = true;
                } else {
                    return false;
                }
            }
        }
        return isTranslation;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            String[] splitedLine = line.split(" ");
            Integer numberOfTranslations = Integer.parseInt(splitedLine[0]);
            Integer numberOfWordPairs = Integer.parseInt(splitedLine[1]);
            Map<Character, Character> vocab = new HashMap<>();
            for (int i = 0; i < numberOfTranslations; i++) {
                String translationPair = in.readLine();
                vocab.put(translationPair.charAt(2), translationPair.charAt(0));
            }
            for (int i = 0; i < numberOfWordPairs; i++) {
                String wordsPair = in.readLine();
                String[] splitPair = wordsPair.split(" ");
                String word = splitPair[0];
                String translation = splitPair[1];
                boolean result = isTranslation(vocab, translation, word);
                if (result) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
