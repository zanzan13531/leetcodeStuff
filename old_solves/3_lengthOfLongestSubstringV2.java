// time: O(n)
// space: O(1)

// same as other solution but looks a bit cleaner


class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> chars = new ArrayList<Character>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = chars.indexOf(c);
            if (index != -1) {
                for (int j = 0; j <= index; j++) {
                    chars.remove(0);
                }
            }
            chars.add(c);
            if (chars.size() > max) {
                max = chars.size();
            }
        }
        return (max);
        
    }
}