package BigO.SpeedComplexity;

public class DropNonDominantsRule {

    /*
    *  This function full declaration could be O(n + n^2)
    * but as only the dominant is relevant as the input increases
    * we could simplify as O(n^2)
    */
    static void printAllNumbersThenAllParisSum(int...input) {
        System.out.println("These are all the numbers");
        for (int i : input)
            System.out.println(i);
        System.out.println("These are all their sums");
        for (int k : input) {
            for (int i : input)
                System.out.println(k + i);
        }
    }

    public static void main(String[] args) {
        printAllNumbersThenAllParisSum(1, 2, 3, 4, 5);
    }
}
