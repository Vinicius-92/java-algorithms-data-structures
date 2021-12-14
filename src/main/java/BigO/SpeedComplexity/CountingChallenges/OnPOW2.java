package BigO.SpeedComplexity.CountingChallenges;

public class OnPOW2 {

    // This is a nested if, in this case we do not sum the n's we multiply them
    // giving a new order of magnitude
    // O(n^2)
    static void logAllPairsOfArray (char[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                System.out.printf("%c %c \n", input[i], input[j]);
            }
        }
    }

    public static void main(String[] args) {
        char[] array = new char[] {'a', 'b', 'c', 'd', 'e'};
        logAllPairsOfArray(array);
    }
}
