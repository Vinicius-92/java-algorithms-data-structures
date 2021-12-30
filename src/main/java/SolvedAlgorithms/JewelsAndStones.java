package SolvedAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static int numJewelsInStonesQuadratic(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) result++;
            }
        }
        return result;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) count++;
        }
        return count;
    }

        public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        String jewels1 = "z", stones1 = "ZZZZZZ";
        System.out.println(numJewelsInStones(jewels, stones));
        System.out.println(numJewelsInStones(jewels1, stones1));
    }
}

