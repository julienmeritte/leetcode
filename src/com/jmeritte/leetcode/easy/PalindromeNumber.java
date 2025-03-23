package com.jmeritte.leetcode.easy;

class PalindromeNumber {

    /**
     * Two pointers en convertissant en String
     * O(n)
     * 6ms (beats 29%)
     * 44mb (beats 47%)
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String phrase = String.valueOf(x);

        for (int i = 0, j = phrase.length() - 1; i < j; i++, j--) {
            if (phrase.charAt(i) != phrase.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Palindrome improvisé ??
     * O(n)
     * 5ms (72%)
     * 44mb (17%)
     */
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;

        int xCopy = x;
        int length = 0;

        do {
            length++;
            xCopy /= 10;
        } while (xCopy > 0);

        int[] debut = new int[length / 2];
        int[] fin = new int[length / 2];

        for (int a = 0, indexDebut = length / 2 - 1; a < length; a++) {
            if (length % 2 == 1 && a == length / 2) {
                x /= 10;
                continue;
            }
            if (a < length / 2) {
                fin[a] = x % 10;
            } else {
                debut[indexDebut] = x % 10;
                indexDebut--;
            }
            x /= 10;
        }

        for (int a = 0; a < length / 2; a++) {
            if (debut[a] != fin[a]) {
                return false;
            }
        }

        return true;
    }

    private long power(int exposant) {
        int result = 1;
        for (int a = 0; a < exposant; a++) {
            result *= 10;
        }
        return result;
    }
}