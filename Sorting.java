import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for(int j = 0; j < n - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) {
                return;
            }
        }
    }

    public static void selectionSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            int minInd = i;
            for(int j = i + 1; j < n; j++) {
                if(nums[j] < nums[minInd]) {
                    minInd = j;
                }
            }
            if(i != minInd) {
                int temp = nums[i];
                nums[i] = nums[minInd];
                nums[minInd] = temp;
            }
        }
    }

    public static void insertionSort(int nums[]) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int curr = i;
            int temp = nums[curr]; // here temp stores the no to be placed
            while(curr > 0 && temp < nums[curr - 1]) {
                nums[curr] = nums[curr - 1];
                curr--;
            }
            nums[curr] = temp;
        }
    }

    public static void countingSort(int nums[]) {
        int n = nums.length;
        int range = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(range < nums[i]) {
                range = nums[i];
            }
        }

        int freq[] = new int[range + 1];
        for(int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int curr = 0;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                nums[curr] = i;
                curr++;
                freq[i]--;
            }
        }
    }

    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // Bubble Sort
        // int nums[] = {4, 2, 3, 1};
        // bubbleSort(nums);
        // printArray(nums);

        // Selection Sort
        // int nums[] = {4, 2, 3, 1};
        // selectionSort(nums);
        // printArray(nums);

        // Insertion Sort
        // int nums[] = {4, 2, 3, 1};
        // insertionSort(nums);
        // printArray(nums);

        // InBuilt Sort
        // int nums[] = {4, 2, 3, 1};
        // Arrays.sort(nums);
        // printArray(nums);
        
        // for descending
        // Integer nums[] = {4, 2, 3, 1};
        // Arrays.sort(nums, Collections.reverseOrder());
        // for(int i = 0; i < nums.length; i++) {
            //     System.out.print(nums[i] + " ");
            // }
            // System.out.println();
            
            // Counting sort
            // int nums[] = {4, 2, 3, 1};
            // countingSort(nums);
            // printArray(nums);
            
        }
    }
    