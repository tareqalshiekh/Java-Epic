import java.util.*;
public class Brackets{
    public static boolean balanced(String data) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == '(' ) {stack.push(ch);}
                else if (ch == ')') {
                    if (stack.isEmpty() || !isMatch(stack.peek(),ch)) {
                        return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')');
    }
    public static void main(String[] args) {
        String brackets = "()()()()(())";
        if (balanced(brackets)) {
            System.out.println( brackets + " <- balanced");
        } else {
            System.out.println( brackets + " <- not balanced");
        }
    }
}
