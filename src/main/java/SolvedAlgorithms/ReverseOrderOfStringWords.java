package SolvedAlgorithms;

import java.util.Objects;

public class ReverseOrderOfStringWords {
    static String Solve(String A) {
        if (A.length() == 1) return A;
        String[] result = A.trim().replaceAll(" +", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = result.length - 1; i >= 0; i--) {
            if (!Objects.equals(result[i], " "))
                sb.append(result[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(Solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
    }
}
