package solvedAlgorithms;
/*
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer. The digits are ordered from
    most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
    Ex: [1,2,3] => [1,2,4]
    Ex2: [9] => [1,0]
 */

import java.util.ArrayList;

public class ReturnArrayWIthPlus1InTotalValue {
    public static void main(String[] args) {

    }

    static int[] ArrayPlusOne(int[] input) {
        if (input[input.length - 1] > 0 && input[input.length - 1] < 9) {
            input[input.length - 1] += 1;
        } else {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i < input.length - 1; i++) {
                arr.add(input[i]);
            }
            arr.add(1);
            arr.add(0);
            return new int[]{};
        }
        return input;
    }
}
