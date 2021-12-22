package SolvedAlgorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* Reverse a linked list
*/
public class reverseALinkedList {
    // Reversing a linked list in a linear O(n) speed complexity
    // and O(1) space complexity
    static List<Integer> reverseList(List<Integer> myList) {
        int halfListCount = (int)Math.floor(myList.size() / 2);
        int count = myList.size() - 1;
        for (int i = 0; i <= halfListCount; i++) {
            int temp = myList.get(i);
            myList.set(i, myList.get(count));
            myList.set(count, temp);
            count--;
        }
        return myList;
    }

    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<Integer>();
        List<Integer> myList2 = new LinkedList<Integer>();
        Collections.addAll(myList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(myList2, 99, 55, 33, 22, 11, 88, 77);
        // LinkedList with even size
        System.out.println(myList);
        System.out.println(reverseList(myList) + "\n");
        // LinkedList with odd size
        System.out.println(myList2);
        System.out.println(reverseList(myList2));
    }
}
