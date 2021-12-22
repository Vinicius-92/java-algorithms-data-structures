package SolvedAlgorithms;
/*
    Given a non-empty array of integers nums, every element appears twice except for one.
     Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class FindNonRepeatingNumberInArray {
    static int NonRepeating(int[] input) {
        int set = 0;
        for (int num : input) set = set ^ num; // bitwise xor
        return set;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1,2,1,2,4 };
        System.out.println(NonRepeating(array));
    }
}
