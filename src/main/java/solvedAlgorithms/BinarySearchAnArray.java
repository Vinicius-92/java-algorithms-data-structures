package solvedAlgorithms;
/*
    Given an array of integers nums which is sorted in ascending order,
    and an integer target, write a function to search target in nums.
    If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearchAnArray {
    static int BinarySearch(int[] nums, int target) {
        int left = 0; //0
        int right = nums.length - 1; // 5
        while(left <= right) {
            int middle = (int)Math.floor((left + right) / 2);
            if(target < nums[middle]) right = middle - 1;
            else if(target > nums[middle]) left = middle + 1;
            else return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-1,0,3,5,9,12};
        System.out.println(BinarySearch(array, 9));
    }
}
