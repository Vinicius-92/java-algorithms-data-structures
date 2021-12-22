package SolvedAlgorithms;

import java.util.HashMap;
import java.util.Locale;

/*
    Should return the first non repeating char of a given string.
 */
public class FirstNonRepeatingChar {
    static char NonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.replace(s.charAt(i), map.get(s.charAt(i)), map.get(s.charAt(i)) + 1);
            else map.put(s.charAt(i), 1);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return s.charAt(i);
        };
        return '_';
    }

    static char NonRepeatingJavaLangTools(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return '_';
    }

    public static void main(String[] args) {
        String s = "aaabccccdeeef";
        System.out.println(NonRepeating(s));
        System.out.println(NonRepeatingJavaLangTools(s));
    }
}
