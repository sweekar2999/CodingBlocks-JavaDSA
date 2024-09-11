package Contest7_Stack_LL_and_Queue;
import java.util.*;

public class Balanced_paranthesis {

    public static void main(String[] args) {
        String str = "(){}(())";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (isOpening(ch)) {
                st.push(ch);
            }
            // If closing bracket, check if it matches the top of the stack
            else {
                if (st.isEmpty() || !isMatching(st.peek(), ch)) {
                    return false; // Unmatched or stack is empty when closing bracket appears
                }
                st.pop(); // Match found, so pop the top of the stack
            }
        }

        // If the stack is empty, it's balanced
        return st.isEmpty();
    }

    // Function to check if character is an opening bracket
    public static boolean isOpening(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    // Function to check if two characters are matching pairs
    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
