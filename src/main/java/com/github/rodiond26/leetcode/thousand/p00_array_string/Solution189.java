package com.github.rodiond26.leetcode.thousand.p00_array_string;

class Solution189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int n = nums.length;

        k = k % n;
        if (k == 0) {
            return;
        }

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % n; // TODO snippet
            temp[index] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
