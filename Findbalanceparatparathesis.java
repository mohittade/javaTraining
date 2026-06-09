
import java.util.Stack;

public class Findbalanceparatparathesis {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No opening bracket for the closing one
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        return stack.isEmpty(); // Check if there are any unmatched opening brackets
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String str = "{[(mohitt is a good boy)]}";
        System.out.println(isBalanced(str)); // Output: true

        String str2 = "{[(])}";
        System.out.println(isBalanced(str2)); // Output: false
    }
    
}