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

public class ReturnArrayWIthPlus1InTotalValue {
    static int[] ArrayPlusOne(int[] input) {
        int len = input.length;
        int[] result = new int[len+1];
        for (int i = len - 1; i >= 0; i--) {
            if (input[i] < 9) {
                input[i]++;
                return input;
            } else {
                input[i] = 0;
            }
        }
        result[0] = 1;
        return result;
    }
}
