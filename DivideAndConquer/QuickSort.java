import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int nums[], int si, int ei) {
        if (si >= ei)
            return;

        // pivot arrangement
        int pivot = nums[ei];
        int j = si - 1;
        for (int i = si; i < ei; i++) {
            if (nums[i] < pivot) {
                j++;
                if (i != j) { // this is required since xor is being used for swapping
                              // it makes both 0 elsewise
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
            }
        }
        j++;
        nums[ei] = nums[j];
        nums[j] = pivot;

        quickSort(nums, si, j - 1);
        quickSort(nums, j + 1, ei);
    }

    public static void main(String[] args) {
        int[] nums = { 9, 3, 4, 5, 1 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
