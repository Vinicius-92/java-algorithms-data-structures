package SolvedAlgorithms;

import java.util.Arrays;

public class ConcatenationOfArrays {
    static int[] Concat(int[] nums) {
        int[] result = new int[nums.length * 2];
        int n = nums.length;
        int count = 0;
        for (int i : nums) {
            result[count] = i;
            result[count + n] = i;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1,2,3 };
        System.out.println(Arrays.toString(Concat(nums)));
    }
}
