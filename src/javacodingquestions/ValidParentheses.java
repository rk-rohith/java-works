package javacodingquestions;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()"; // valid
        String s2 = "()[]{}"; // valid
        String s3 = "(]"; // invalid
        String s4 = "([)]"; // invalid
        String s5 = "{[]}"; // valid

        System.out.println("Is " + s1 + " valid? " + isValid(s1));
        System.out.println("Is " + s2 + " valid? " + isValid(s2));
        System.out.println("Is " + s3 + " valid? " + isValid(s3));
        System.out.println("Is " + s4 + " valid? " + isValid(s4));
        System.out.println("Is " + s5 + " valid? " + isValid(s5));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Push opening parentheses onto stack
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Match closing ')' with '('
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Match closing ']' with '['
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Match closing '}' with '{'
            } else {
                return false; // Invalid parentheses
            }
        }

        return stack.isEmpty(); // Stack should be empty if all parentheses are matched
    }
}
