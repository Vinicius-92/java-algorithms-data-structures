package SolvedAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Problem Description
 *
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example :
 * Input : [2, 1, 2]
 * Return  : 2 which occurs 2 times which is greater than 3/2.
 */


public class majorityElementInArrayList {

    static int majorityElement(List<Integer> elements) {
        HashMap<Integer, Integer> myDictionary = new HashMap<Integer, Integer>();
        Integer element = 0;
        for (Integer elem : elements) {
            Integer count = myDictionary.getOrDefault(elem, 0);
            myDictionary.put(elem, count + 1);
            if (myDictionary.get(elem) > elements.size() / 2)
                element = elem;
        }
        return element;
    };

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 5, 8, 7, 7, 7, 7));
        Integer inter = majorityElementInArrayList.majorityElement(list);
        System.out.println(inter);
    }
}
