package com.github.rodiond26.leetcode.thousand.p00_array_string;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[pos]) {
                continue;
            }
            pos++;
            nums[pos] = nums[i];
        }
        return pos + 1;
    }
}
