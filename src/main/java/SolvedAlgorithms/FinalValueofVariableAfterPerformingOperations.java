package SolvedAlgorithms;

/*
    There is a programming language with only four operations and one variable X:
    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.
    Given an array of strings operations containing a list of operations,
    return the final value of X after performing all the operations.
 */

public class FinalValueofVariableAfterPerformingOperations {
    static int FinalValue(String[] operations) {
        int result = 0;
        for(String s : operations) {
            if (s.contains("++"))
                result += 1;
            else result -= 1;
        }
        return result;
    }
}
