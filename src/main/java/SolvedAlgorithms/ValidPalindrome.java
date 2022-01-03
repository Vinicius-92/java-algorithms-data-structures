package SolvedAlgorithms;

public class ValidPalindrome {
    static boolean isPalindrome(String s) {
        String cleanString = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = reverse(cleanString);
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

    public static void main(String[] args) {
        String s = "1A man, a plan, a canal: Panama1";
        System.out.println(isPalindrome(s));
    }
}
