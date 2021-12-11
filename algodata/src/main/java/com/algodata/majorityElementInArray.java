package com.algodata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Problem Description
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example :
 * Input : [2, 1, 2]
 * Return  : 2 which occurs 2 times which is greater than 3/2.
 */


public class majorityElementInArray {

    static int majorityElement(List<Integer> elements) {
        // Criando o dicionário para armazenar o elemento e a contagem de vezes
        HashMap<Integer, Integer> myDictionary = new HashMap<Integer, Integer>();
        Integer element = 0;
        for (Integer elem : elements) {
            // para cada elemento da lista, pegando o valor do count ou o default 0
            // pra quando não foi repetido ainda
            Integer count = myDictionary.getOrDefault(elem, 0);
            // aumentando o contador do elemento cada vez que é encontrado
            myDictionary.put(elem, count + 1);
            // caso o valor do contador do elemento já seja maior que
            // metade do tamanho da lista + 1, retorna o elemento como majoritário
            if (myDictionary.get(elem) > elements.size() / 2)
                element = elem;
        }
        return element;
    };

    static int forTest(List<Integer> A) {
        HashMap<Integer, Integer> myDictionary = new HashMap<Integer, Integer>();
        int element = 0;
        for (Integer elem : A) {
            Integer count = myDictionary.getOrDefault(elem, 0);
            myDictionary.put(elem, count + 1);
            if (myDictionary.get(elem) > A.size() / 2)
                element = elem;
        }
        return element;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 5, 8, 7, 7, 7));
        Integer inter = majorityElementInArray.majorityElement(list);
        Integer inter2 = majorityElementInArray.forTest(list);
    }
}
