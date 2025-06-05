import java.util.Arrays;

public class Basic {

    public static void changeArr(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }

        arr[i] = i + 1;
        changeArr(arr, i + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printSubsets(String s, StringBuilder subset, int i) {
        if (i == s.length()) {
            System.out.print(subset + "\t");
            return;
        }
        subset.append(s.charAt(i));
        printSubsets(s, subset, i + 1);
        subset.deleteCharAt(subset.length() - 1);

        printSubsets(s, subset, i + 1);
    }

    public static void printPermutations(StringBuilder s, int i) {
        if (i == s.length()) {
            System.out.print(s + "\t");
        }

        for (int it = i; it < s.length(); it++) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(it));
            s.setCharAt(it, temp);
            printPermutations(s, i + 1);

            s.setCharAt(it, s.charAt(i));
            s.setCharAt(i, temp);
        }
    }

    public static void printBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print((board[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void nQueensUtil(boolean[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) { // i represents the column in which we are trying to check if the queen
                                                 // fits
            boolean isSafe = true;
            for (int j = 0; j < row; j++) {
                // if another queen is present vertically up or left diagonal or right diagonal
                if (board[j][i] || (i - row + j >= 0 && board[j][i - row + j])
                        || (i + row - j < board.length && board[j][i + row - j])) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                board[row][i] = true;
                nQueensUtil(board, row + 1);
                board[row][i] = false;
            }
        }
    }

    public static void nQueens(int n) {
        boolean[][] board = new boolean[n][n];
        nQueensUtil(board, 0);
    }

    public static int gridWays(int a, int b, int n, int m) {
        if (a == n - 1 && b == m - 1) {
            return 1;
        }
        if (a >= n || b >= m) {
            return 0;
        }

        int cnt = 0;
        cnt += gridWays(a, b + 1, n, m); // right
        cnt += gridWays(a + 1, b, n, m); // down

        return cnt;
    }

    public static int linearGridWays(int n, int m) {
        int ways = 1;

        for (int i = n + m - 2; i > Math.max(n - 1, m - 1); i--) {
            ways *= i;
        }

        for (int i = Math.min(n - 1, m - 1); i > 1; i--) {
            ways /= i;
        }
        return ways;
    }

    public static void main(String[] args) {

        // changeArr
        // int arr[] = new int[5];
        // changeArr(arr, 0);
        // System.out.println(Arrays.toString(arr));

        // printSubsets
        // String s = "abc";

        // printSubsets(s, new StringBuilder(), 0);

        // printPermutations
        // String s = "abc";

        // printPermutations(new StringBuilder(s), 0);

        // nQueens
        nQueens(5);

        // gridWays
        // System.out.println(gridWays(0, 0, 3, 4));

        // linearGridWays
        // System.out.println(linearGridWays(2, 3));
    }
}