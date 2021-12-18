package solvedAlgorithms;
/*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    Ex:
    Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

        =============== HINT ================
        FIBONACCI ONLY STARTING THE ARRAY AT 1 AND NOT ZERO.
 */
public class ClimbingStairsCountWaysToDoIt {
    int climbStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
