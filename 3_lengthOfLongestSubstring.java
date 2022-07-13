class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxNumRepeats = 0;
        ArrayList<Character> stringy = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            int charIndex = stringy.indexOf(s.charAt(i));
            if (charIndex == -1) {
                stringy.add(s.charAt(i));
                if (stringy.size() > maxNumRepeats) {
                    maxNumRepeats = stringy.size();
                }
            } else {
                for (int j = 0; j <= charIndex; j++) {
                    stringy.remove(0);
                }
                stringy.add(s.charAt(i));
            }
        }
        return (maxNumRepeats);
    }
}