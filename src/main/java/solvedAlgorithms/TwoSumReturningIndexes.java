package solvedAlgorithms;

import java.util.*;

/*
    Given an array of integers input and an integer target, return indices of the two numbers
    such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
 */

public class TwoSumReturningIndexes {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 7, 11, 15 }; // [0 , 1]
        int[] array2 = new int[] { 3, 3 }; // [0 , 1]
        int[] array3 = new int[] { 3, 2, 3}; // [0 , 2]
        int[] array4 = new int[] { 2, 5, 5, 11 }; // [1 , 2]
        System.out.println(Arrays.toString(TwoSumLinear(array, 9)));
        System.out.println(Arrays.toString(TwoSumLinear(array2, 6)));
        System.out.println(Arrays.toString(TwoSumLinear(array3, 6)));
        System.out.println(Arrays.toString(TwoSumLinear(array4, 10)));
    }

    static int[] TwoSumQuadratic(int[] input, int target) {
        int[] result = new int[2];
        if(input.length == 2) {
            result[0] = 0;
            result[1] = 1;
        } else {
            for(int i = 0; i < input.length; i++) {
                for(int j = i + 1; j < input.length; j++) {
                    if(input[i] + input[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    static int[] TwoSumLinear(int[] input, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (myMap.containsKey(target - input[i])) {
                result[0] = myMap.get(target - input[i]);
                result[1] = i;
            }
            myMap.put(input[i], i);
        }
        return result;
    }
}
