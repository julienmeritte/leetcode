package com.jmeritte.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /**
         * HashSet classique
         * O(n) - 11ms
         */
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }

        return false;

        /**
         * HashSet (Comparaison taille)
         * O(n) - 17ms
         */
        /*
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        if (numbers.size() != nums.length) {
            return true;
        }

        return false
        */

        /**
         * HashSet (Comparaison Stream)
         * O(n) - 21ms
         */
        /*
        Set<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        if (numbers.size() != nums.length) {
            return true;
        }

        return false;
        */

        /**
         * Array Sorting
         * O(n log n) - 20ms
         */
        /*
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
        */

        /**
         * Bruteforce
         * O(n²) - Timelimit exceeded
         */
        /*
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] == nums[b]) {
                    return true;
                }
            }
        }
        return false;
         */

    }
}