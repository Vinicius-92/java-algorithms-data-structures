package solvedAlgorithms;

/*
    Given 2 arrays, create a function that lets a user know (true/false) whether
    these two arrays contain any common items.
    Example:
    input1 = ['a', 'b', 'c', 'x'];
    input2 = ['z', 'y', 'i'];
    should return false;
    Example 2:
    input1 = ['a', 'b', 'c', 'x'];
    input2 = ['z', 'y', 'x'];
    should return true;
 */

import java.util.HashSet;

public class commonCharBetweenArrays {

    // This solution is has a higher speed complexity and lower space complexity
    // Keep that in mind when approaching either solution
    static boolean commonCharQuadratic(char[] input1, char[] input2) {
        if (input1.length != 0 && input2.length != 0) {
            for (char c : input1) {
                for (char value : input2)
                    if (c == value) return true;
            }
        }
        return false;
    }

    static boolean commonCharLinear(char[] input1, char[] input2) {
        HashSet<Character> mySet = new HashSet<Character>();
        for (char i : input1) {
            mySet.add(i);
        }
        for (char i : input2) {
            if (mySet.contains(i)) return true;
            mySet.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        char[] input1 = new char[] {'a', 'b', 'c', 'x'};
        char[] input2 = new char[] {'z', 'y', 'i'};
        char[] input3 = new char[] {'a', 'b', 'c', 'x'};
        char[] input4 = new char[] {'z', 'y', 'x'};

        // Quadratic time solution -> O(n^2), but if the array sizes are different
        // that can be a O(a*b) notation
        System.out.println(commonCharQuadratic(input1, input2));
        System.out.println(commonCharQuadratic(input3, input4));

        // Linear time solution -> O(n)
        System.out.println(commonCharQuadratic(input1, input2));
        System.out.println(commonCharQuadratic(input3, input4));
    }
}
