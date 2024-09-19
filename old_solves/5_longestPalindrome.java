class Solution {
    public String longestPalindrome(String s) {
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            
            int variance = 0;
            
            // for symmetry around a certain character, example: "aba"
            while (i - variance - 1 >= 0 && i + variance + 1 <= s.length() - 1) {
                if (s.charAt(i - variance - 1) == s.charAt(i + variance + 1)) {
                    variance++;
                } else {
                    break;
                }
            }
            String tempLongest = s.substring(i - variance, i + variance + 1);
            if (tempLongest.length() > longest.length()) {
                longest = tempLongest;
            }
        
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            
            // for symmetry around 2 characters, example: "abba"
            int variance = 0;
            if (s.charAt(i) != s.charAt(i + 1)) {
                continue;
            }
            while (i - variance - 1 >= 0 && i + variance + 1 + 1 <= s.length() - 1) {
                if (s.charAt(i - variance - 1) == s.charAt(i + variance + 1 + 1)) {
                    variance++;
                } else {
                    break;
                }
            }
            
            String tempLongest = s.substring(i - variance, i + variance + 1 + 1);
            if (tempLongest.length() > longest.length()) {
                longest = tempLongest;
            }
            
        }
        
        return (longest);
        
    }
}