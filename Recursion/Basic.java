public class Basic {

    // Print numbers from n to 1 (Decreasing Order)
    public static void printNToOne(int n) {
        if (n <= 0)
            return;
        System.out.print(n + " ");
        printNToOne(n - 1);
    }

    // Print numbers from 1 to n (Increasing Order)
    public static void printOneToN(int n) {
        if (n <= 0)
            return;
        printOneToN(n - 1);
        System.out.print(n + " ");
    }

    // Print factorial of a number provided the number is whole
    public static int fact(int n) {
        return n == 0 ? 1 : n * fact(n - 1);
    }

    // Print sum of n natural numbers
    public static int sumOfNNums(int n) {
        return n == 1 ? 1 : n + sumOfNNums(n - 1);
    }

    // Print nth fibonacci number
    public static int fibo(int n) {
        return n == 0 || n == 1 ? n : fibo(n - 1) + fibo(n - 2);
    }

    // checks if sorted from low to high (inclusive)
    public static boolean isSorted(int[] nums, int low, int high) {
        if (low >= high)
            return true;
        int mid = (low + high) / 2;
        return nums[mid] <= nums[mid + 1] && isSorted(nums, low, mid) && isSorted(nums, mid + 1, high);
    }

    // finds the first occurrence of n from index i in nums if not found returns -1
    public static int findFirstN(int[] nums, int n, int i) {
        if (i == nums.length)
            return -1;
        return nums[i] == n ? i : findFirstN(nums, n, i + 1);
    }

    // finds the last occurrence of n from index i backward in nums if not found
    // return -1
    public static int findLastN(int[] nums, int n, int i) {
        if (i == nums.length)
            return -1;
        int forwardIndex = findLastN(nums, n, i + 1);
        return forwardIndex == -1 ? nums[i] == n ? i : -1 : forwardIndex;
    }

    // Returns x ^ n
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return ((1 & n) == 1 ? x : 1) * power(x * x, n / 2);
    }

    private static String removeUtil(String s, StringBuilder unique, boolean[] map, int ind) {
        if (ind == s.length())
            return unique.toString();
        char ch = s.charAt(ind);
        if (!map[ch - 'a']) {
            unique.append(ch);
            map[ch - 'a'] = true;
        }
        return removeUtil(s, unique, map, ind + 1);
    }

    // Remove duplicates in a string
    public static String removeDuplicates(String s) {
        return removeUtil(s, new StringBuilder(), new boolean[26], 0);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("appnnacollege"));
    }
}