// time: O(NK) where n is the number of strings and k is the length of the strings
// space: O(NK)



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<int[]> anagrams = new ArrayList<int[]>();
        for (String s : strs) {
            anagrams.add(getAnagram(s));
        }
        
        List<int[]> resultHolder = new ArrayList<int[]>();
        List<List<String>> results = new ArrayList<List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            int j = customIndexOf(resultHolder, anagrams.get(i));
            if (j != -1) {
                results.get(j).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                results.add(temp);
                resultHolder.add(anagrams.get(i));
            }
        }
        
        return (results);
        
    }
    
    private int customIndexOf(List<int[]> resultHolder, int[] anagram) {
        for (int i = 0; i < resultHolder.size(); i++) {
            if (Arrays.equals(resultHolder.get(i), anagram)) {
                return (i);
            }
        }
        return (-1);
    }
    
    private int[] getAnagram(String s) {
        int[] s1 = new int[26];
        
        for (char c : s.toCharArray()) {
            s1[c-97]++;
        }
        return (s1);
    }
    
}