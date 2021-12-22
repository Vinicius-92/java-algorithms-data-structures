package SolvedAlgorithms;

public class LongestCommonPrefix {
    static String Prefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(result) != 0)
                result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = new String[] { "flower", "flow", "flight" };
        System.out.println(Prefix(input));
    }
}
