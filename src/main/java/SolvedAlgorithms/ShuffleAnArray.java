package SolvedAlgorithms;

import java.util.Arrays;

/*
    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
 */
public class ShuffleAnArray {
    static int[] Shuffle(int[] nums, int n) {
        int[] result = new int[ nums.length ];
        int count = 0;
        for (int i = 0; i < n ; i++) {
            result[count++] = nums[i];
            result[count++] = nums[ i + n ];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2,5,1,3,4,7 };
        System.out.println(Arrays.toString(Shuffle(nums, 3)));
    }
}
