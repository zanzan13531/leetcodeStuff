// time: O(n)
// space: O(n)

// looks cleaner than the other two solutions


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                chars.add(s.charAt(i));
            }
        }
        
        for (int i = 0; i < chars.size() / 2; i++) {
            if (chars.get(i) != chars.get(chars.size() - 1 -i)) {
                return (false);
            }
        }
        return (true);
    }
}