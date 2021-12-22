package SolvedAlgorithms;
/*
    Given an integer array nums, find the contiguous subarray
    (containing at least one number) which has the largest sum and return its sum.
    A subarray is a contiguous part of an array.
 */
public class MaxSubArray {
    static int SubArray(int[] nums) {
        int length = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= length - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= length - 1; j++) {
                currSum += nums[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5,4,-1,7,8};
        System.out.println(SubArray(nums));
    }
}
