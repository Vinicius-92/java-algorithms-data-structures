package BigO.CountingChallenges;

public class AnotherFunChallenge {

    void func(int...input) {
        int a = 5; // O(1)
        int b = 10; // O(1)
        int c = 50; // O(1)
        for (int i = 0; i < input.length; i++) { // O(n)
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)
        }
        for (int j = 0; j < input.length; j++) { // O(n)
            int p = j * 2; // O(n)
            int q = j * 2; // O(n)
        }
        String whoAmI = "I don't know!"; // O(1)
        // 4 + 7n = O(7n + 4) ==> O(n)
    }
}
