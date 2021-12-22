package SolvedAlgorithms;

import java.util.Arrays;

public class mergeTwoSortedArrays {
    static int[] merge(int[] input1, int[] input2) {

        int[] merged = new int[input1.length + input2.length];
        int count = 0;
        for (int j : input1) {
            merged[count] = j;
            count++;
        }
        for (int j : input2) {
            merged[count] = j;
            count++;
        }
        for (int i = 0; i < merged.length - 1; i++) {
            int aux1 = merged[i];
            int aux2 = merged[i + 1];
            if (aux1 < aux2) {
                merged[i] = aux1;
            } else {
                merged[i] = aux2;
                merged[i + 1] = aux1;
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30};
        System.out.println(Arrays.toString(merge(array1, array2)));
    }
}
