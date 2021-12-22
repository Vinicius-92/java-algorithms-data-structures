package SolvedAlgorithms;

public class LengthOfLastWord {
    static int LengthWithJavaMethods(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ")- 1;
    }

    // In this case the method will ignore all the empty spaces
    // at the end, cause will only return count after is greater than 0
    // which will only happen after finding the last world
    static int Length(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ')count++;
            else if(count > 0) return count;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(Length(s));
    }
}
