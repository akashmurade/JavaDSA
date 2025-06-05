public class Sudoku {

    public static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void solveSudokuUtil(int board[][], int row, int col) {
        for (int i = 1; i < 10; i++) {
            boolean foundValid = true;
            for (int j = 0; j < 9; j++) {
                // checks if the number that is to be placed is applicable according to the
                // column and the row
                if (board[row][j] == i || board[j][col] == i
                        || board[(row / 3) * 3 + j / 3][(col / 3) * 3 + j % 3] == i) {
                    foundValid = false;
                    break;
                }
            }
            if (foundValid) {
                board[row][col] = i;
                boolean foundVacant = false;
                for (int j = row; j < board.length; j++) {
                    int k = j == row ? col + 1 : 0;
                    for (; k < board.length; k++) {
                        if (board[j][k] == 0) {
                            foundVacant = true;
                            break;
                        }
                    }
                    if (foundVacant) {
                        solveSudokuUtil(board, j, k);
                        board[row][col] = 0;
                        break;
                    }
                }
                if (!foundVacant) {
                    printBoard(board);
                }
            }
        }
    }

    // solves 9 x 9 sudoku
    public static void solveSudoku(int board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // finds the starting vacant spot
                if (board[i][j] == 0) {
                    solveSudokuUtil(board, i, j);
                    return;
                }
            }
        }

        System.out.println("Already filled");
    }

    public static void main(String[] args) {
        int board[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        solveSudoku(board);
    }
}
