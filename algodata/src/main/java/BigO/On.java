package BigO;

import java.util.ArrayList;
import java.util.Arrays;

public class On {

    // This is a O(n) functions, the amount of operations increase as the input increases
    // in a linear way.
    static void findNemo(String[] array) {
        for (String s : array)
            if (s.equals("nemo")) System.out.println("Found Nemo!");
    }
    public static void main(String[] args) {
        String[] nemo = new String[10000];
        for (int i = 0; i <= 9999; i++) {
            nemo[i] = "nemo";
        }
        findNemo(nemo);
    }
}
