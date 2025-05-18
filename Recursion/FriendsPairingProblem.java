public class FriendsPairingProblem {

    // Given n friends, each one can remain single or can be paired up with some
    // other friend.
    // Each friend can only be paired only once.
    // Find out the total no of ways in which friends can remain single or can be
    // paired up.

    public static int pairingWays(int n) {
        if (n == 1 || n == 0)
            return 1;

        return pairingWays(n - 1) + (n - 1) * pairingWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairingWays(n));
    }
}
