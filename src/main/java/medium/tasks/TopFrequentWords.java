package medium.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class WordFrequent implements Comparable<WordFrequent>{

    public String word;
    public int frequency;

    public WordFrequent(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(WordFrequent otherWordFrequent) {
        if (this.frequency != otherWordFrequent.frequency){
            return otherWordFrequent.frequency - this.frequency;
        }else{
            return this.word.compareTo(otherWordFrequent.word);
        }
    }

}

public class TopFrequentWords {
    public static List<String> topFrequent(String[]words, int k){
        Map<String, Long> frequency = Arrays.stream(words)
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()));

        List<WordFrequent> collect = frequency.entrySet().
                stream()
                .map(entry -> new WordFrequent(entry.getKey(), entry.getValue().intValue()))
                .toList();

       return collect.stream().sorted().map(pair->pair.word).limit(k).toList();

    }

    public static void main(String[] args) {
        List<String> strings = topFrequent(new String[]{"is", "is", "is", "that", "is", "only", "test", "for", "for", "test"}, 2);
        System.out.println(strings);
    }
}
