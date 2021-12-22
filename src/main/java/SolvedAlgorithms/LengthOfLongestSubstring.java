package SolvedAlgorithms;
/*
    Given a string s, find the length of the longest substring without repeating characters.
 */

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    static int LongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            result = Math.max(result, i - start + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(LongestSubstring(s));
    }
}
