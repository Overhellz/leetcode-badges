package com.github.rodiond26.leetcode.thousand.p00_array_string;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int pos = m + n - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[pos] = nums1[first];
                first--;
            } else {
                nums1[pos] = nums2[second];
                second--;
            }
            pos--;
        }

        while (second >= 0) {
            nums1[pos] = nums2[second];
            second--;
            pos--;
        }
    }
}
