package solvedAlgorithms;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

    /*
    * This problem can be solved in the two methods below,
    * but it returns different responses because of the way
    * it analyzes the arrays.
    */

    /*
    * Find the first recurrent int in array
    */

public class firstRecurrentNumber {

    // O(n) Linear -> Space and Speed
    static int recurrentNumber(int[] input) {
        Set<Integer> result = new HashSet<Integer>();
        for (int j : input) {
            if (result.contains(j))
                return j;
            else result.add(j);
        }
        throw new InputMismatchException("Doesn't have a recurrent number");
    }

    // O(n^2) -> Quadratic in speed, O(1) in space
    static int recurrentNumber2(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j])
                    return input[i];
            }
        }
        throw new InputMismatchException("Doesn't have a recurrent number");
    }


    public static void main(String[] args) {
        int[] input1 = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] input2 = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        int[] input3 = new int[]{2, 3, 4, 5};

        System.out.println(recurrentNumber2(input1));
        System.out.println(recurrentNumber2(input2));
        System.out.println(recurrentNumber2(input3));
    }
}
