package solvedAlgorithms;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.*;

/*
    Input 2:
    A = ["4", "13", "5", "/", "+"]
    Output 2:
    6
    Explanation 2:
    +: ()+()
    /: ()+(() / ())
    5: ()+(() / (5))
    1: ()+((13) / (5))
    4: (4)+((13) / (5))
    (4)+((13) / (5)) = 6
 */
public class RPNCalculator {
    static int Calculator(ArrayList<String> input) {
        Stack<Integer> stack = new Stack<>();
        for (String s : input) {
            if ("*/-+".contains(s)) {
                int a = stack.pop();
                int b = stack.pop();
                if ("+".equals(s))
                    stack.push(b + a);
                else if ("-".equals(s))
                    stack.push(b - a);
                else if ("*".equals(s))
                    stack.push(b * a);
                else
                    stack.push(b / a);
            } else stack.push(Integer.parseInt(s));
        }
        return stack.peek();
    }

    public static void main(String[] args) throws InvalidArgumentException {
        ArrayList<String> array = new ArrayList<>();
        Collections.addAll(array, "4", "13", "5", "/", "+");
        System.out.println(Calculator(array));
    }
}
