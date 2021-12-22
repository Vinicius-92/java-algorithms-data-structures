package SolvedAlgorithms;

import java.util.LinkedList;

/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
    An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
 */
public class ValidParenthesisClosing {
      boolean isValid(String s) {
        LinkedList<Character> myList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                myList.push(s.charAt(i));
            else {
                if (myList.isEmpty()) return false;
                if (!match(myList.pop(), s.charAt(i))) return false;
            }
        }
        return myList.isEmpty();
    }

    public boolean match(char first, char second) {
        return (first == '(' && second == ')')
                || (first == '[' && second == ']')
                || (first == '{' && second == '}');
    }

    public static void main(String[] args) {
        ValidParenthesisClosing valid = new ValidParenthesisClosing();
        String s = "(){}[]";
        String s1 = "({[({[()]})]})";
        System.out.println(valid.isValid(s));
        System.out.println(valid.isValid(s1));
    }
}
