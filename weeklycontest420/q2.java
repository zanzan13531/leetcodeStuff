class Solution {
    public int numberOfSubstrings(String s, int k) {
        char[] chars;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            chars = new char[26];
            for (int j = i; j < s.length(); j++) {
                chars[s.charAt(j) - 'a']++;
                for (int x = 0; x < 26; x++) {
                    if (chars[x] >= k) {
                        num++;
                        break;
                    }
                }
            }
        }
        return num;
    }
}