package SolvedAlgorithms;

public class LongestCommonPrefix {
    static String Prefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] input = new String[] { "flower", "flow", "flight" };
        System.out.println(Prefix(input));
    }
}
