import java.util.Scanner;

public class Matrix {

    public static void printSpiral(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int topBound = 0, bottomBound = n - 1, leftBound = 0, rightBound = m - 1;
        for(int i = 0; i < (Math.min(n, m) + 1) / 2; i++) {

            // top
            for(int j = leftBound; j <= rightBound; j++) {
                System.out.print(matrix[topBound][j] + " ");
            }
            topBound++;

            // right
            for(int j = topBound; j <= bottomBound; j++) {
                System.out.print(matrix[j][rightBound] + " ");
            }
            rightBound--;

            // bottom
            for(int j = rightBound; j >= leftBound; j--) {
                System.out.print(matrix[bottomBound][j] + " ");
            }
            bottomBound--;

            // left
            for(int j = bottomBound; j >= topBound; j--) {
                System.out.print(matrix[j][leftBound] + " ");
            }
            leftBound++;
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        if(matrix.length != matrix[0].length) { // checks if it has are the rows equal to the column assuming it is not jagged
            return -1;
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }
        if(n % 2 != 0) {
            sum -= matrix[n/2][n/2];
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j <= matrix[0].length - 1) {
            if(matrix[i][j] == key) {
                System.out.println("i: " + i + ", j: " + j);
                return true;
            } else if(matrix[i][j] > key) {
                i--;
            } else if(matrix[i][j] < key) {
                j++;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void printMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // Declaring a matrix(2D Array)
        // int matrix[][] = new int[3][3];

        // // Taking input and storing elements
        // System.out.println("Input Matrix Elements");
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[0].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // // Printing elements
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Spiral Matrix
        // int matrix[][] = { 
        //     {1, 2, 3, 4, 1},
        //     {5, 6, 7, 8, 1},
        //     {9, 10, 11, 12, 1},
        //     {13, 14, 15, 16, 1},
        //     {17, 18, 19, 20, 1}
        // };
        
        // printSpiral(matrix);

        // Diagonal Sum
        // int matrix[][] = { 
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16},
        // };
        // int matrix[][] = {
        //     {0, 1, 2},
        //     {3, 4, 5},
        //     {6, 7, 8}
        // };
        // System.out.println(diagonalSum(matrix));

        // Search in sorted matrix
        // int matrix[][] = {
        //     {10, 20, 30, 40},
        //     {15, 25, 35, 45},
        //     {27, 29, 37, 48},
        //     {32, 33, 39, 50}
        // };

        // System.out.println(staircaseSearch(matrix, 34));

        // Assignment
        // Print the number of 7’s that are inthe 2d array

        // int arr[][] = { {4, 7, 8}, {8, 8, 7} };
        // int count = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[0].length; j++) {
        //         if(arr[i][j] == 7) {
        //             count ++;
        //         }
        //     }
        // }
        // System.out.println("Count of 7 is " + count);

        // Print out the sum of the numbers inthe second row of the “nums” array.
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // int sum = 0;
        // for(int j = 0; j < nums[1].length; j++) {
        //     sum += nums[1][j];
        // }
        // System.out.println("Sum of numbers in second row is " + sum);

        // Write a program to FindTransposeofa Matrix
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // printMatrix(nums);
        // System.out.println();
        // int[][] transpose = new int[nums[0].length][nums.length];
        // for(int j = 0; j < nums[0].length; j++) {
        //     for(int i = 0; i < nums.length; i++) {
        //         transpose[j][i] = nums[i][j];
        //     }
        // }
        // printMatrix(transpose);
    }
}
