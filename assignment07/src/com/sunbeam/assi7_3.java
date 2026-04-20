package com.sunbeam;

import java.util.*;

public class assi7_3 {

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int low, int high, int kIndex) {

        int pivot = nums[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, high);

        if (i == kIndex) return nums[i];
        else if (i < kIndex) return quickSelect(nums, i + 1, high, kIndex);
        else return quickSelect(nums, low, i - 1, kIndex);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
