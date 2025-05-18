
public class PracticeProblems {

    // Question 1: For a given integer array of size N. You have to find all the
    // occurrences (indices) of a given element (Key) and print them. Use a
    // recursive function to solve this problem.
    // Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
    // Sample Output: 1 5 7 8

    public static void printAllOccurrences(int nums[], int key, int i) {
        if (i == nums.length)
            return;
        if (nums[i] == key) {
            System.out.print(i + " ");
        }
        printAllOccurrences(nums, key, i + 1);
    }

    // Question 2: You are given a number (e.g., 2019), convert it into a String of
    // English like “two zero one nine”. Use a recursive function to solve this
    // problem. NOTE - The digits of the number will only be in the range 0-9 and
    // the last digit of a number can’t be 0.
    // Sample Input: 1947
    // Sample Output: “one nine four seven”

    private static void numToStringUtil(StringBuffer numString, String nums[], int n) {
        if (n == 0)
            return;
        numToStringUtil(numString, nums, n / 10);
        System.out.print(nums[n % 10] + " ");
    }

    // Question 3: Write a program to find Length of a String using Recursion.

    private static int strLenUtil(StringBuffer s) {
        if (s.toString().isEmpty())
            return 0;
        return 1 + strLenUtil(s.deleteCharAt(0));
    }

    public static int strLen(String s) {
        return strLenUtil(new StringBuffer(s));
    }

    // Question 4: We are given a string S, we need to find the count of all
    // contiguous substrings
    // starting and ending with the same character.
    // Sample Input 1: S = "abcab"
    // Sample Output 1: 7
    // There are 15 substrings of "abcab": a, ab, abc, abca, abcab, b, bc, bca,
    // bcab, c, ca, cab, a, ab, b.
    // Out of the above substrings, there are 7 substrings: a, abca, b, bcab, c, a,
    // and b.
    // So, only 7 contiguous substrings start and end with the same character.
    // Sample Input 2: S = "aba"
    // Sample Output 2: 4
    // The substrings are a, b, a, and aba.

    private static int substringUtil(String str, int s, int e) {
        if (s == str.length()) {
            return 0;
        }
        if (e == str.length()) {
            return substringUtil(str, s + 1, s + 1);
        }
        return (str.charAt(s) == str.charAt(e) ? 1 : 0) + substringUtil(str, s, e + 1);
    }

    public static int substringWithSameSAE(String s) {
        return substringUtil(s, 0, 0);
    }

    public static String numToString(int n) {
        String nums[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        StringBuffer numString = new StringBuffer();
        numToStringUtil(numString, nums, n);
        return numString.toString();
    }

    // Question 5: TOWER OF HANOI (Important!)
    // You have 3 towers and N disks of different sizes which can slide onto any
    // tower.
    // The puzzle starts with disks sorted in ascending order of size from top to
    // bottom
    // (i.e., each disk sits on top of an even larger one). You have the following
    // constraints:
    // (1) Only one disk can be moved at a time.
    // (2) A disk is slid off the top of one tower onto another tower.
    // (3) A disk cannot be placed on top of a smaller disk.
    // Write a program to move the disks from the first tower to the last using
    // Stacks.
    // Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
    // An example with 2 disks i.e., N = 2:
    // Step 1: Shift the first disk from 'A' to 'B'.
    // Step 2: Shift the second disk from 'A' to 'C'.
    // Step 3: Shift the first disk from 'B' to 'C'.
    // An example with 3 disks i.e., N = 3:
    // Step 1: Shift the first disk from 'A' to 'C'.
    // Step 2: Shift the second disk from 'A' to 'B'.
    // Step 3: Shift the first disk from 'C' to 'B'.
    // Step 4: Shift the third disk from 'A' to 'C'.
    // Step 5: Shift the first disk from 'B' to 'A'.
    // Step 6: Shift the second disk from 'B' to 'C'.
    // Step 7: Shift the first disk from 'A' to 'C'.

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Disk " + n + " moved from " + from_rod + " to " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
}
