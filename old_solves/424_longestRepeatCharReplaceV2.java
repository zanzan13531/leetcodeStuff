// time: O(n)
// space: O(1)

// conceptually the same but looks cleaner


class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
            count.put((char) ('A' + i), 0);
        }
        int maxFreq = 0;
        int maxLen = 0;
        
        for (int r = 0; r < s.length(); r++) {
            char rC = s.charAt(r);
            int x = count.get(rC) + 1;
            count.put(rC, x);
            if (x > maxFreq) {
                maxFreq = x;
            }
            
            if (r - l + 1 - maxFreq > k) {
                char lC = s.charAt(l);
                count.put(lC, count.get(lC) - 1);
                l++;
            }
            
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
            }
        }
        
        return (maxLen);
    }
}



