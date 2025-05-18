import java.util.Scanner;

public class Array {

    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void incrementEachByOne(int nums[]) {
        // since arrays here are passed by reference there value will be changed in the passed array
        for(int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
    }

    public static int linearSearch(int nums[], int key) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchMenu(String menu[], String key) {
        for(int i = 0; i < menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestInArr(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int nums[], int key) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int nums[]) {
        int len = nums.length;
        for(int i = 0; i < len / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[len - 1 - i];
            nums[len - 1 - i] = temp;
        }
    }

    public static void printPairs(int nums[]) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ( j == nums.length - 1 && i == nums.length - 2 ? ")" : "), "));
            }
        }
        System.out.println();
    }

    public static void printSubArrays(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                System.out.print("(");
                for(int k = i; k <= j; k++) {
                    System.out.print(nums[k] + (k == j ? "" : ", "));
                }
                System.out.print((i == nums.length - 1 && j == nums.length - 1) ? ")" : "), ");
            }
        }
        System.out.println();
    }

    public static void extremeSumSubArrays(int nums[]) {
        int largestSum = Integer.MIN_VALUE;
        int smallestSum = Integer.MAX_VALUE;

        int largestSubArray[] = new int[2], smallestSubArray[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                if(currSum > largestSum) {
                    largestSubArray[0] = i;
                    largestSubArray[1] = j;
                    largestSum = currSum;
                }
                if(currSum < smallestSum) {
                    smallestSubArray[0] = i;
                    smallestSubArray[1] = j;
                    smallestSum = currSum;
                }
            }
        }
        // Prints largest summed sub array
        System.out.print("Largest Sub Array: (");
        for(int k = largestSubArray[0]; k <= largestSubArray[1]; k++) {
            System.out.print(nums[k] + (k == largestSubArray[1] ? "" : ", "));
        }
        System.out.println(")");
        // Prints sum of the largest sub array
        System.out.println("Sum: " + largestSum);

        // Prints smallest summed sub array 
        System.out.print("Smallest Sub Array: (");
        for(int k = smallestSubArray[0]; k <= smallestSubArray[1]; k++) {
            System.out.print(nums[k] + (k == smallestSubArray[1] ? "" : ", "));
        }
        System.out.println(")");
        // Prints sum of the smallest sub array
        System.out.println("Sum: " + smallestSum);
    }

    public static boolean repeats(int nums[]) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int minSearch(int nums[]) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid - 1] > nums[mid]) {
                return mid;
            }
            if (nums[low] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Returns index of a target from a array which is sorted asc and rotated afterwards
    public static int search(int nums[], int target) {
        int minValI = minSearch(nums);
        int low = 0, high = nums.length - 1;
        if(target <= nums[high]) {
            low = minValI;
        } else {
            high = minValI - 1;
        }
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void printTripletsC(int nums[]) {
        int len = nums.length;
        for(int i = 0; i < len - 2; i++) {
            for(int j = i + 1; j < len - 1; j++) {
                for(int k = j + 1; k < len; k++) {
                    if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
                    }
                }
            }
        }
    }

    public static int maxSubArraySum(int nums[]) {
        // TC = O(n^3)
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i; j < nums.length; j++) {
        //         int currSum = 0;
        //         for(int k = i; k <= j; k++) {
        //             currSum += nums[k];
        //         }
        //         maxSum = maxSum < currSum ? currSum : maxSum; // maxSum = max(maxSum, currSum)
        //     }
        // }
        // return maxSum;

        // TC = O(n^2)
        // SC = O(n)
        // if(nums.length == 0) {
        //     return 0;
        // }
        // int prefix[] = new int[nums.length];
        // prefix[0] = nums[0];
        // int maxSum = nums[0];
        // for(int i = 1; i < prefix.length; i++) {
        //     prefix[i] = prefix[i - 1] + nums[i];
        //     maxSum = maxSum < prefix[i] ? prefix[i] : maxSum;
        // }

        // for(int i = 1; i < nums.length; i++) {
        //     for(int j = i; j < nums.length; j++) {
        //         int currSum = prefix[j]-prefix[i-1];
        //         maxSum = maxSum < currSum ? currSum : maxSum; // maxSum = max(maxSum, currSum)
        //     }
        // }
        // return maxSum;

        // Kadane's Algorithm
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Array
        // List of elements of same type placed in contiguous memory locations

        // Creating an array
        // dataType arrayName[] = new dataType[size];
        // int marks[] = new int[50];
        // int numbers[] = {1, 2, 3};

        // Input
        // int marks[] = new int[20];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Physics: " + marks[0]);
        // System.out.println("Chemistry: " + marks[1]);
        // System.out.println("Mathematics: " + marks[2]);
        
        // // Updation
        // marks[2] = 100;
        // System.out.println("Mathematics: " + marks[2]);

        // length
        // System.out.println("Length: " + marks.length);

        // Array as function argument
        // int marks[] = {1, 2, 3};
        // printArray(marks);
        // incrementEachByOne(marks);
        // printArray(marks);

        // Linear Search
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;
        // int index = linearSearch(numbers, key);
        // if(index == -1) {
        //     System.out.println("Not Found");
        // } else {
        //     System.out.println("Index: " + index);
        // }

        // Menu
        // String menu[] = {"dosa", "samosa", "coffee", "tea", "bhendi", "gawar", "flower", "Udid Vade"};
        // String key = "coffee";
        // int index = linearSearchMenu(menu, key);
        // if(index == -1) {
        //     System.out.println("Not Found");
        // } else {
        //     System.out.println("Index: " + index);
        // }

        // Largest Num in Array
        // int nums[] = {1, 2, 3, 4, 5, 8, 7, 6};
        // System.out.println("Largest: " + largestInArr(nums));

        // Binary Search 
        // int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 16};
        // int key = 5;
        // System.out.println("Index of " + key + ": " + binarySearch(nums, key));

        // Reverse an Array
        // int nums[] = {1, 2, 3, 4, 5, 7, 8, 10, 16};
        // reverseArray(nums);
        // printArray(nums);
        
        // Print pairs
        // int nums[] = {2, 4, 6, 8, 10};
        // printPairs(nums);

        // Print Sub Arrays
        // int nums[] = {-1, 4, 6, 8, 10};
        // printSubArrays(nums);
        // extremeSumSubArrays(nums); // Print sum of extreme sub arrays

        // Max Sub Array Sum
        // int nums[] = {-1, 2, -1, 10};
        // System.out.println(maxSubArraySum(nums));

        // Assignment
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        // int nums[] = {1, 2, 3};
        // System.out.println(repeats(nums));

        // There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity

        // int nums[] = {4, 5, 6, 7, 0, 1, 2, 3};
        // System.out.println(search(nums, 7));

        // Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]

        int nums[] = {-1, 0, 1, 2, -2, 4, -4};
        printTripletsC(nums);

    }
}