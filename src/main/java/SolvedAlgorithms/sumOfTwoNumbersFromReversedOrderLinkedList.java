package SolvedAlgorithms;

/*
 * Given two linked lists, transform the result of reversed order
 * into one number, them sum both numbers and return
 * into a reversed linked list
 * Ex: List 1 => 2 -> 4 -> 3
 *     List 2 => 5 -> 6 -> 4
 *   Sum: 342 + 465 = 807
 *     Result list => 7 -> 0 -> 8
 * */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class sumOfTwoNumbersFromReversedOrderLinkedList {
    static List<Integer> sumOfTwoNumbersFromList(List<Integer> input1, List<Integer> input2) {
        int i1 = 0;
        for (int i = input1.size() - 1; i >= 0; i--) {
            i1 = i1 * 10 + input1.get(i);
        }
        int i2 = 0;
        for (int i = input2.size() - 1; i >= 0; i--) {
            i2 = i2 * 10 + input2.get(i);
        }
        int sum = i1 + i2;
        List<Integer> listToReturn = new LinkedList<Integer>();
        do {
            listToReturn.add(sum % 10);
            sum /= 10;
        } while (sum > 0);
        return listToReturn;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        Collections.addAll(list1, 2, 4, 3);
        Collections.addAll(list2, 5, 6, 4);
        System.out.println(sumOfTwoNumbersFromList(list1, list2));
    }
}
