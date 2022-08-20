class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(s.split("")));
        ArrayList<String> t1 = new ArrayList<String>(Arrays.asList(t.split("")));
        Collections.sort(s1);
        Collections.sort(t1);
        return (s1.equals(t1));
    }
}