package com.jmeritte.leetcode.easy;

import java.util.Arrays;

class ValidAnagram {

    /**
     * Frequency counting
     * O(n) - 6ms (42mb)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] compteurs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            compteurs[s.charAt(i) - 'a']++;
            compteurs[t.charAt(i) - 'a']--;
        }

        for (int compte : compteurs) {
            if (compte != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Sorting Arrays
     * O(n log n) - 3ms
     */
    public boolean isAnagram2(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        return Arrays.equals(ss, ts);
    }

    /**
     * Bruteforce
     * O(n²) - 269ms
     * indexOf() ajoute une itération n qui fait passer à n²
     */
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (Character c : s.toCharArray()) {
            int index = t.indexOf(c);
            if (index == -1) {
                return false;
            }
            t = t.substring(0, index) + t.substring(index + 1);
        }
        return true;
    }
}