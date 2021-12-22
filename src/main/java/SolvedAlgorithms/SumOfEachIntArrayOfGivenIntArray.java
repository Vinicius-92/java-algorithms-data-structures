package SolvedAlgorithms;
/*
    Return the value of the biggest sum between all arrays
 */
public class SumOfEachIntArrayOfGivenIntArray {
    int MaximumWealth(int[][] accounts) {
        int maxValue = 0;
        for (int[] i : accounts) {
            int sum = 0;
            for (int value : i) {
                sum += value;
                if (sum > maxValue) maxValue = sum;
            }
        }
        return maxValue;
    }
}
