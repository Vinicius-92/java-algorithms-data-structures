package SolvedAlgorithms;

public class RomanToInteger {
    static int Converter(String s) {
        int result = 0;
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    if (i != 0 && input[i - 1] == 'I')
                        result -= 2;
                    break;
                case 'X':
                    result += 10;
                    if (i != 0 && input[i - 1] == 'I')
                        result -= 2;
                    break;
                case 'L':
                    result += 50;
                    if (i != 0 && input[i - 1] == 'X')
                        result -= 20;
                    break;
                case 'C':
                    result += 100;
                    if (i != 0 && input[i - 1] == 'X')
                        result -= 20;
                    break;
                case 'D':
                    result += 500;
                    if (i != 0 && input[i - 1] == 'C')
                        result -= 200;
                    break;
                case 'M':
                    result += 1000;
                    if (i != 0 && input[i - 1] == 'C')
                        result -= 200;
                    break;

            }
        }
        return result;
    }
}
