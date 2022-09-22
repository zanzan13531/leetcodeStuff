// time: O(n)
// space: O(n)


class Solution {
    public boolean isPalindrome(String s) {
        char[] stringy = s.toLowerCase().toCharArray();
        int start = 0;
        int fin = stringy.length - 1;
        while (fin - start > 1) {
            while (!Character.isLetterOrDigit(stringy[start])) {
                start++;
                if (fin - start <= 0) {
                    return (true);
                }
            }
            while (!Character.isLetterOrDigit(stringy[fin])) {
                fin--;
                if (fin - start <= 0) {
                    return (true);
                }
            }
            if (stringy[start] == stringy[fin]) {
                start++;
                fin--;
            } else {
                return (false);
            }
        }
        if (fin - start <= 0) {
            return (true);
        } else if (!Character.isLetterOrDigit(stringy[start]) || !Character.isLetterOrDigit(stringy[fin])) {
            return (true);
        } else {
            return (stringy[start] == stringy[fin]);
        }
    }
}