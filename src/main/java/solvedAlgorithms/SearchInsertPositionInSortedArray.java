package solvedAlgorithms;
/*
    Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the index
    where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.

    Just a binary search and when the number is not in the array, return
    the left pointer, that is where de number should be inserted.
 */
public class SearchInsertPositionInSortedArray {
    static int SearchInsertPosition(int[] nums, int target) {
        int left = 0; //0
        int right = nums.length - 1; // 5
        int middle = 0;
        while(left <= right) {
            middle = (int)Math.floor((left + right) / 2);
            if(target < nums[middle]) right = middle - 1;
            else if(target > nums[middle]) left = middle + 1;
            else return middle;
        }
        return left;
    }
}
