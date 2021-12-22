package SolvedAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class MajorityInArray {
    static int Maj(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!map.containsKey(input[i]))
                map.put(input[i], 1);
            else {
                map.put(input[i], map.get(input[i]) + 1) ;
                if (map.get(input[i]) > (int) Math.floor(input.length / 2))
                    return input[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[] {2,2,1,1,1,2,2};
        System.out.println(Maj(ints));
    }
}
