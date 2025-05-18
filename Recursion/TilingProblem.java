public class TilingProblem {

    // Given a "2 X n" floor and tiles of size "2 X 1", count the number of ways to
    // tile the given floor using the tiles.
    // A tile can either be placed horizontally or vertically

    public static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingWays(n - 1) + tilingWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(tilingWays(5));

    }
}