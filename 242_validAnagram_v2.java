class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        
        for (char c : s.toCharArray()) {
            s1[c-97]++;
        }
        for (char c : t.toCharArray()) {
            t1[c-97]++;
        }
        
        return (Arrays.equals(s1, t1));   
    }
}