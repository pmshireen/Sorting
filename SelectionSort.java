package DataStructures;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,1};
        Sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            //find the max element in the remaining array and swap with correct index
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static int getMaxIndex(int[] nums, int start, int end) {
        int max = 0;
        int maxelement = nums[0];
        for (int i = start; i <= end; i++) {
            if (nums[i] > maxelement) {
                max = i;
                maxelement = nums[i];
            }
        }
        return max;

    }

}