package BigO.SpeedComplexity;

import java.util.ArrayList;
import java.util.Collections;

public class O1 {

    // This functions uses constant time, which is notation O(1)
    // even when the amount of operations increase (2, 3,...100...)
    // we still call it O(1) --> constant time
    static void firstBoxes(int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(2)
    }

    public static void main(String[] args) {
        int[] boxes = new int[]{1, 2, 3, 4, 5, 6, 7};
        firstBoxes(boxes); // O(2)
    }
}
