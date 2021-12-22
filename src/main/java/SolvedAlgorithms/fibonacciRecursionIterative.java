package SolvedAlgorithms;

public class fibonacciRecursionIterative {
    // O(2^n) --> Exponential time
    static int fibonacciRecursion(int input) {
        if(input < 2) return input;
        return fibonacciRecursion(input - 1) + fibonacciRecursion(input - 2);
    }

    // O(n) --> Linear
    static int fibonacciIterative(int input) {
        if (input == 0) return 0;
        int[] arr = new int[input + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= input; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[input];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(10));
        System.out.println(fibonacciRecursion(10));
        System.out.println(fibonacciIterative(8));
        System.out.println(fibonacciRecursion(8));
    }
}
