package SolvedAlgorithms;

public class BinaryExponentiation {
    public static int binaryExpo(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 != 0) result *= base;
            base *= base;
            exponent /= 2;
        }
        return result;
    }

    static int binary(int a, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 > 0) {
                result *= a;
                n--;
            } else {
                a *= a;
                n /= 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryExpo(8,5));
        System.out.println(binary(8,5));
        System.out.println(Math.pow(8, 5));
    }
}
