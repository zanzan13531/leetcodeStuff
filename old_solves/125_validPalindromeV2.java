// time: O(n)
// space: O(1)


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = s.length();
        int start = 0;
        int end = l - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (end <= start) {
                break;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return (false);
            }
            start++;
            end--;
        }
        return (true);
    }
}