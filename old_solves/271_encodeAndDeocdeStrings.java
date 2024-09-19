// time: O(n)
// space: O(n)


public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String join = Character.toString((char) (257));
        String end = "";
        for (int i = 0; i < strs.size(); i++) {
            end += join + strs.get(i) + join;
        }
        return (end);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<String>();
        int i = 0;
        while (i < s.length()) {
            int a = s.indexOf(257, i);
            if (a != -1) {
                int b = s.indexOf(257, a + 1);
                if (a + 1 == b) {
                    result.add("");
                } else {
                    result.add(s.substring(a + 1, b));
                }
                i = b + 1;
            }
        }
        return (result);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));