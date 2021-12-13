package solvedAlgorithms;

public class waysToDecodeAlphabetToInt {

    static int waysToDecode(String A) {
        double number = Double.parseDouble(A);
        int count = 0;
        if(number >= Math.pow(10, 9) + 7 || number == 0) {
            return count;
        } else if(A.length() == 1) {
            return 1;
        } else {
            Long[] array = new Long[A.length()];
            for (int i = 0; i < array.length; i++) {
                array[i] = Long.parseLong(String.valueOf(A.charAt(i)));
            }
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i + 1] == 0 && array[i] > 2) return 0;
                if(array[i] + array[i + 1] < 27 || array[i + 1] != 0) {
                    count++;
                }
            }
        }
        return count;
    };

    public static void main(String[] args) {
        // should return 4
        // link to interview problem : https://www.interviewbit.com/problems/ways-to-decode/submissions/
        System.out.println(waysToDecode("2611055971756562"));
    }
}
