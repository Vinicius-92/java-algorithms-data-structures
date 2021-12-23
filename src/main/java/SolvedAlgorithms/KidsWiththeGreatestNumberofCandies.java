package SolvedAlgorithms;

import java.util.ArrayList;
import java.util.List;

/*
    There are n kids with candies. You are given an integer array candies, where each candies[i]
    represents the number of candies the ith kid has, and an integer extraCandies,
    denoting the number of extra candies that you have.
    Return a boolean array result of length n, where result[i] is true if,
    after giving the ith kid all the extraCandies, they will have the greatest
    number of candies among all the kids, or false otherwise.
    Note that multiple kids can have the greatest number of candies.
 */

public class KidsWiththeGreatestNumberofCandies {
    static List<Boolean> GreaterNumberOfCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,5,1,3};
        System.out.println(GreaterNumberOfCandies(nums, 3));
    }
}
