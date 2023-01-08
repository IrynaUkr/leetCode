package easy.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractorMatcher {
    public static void parseTag(String input){
        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(input);

        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if ( ! matchFound) {
            System.out.println("None");
        }
    }
    public static boolean test(String input){
        Pattern p = Pattern.compile("Java\\s+\\d{1,2}");
        Matcher m = p.matcher(input);
        while(m.find()){
            System.out.println(m.group());
        }

        return m.matches();
    }

    public static void main(String[] args) {
        test("dhdhdhdhdhd Java 8,Java 9, Java 12 ");
    }

}
