package com.jmeritte.leetcode.easy;

class TwoSum {

    // TODO: A améliorer

    /**
     * Bruteforce
     * O(n²)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    return new int[]{i, y};
                }
            }
        }
        return new int[2];
    }
}