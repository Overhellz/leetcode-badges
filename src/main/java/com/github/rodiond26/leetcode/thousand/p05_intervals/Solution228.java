package com.github.rodiond26.leetcode.thousand.p05_intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{nums[0], nums[0]});

        for (int i = 1; i < nums.length; i++) {
            int[] last = list.getLast();
            int end = last[1];

            if (nums[i] == end + 1) {
                last[1] = nums[i];
            } else {
                list.add(new int[]{nums[i], nums[i]});
            }
        }

        return list.stream()
                .map(arr -> {
                    if (arr[0] == arr[1]) {
                        return String.valueOf(arr[0]);
                    } else {
                        return arr[0] + "->" + arr[1];
                    }
                })
                .toList();
    }
}
