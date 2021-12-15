package Algorithms;

/*
    Steps:
    1 - Identify base case
    2 - Identify recursive case
    3 - Get closer until have return value, usually having 2 returns
 */

public class Recursion {

    static void Inception(int count) {
        while (count < 10) {
            Inception(count - 1);
            count++;
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        Inception(10);
    }
}
