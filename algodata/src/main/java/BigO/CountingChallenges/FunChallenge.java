package BigO.CountingChallenges;

public class FunChallenge {

    int func(int...n) {
      int a = 10; //O(1)
      a = 50 + 3; //O(1)
        for (int i = 0; i < n.length; i++) { //O(n)
            anotherFunction(); //O(n)
            boolean strange = true; //O(n)
            a++; //O(n)
        }
        return a; //O(1)
    };

    // 4n + 3 = O(4n + 3)

    private void anotherFunction() {
        // does some shady things
    }
}
