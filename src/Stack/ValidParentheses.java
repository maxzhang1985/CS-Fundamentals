package Stack;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

public class ValidParentheses {
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else {
                try {
                    char previous = stack.pop();
                    if (!(previous == '{' && current == '}' ||
                          previous == '[' && current == ']' ||
                          previous =='(' && current == ')')
                    ) {
                        return false;
                    }
                } catch (EmptyStackException err) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidHash(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.keySet().contains(current)) {
                stack.push(current);
            } else if (map.values().contains(current)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == current) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid(String s) {
        /**
         * Example:
         * [{()}] --> true
         * {[(]}) --> false
         * ([ --> false
         * )] --> false
         *
         * We need to match the opening parentheses witht the closing parentheses, if all matches, return true
         * For every opening, there must be a matching closing next to it, or a complete match in between
         *
         * Case 1: a[i] match a[i - 1] , move on to previous closing, and re-match
         * Case 2: a[i] doesn't match a[i - 1] && a[i - 1] is not a closing ---> False
         * Case 3: a[i] doesn't match a[i - 1] && a[i - 1] is a closing with a corresponding opening
         * Case 4: last element is a opening --> False
         * Case 5: first element is a closing --> False
         *
         * We can use Stack to store/match the pairs
         *
         */

        Stack<Character> stack = new Stack<>();

        if (s.length() == 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty() &&
                    (c == ')' && stack.peek() == '(' ||
                            c == ']' && stack.peek() == '[' ||
                            c == '}' && stack.peek() == '{')) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}



