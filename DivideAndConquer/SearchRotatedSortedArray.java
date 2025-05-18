public class SearchRotatedSortedArray {

    public static int rotatedArraySearch(int nums[], int target, int si, int ei) {
        if (si > ei)
            return -1;
        int mid = si + (ei - si) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // if left half is sorted
        if (nums[mid] >= nums[si]) {
            // if the number is in this sorted part
            if (target >= nums[si] && target < nums[mid]) {
                return rotatedArraySearch(nums, target, si, mid - 1);
            }
            // if not recurse the other part
            else {
                return rotatedArraySearch(nums, target, mid + 1, ei);
            }
        }

        // else right half is sorted
        else {
            // if the element is in this sorted part
            if (target > nums[mid] && target <= nums[ei]) {
                return rotatedArraySearch(nums, target, mid + 1, ei);
            }
            // recurse the other part
            else {
                return rotatedArraySearch(nums, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(rotatedArraySearch(nums, 5, 0, nums.length - 1));
    }
}
