// time: O(NK) where n is the number of strings and k is the length of the strings
// space: O(NK)


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<Integer>> letters = new ArrayList<List<Integer>>();
        for (int i = 0; i < strs.length; i++) {
            letters.add(Arrays.asList(getChars(strs[i])));
        }
        
        HashMap<List<Integer>, List<String>> pairs = new HashMap<List<Integer>, List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            if (pairs.containsKey(letters.get(i))) {
                pairs.get(letters.get(i)).add(strs[i]);
            } else {
                ArrayList<String> tempy = new ArrayList<String>();
                tempy.add(strs[i]);
                pairs.put(letters.get(i), tempy);
            }
        }
        
        return (new ArrayList<List<String>>(pairs.values()));
        
    }
    
    private Integer[] getChars(String s) {
        Integer[] chars = new Integer[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        
        return (chars);
    }
}