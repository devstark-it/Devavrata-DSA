package stack_dsa;

import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        BalancedBrackets combination = new BalancedBrackets();
        String input = "{()[]}";
        boolean result = combination.isValid(input);
        System.out.println(input + " ->  " + result);
    }


    public Boolean isValid(String brackets) {
        Stack<Character> stack = new Stack<>();
        char[] chars = brackets.toCharArray();
        for (char c : chars) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
