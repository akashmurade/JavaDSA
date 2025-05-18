public class InversionCount {

    private static int merge(int[] nums, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int iterFirst = si, iterSecond = mid + 1, iterTemp = 0;
        int inversions = 0;

        while (iterFirst <= mid && iterSecond <= ei) {
            if (nums[iterFirst] <= nums[iterSecond]) {
                temp[iterTemp++] = nums[iterFirst++];
            } else {
                inversions += mid - iterFirst + 1;
                temp[iterTemp++] = nums[iterSecond++];
            }
        }

        while (iterFirst <= mid) {
            temp[iterTemp++] = nums[iterFirst++];
        }

        while (iterSecond <= ei) {
            temp[iterTemp++] = nums[iterSecond++];
        }

        for (int i = 0; i < ei - si + 1; i++) {
            nums[si + i] = temp[i];
        }
        return inversions;
    }

    public static int mergeSort(int[] nums, int si, int ei) {
        if (si == ei) {
            return 0;
        }
        int inversions = 0;
        int mid = si + (ei - si) / 2;
        inversions += mergeSort(nums, si, mid);
        inversions += mergeSort(nums, mid + 1, ei);
        inversions += merge(nums, si, mid, ei);
        return inversions;
    }

    public static int inversionCount(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    // Question 3: Given an array of integers. Find the Inversion Count in the
    // array. (HARD)
    // Inversion Count: For an array, inversion count indicates how far (or close)
    // the array is from being sorted.
    // If the array is already sorted then the inversion count is 0.
    // If an array is sorted in the reverse order then the inversion count is the
    // maximum.
    // Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i <
    // j.
    // Sample Input 1: N = 5, arr[] = {2, 4, 1, 3, 5}
    // Sample Output 1: 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3)

    public static void main(String[] args) {

        int[] nums = { 5, 5, 5 };
        System.out.println(inversionCount(nums));
    }
}
