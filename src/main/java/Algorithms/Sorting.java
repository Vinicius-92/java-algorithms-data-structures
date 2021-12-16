package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 101, 2, 8, 7, 65, 34, 99);
        numbers.sort((x, y) -> x - y);
        int[] arr = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
        SelectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void BubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                int aux = 0;
                if (input[j] > input[j + 1]) {
                    aux = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = aux;
                }
            }
        }
    }

    static void SelectionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int min = i;
            int temp = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            input[i] = input[min];
            input[min] = temp;
        }
    }
}
