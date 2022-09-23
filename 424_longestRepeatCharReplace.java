// time: O(n)
// space: O(1)


class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
            count.put((char) ('A' + i), 0);
        }
        int maxFreq = 0;
        int maxLen = 0;
        
        while (l < s.length() - k) {
            while (r < s.length() && (r - l) - maxFreq <= k) {
                int x = count.get(s.charAt(r)) + 1;
                count.put(s.charAt(r), x);
                if (x > maxFreq) {
                    maxFreq = x;
                }
                r++;
            }
            if ((r - l) - maxFreq <= k && r - l > maxLen) {
                maxLen = r - l;
            } else {
                if (r - l - 1 > maxLen) {
                    maxLen = r - l - 1;
                }
            }
            count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
            l++;
        }
        return (maxLen);
    }
}



