class Solution {
    private long power(int exposant) {
        int result = 1;
        for (int a = 0; a < exposant; a++) {
            result *= 10;
        }
        return result;
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

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
}