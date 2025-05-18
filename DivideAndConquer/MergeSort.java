import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] nums, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int iterFirst = si, iterSecond = mid + 1, iterTemp = 0;

        while (iterFirst <= mid && iterSecond <= ei) {
            if (nums[iterFirst] < nums[iterSecond]) {
                temp[iterTemp++] = nums[iterFirst++];
            } else {
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
    }

    public static void mergeSort(int[] nums, int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);
        merge(nums, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] nums = { 9, 3, 4, 5, 1 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }
}