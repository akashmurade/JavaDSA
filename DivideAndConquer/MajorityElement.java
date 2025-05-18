public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = 1;
        int ele = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ele) {
                n++;
            } else {
                n--;
                if (n == 0) {
                    ele = nums[i];
                    n = 1;
                }
            }
        }
        return ele;
    }

    public static int majorityElementDAC(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low];
        }

        int mid = low + (high - low) / 2;

        // left majority
        int lm = majorityElementDAC(nums, low, mid);

        // right majority
        int rm = majorityElementDAC(nums, mid + 1, high);

        if (lm == rm) {
            return lm;
        }

        // left majority count and right majority count
        int lmc = 0, rmc = 0;
        for (int i = low; i <= high; i++) {
            if (nums[i] == lm)
                lmc++;
            if (nums[i] == rm)
                rmc++;
        }

        return lmc > rmc ? lmc : rmc;
    }

    public static void main(String[] args) {

        // Question 2: Given an array nums of size n, return the majority element.
        // (MEDIUM)
        // The majority element is the element that appears more than ⌊n/2⌋ times.
        // You may assume that the majority element always exists in the array.

        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
