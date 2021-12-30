package SolvedAlgorithms;

public class SubtracttheProductandSumofDigitsofanInteger {
    static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            prod *= rem;
            sum += rem;
            n = n / 10;
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(223));
    }
}
