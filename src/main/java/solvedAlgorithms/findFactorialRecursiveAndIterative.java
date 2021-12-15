package solvedAlgorithms;

public class findFactorialRecursiveAndIterative {
    /*
    * Both solutions are O(n)
    */
    static int factorialRecursive(int input) {
        return input == 2 ? 2 : input * factorialRecursive(input - 1);
    }
    static int factorialIterative(int input) {
        int result = input;
        for (int i = input; i > 1; i--)
            result *= (i - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(10));
        System.out.println(factorialIterative(2));
        System.out.println(factorialIterative(1));
    }
}
