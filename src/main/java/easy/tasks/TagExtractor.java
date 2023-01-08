package easy.tasks;

import java.util.Scanner;

public class TagExtractor {
    //4
    //<h1>Nayeem loves counseling</h1>
    //<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
    //<Amee>safat codes like a ninja</amee>
    //<SA premium>Imtiaz has a secret crush</SA premium>
    public static void parseTag(String input) {
        if (!input.contains("<") || !input.contains(">") || !input.contains("</")) {
            System.out.println("None");
        } else {
            String openTagToClosed = "";
            int endIndexOpenTag = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '<' && input.charAt(i + 1) != '/') {
                    String cutSub = input.substring(i);
                    endIndexOpenTag = i + cutSub.indexOf(">") + 1;
                    openTagToClosed = "</" + cutSub.substring(cutSub.indexOf("<") + 1, cutSub.indexOf(">") + 1);
                    if (openTagToClosed.equals("</>")) {
                        System.out.println("None");
                        i = endIndexOpenTag;
                        openTagToClosed = "";
                    }
                }
                if (input.charAt(i) == '/' && openTagToClosed.length() > 0) {
                    int endIndex = i + openTagToClosed.length() - 1;
                    int beginIndexClosedTag = i - 1;
                    String currentClosedTag = input.substring(beginIndexClosedTag, endIndex);
                    if (currentClosedTag.equals(openTagToClosed)) {
                        String content = input.substring(endIndexOpenTag, beginIndexClosedTag);
                        if (content.length() > 0) {
                            System.out.println(content);
                        }
                    } else {
                        System.out.println("None");
                    }
                    i = endIndex;
                    openTagToClosed = "";
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            parseTag(line);

            testCases--;
        }
    }
}
