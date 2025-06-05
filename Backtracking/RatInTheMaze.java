import java.util.Arrays;

public class RatInTheMaze {

    // Rat in a Maze
    // You are given a starting position for a rat which is stuck in a maze at an
    // initial point (0,0)
    // (the maze can be thought of as a 2-dimensional plane).
    // The maze would be given in the form of a square matrix of order N*N where the
    // cells with value 0
    // represent the maze’s blocked locations while value 1 is the open/available
    // path that the rat can take
    // to reach its destination. The rat's destination is at (N - 1, N - 1).
    // Your task is to find all the possible paths that the rat can take to reach
    // from source to destination in the maze.
    // The possible directions that it can take to move in the maze are:
    // 'U' (up) i.e. (x, y-1),
    // 'D' (down) i.e. (x, y+1),
    // 'L' (left) i.e. (x-1, y),
    // 'R' (right) i.e. (x+1, y).

    public static void printPath(int path[][]) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void solveMazeUtil(int maze[][], int path[][], int row, int col) {

        if (row == maze.length - 1 && col == maze.length - 1) {
            path[row][col] = 1;
            printPath(path);
            return;
        }

        // if there is a wall or out of bounds
        if (row < 0 || col < 0 || row >= maze.length || col >= maze.length || maze[row][col] == 0
                || path[row][col] == 1) {
            return;
        }
        path[row][col] = 1;
        solveMazeUtil(maze, path, row - 1, col); // up
        solveMazeUtil(maze, path, row, col + 1); // right
        solveMazeUtil(maze, path, row + 1, col); // down
        solveMazeUtil(maze, path, row, col - 1); // left
        path[row][col] = 0;
    }

    public static void solveMaze(int maze[][]) {
        int path[][] = new int[maze.length][maze.length];

        solveMazeUtil(maze, path, 0, 0);
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 }
        };
        solveMaze(maze);
    }
}