package SolvedAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateInArray {
    static boolean ContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1,1,1,3,3,4,3,2,4,2 };
        System.out.println(ContainsDuplicate(nums));
    }
}
