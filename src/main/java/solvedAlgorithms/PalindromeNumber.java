package solvedAlgorithms;

/*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
    Negative numbers are never palindromes
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int in1 = 121;
        int in2 = -121;
        int in3 = 123;
        System.out.println(PalindromeNumber(in1));
        System.out.println(PalindromeNumber(in2));
        System.out.println(PalindromeNumber(in3));
    }

    // O(n) Space and Speed complexity
    static boolean PalindromeNumber(int x) {
        if (x < 0) return false;
        String pali = String.valueOf(x);
        for (int i = 0; i < Math.floor(pali.length() / 2); i++) {
            if (pali.charAt(i) != pali.charAt(pali.length() - i - 1))
                return false;
        }
        return true;
    }
}
