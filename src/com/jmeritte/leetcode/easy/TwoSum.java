package com.jmeritte.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    // TODO: A améliorer

    /**
     * HashMap
     * 0(n)
     * 2ms (beats 98.83%)
     * 45mb (beats 45.48%)
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> restants = new HashMap<>();

        Integer valeur = null;
        for (int i = 0; i < nums.length; i++) {
            valeur = restants.get(nums[i]);
            if (valeur != null) {
                return new int[] { valeur, i };
            }
            restants.put(target - nums[i], i);
        }

        return new int[] {};
    }

    /**
     * Bruteforce
     * O(n²)
     * 45ms (beats 33%)
     * 45mb (beats 29%)
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