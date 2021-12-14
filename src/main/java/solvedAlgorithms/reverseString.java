package solvedAlgorithms;

public class reverseString {
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
        System.out.println(reverse("Vinicius"));
    }
}
