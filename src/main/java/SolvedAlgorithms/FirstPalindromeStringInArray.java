package SolvedAlgorithms;

public class FirstPalindromeStringInArray {

    static String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w)) return w;
        }
        return "";
    }

    static boolean isPalindrome(String s) {
        String cleanString = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = reverse(cleanString);
        System.out.println(reversedString);
        return cleanString.equals(reversedString);
    }

    static String reverse(String input) {
        char[] toReverse = input.toCharArray();
        char[] reversed = new char[input.length()];
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            reversed[i] = toReverse[toReverse.length - count];
            count++;
        }
        return String.valueOf(reversed);
    }
}
