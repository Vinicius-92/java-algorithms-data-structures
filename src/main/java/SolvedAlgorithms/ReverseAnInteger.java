package SolvedAlgorithms;

public class ReverseAnInteger {
    static int Reverse(int x) {
        StringBuilder sb = new StringBuilder();
        String toReverse;
        if (x < 0) {
            sb.append("-");
            toReverse = String.valueOf(x).substring(1);
        } else
            toReverse = String.valueOf(x);
        int len = toReverse.length();
        for (int i = len; i > 0; i--) {
            sb.append(toReverse.charAt(i - 1));
        }
        if (Double.parseDouble(sb.toString()) > 2147483647 || Double.parseDouble(sb.toString()) < -2147483648) {
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }

    static int ReverseBetter(int x) {
        boolean isNegative = false;
        long result = 0;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        while (x > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE) return 0;
        if (isNegative) result *= -1;
        return (int)result;
    }

    public static void main(String[] args) {
        int x = -123;
        System.out.println(ReverseBetter(x));
    }
}
