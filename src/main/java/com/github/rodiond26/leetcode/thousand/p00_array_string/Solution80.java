package com.github.rodiond26.leetcode.thousand.p00_array_string;

class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int pos = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}
