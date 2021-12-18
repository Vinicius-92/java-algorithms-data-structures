package solvedAlgorithms;

import java.util.Arrays;

/*
    Given an asc ordered array of integers,
    return the squared number of each int in
    asc order in new array.
 */
public class SquaredAscArrayOfIntegers {
    static int[] SquaredArray(int[] input) {
        int[] result = new int[input.length];
        int rightPointer = input.length - 1, leftPointer = 0;
        for (int i = 0; i < input.length; i++) {
            if(Math.abs(input[leftPointer]) > input[rightPointer]) {
                result[i] = input[leftPointer] * input[leftPointer];
                leftPointer++;
            } else {
                result[i] = input[rightPointer] * input[rightPointer];
                rightPointer--;
            }
        }
        return ReverseArray(result);
    }

    static int[] ReverseArray(int[] input) {
        int[] result = new int[input.length];
        int count = input.length-1;
        for (int i = 0; i < input.length; i++) {
            result[i] = input[count];
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -7,-3,2,3,11 };
        System.out.println(Arrays.toString(SquaredArray(arr)));
    }
}
