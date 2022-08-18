package easy.task01_twosum;

import java.util.Stack;

public class Brackets {
    public static boolean isValid(String brackets) {
        Stack<Character> openBracketsStack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '('
                    || brackets.charAt(i) == '['
                    || brackets.charAt(i)=='{'){
                openBracketsStack.push(brackets.charAt(i));
            }
            else{
                if (openBracketsStack.empty()){
                    return false;
                }
                else{
                    if (brackets.charAt(i)==')'&& openBracketsStack.pop()!='('){
                        return false;

                    }if(brackets.charAt(i)==']'&& openBracketsStack.pop()!='['){
                        return false;
                    }
                    if(brackets.charAt(i)=='}'&& openBracketsStack.pop()!='{'){
                        return false;
                    }
                }
            }
        }
        return openBracketsStack.isEmpty();
    }
}
