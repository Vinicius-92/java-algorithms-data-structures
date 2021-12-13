package BigO.SpaceComplexty;

import java.util.Arrays;

public class BasicConcepts {
    // The space complexity of this function is O(1) because we are
    // not creating any allocated memory than previous received from input
    static void booo(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("Booooo!");
    }

    // The space complexity of this function is O(n) because we are
    // creating an array of strings based on input N
    static String[] arrayOfHiNTimes(int input) {
        String[] hiArray = new String[input];
        for (int i = 0; i < input; i++)
            hiArray[i] = "Hi";
        return hiArray;
    }

    public static void main(String[] args) {
        booo(10);
        System.out.println(Arrays.toString(arrayOfHiNTimes(10)));
    }
}
