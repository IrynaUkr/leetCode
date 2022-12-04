package easy.tasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Article{
    String author;
    String name;
    int amountWords;
    public Article(String author, String name, int amountWords){
        this.author = author;
        this.name = name;
        this.amountWords = amountWords;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getAmountWords() {
        return amountWords;
    }

}

public class ComparingStreamExercise {
    public static Article shortest (List<Article> articleList){
       return articleList.stream()
               .sorted(Comparator.comparing(article -> article.getAmountWords())).findFirst().get();
    }


    public static void main(String[] args) {
        Article one = new Article("Tomm", "longStory", 19999);
        Article two = new Article("Anna", "middleStory", 456);
        Article three = new Article("Diopertyu", "short", 12);
        Article four = new Article("rrtr", "shortsame", 12);
        List<Article> articles = new ArrayList<>();
        articles.add(one);
        articles.add(two);
        articles.add(three);
        articles.add(four);
//comparing
        List<Article> collect = articles.stream()
                .sorted(Comparator.comparing(Article::getAuthor)
                        .thenComparing(Article::getAmountWords).reversed())
                .collect(Collectors.toList());
        int asInt = Arrays.stream(new int[]{2, 8, 45, 98, 1})
                .sorted()
                .findFirst()
                .getAsInt();
//collect to map

        String [] words = new String[]{"qwe", "qwe", "eueue", "milk","milk","milk","milk","milk", "coffee"};
        Map<String, Long> collect1 = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }
}
