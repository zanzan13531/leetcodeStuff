// time complexity: O(n)
// space complexity: O(n)

// looks cleaner but is slower and takes up more space cause of the hashmap


class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put('[',']');
        pairs.put('(',')');
        pairs.put('{','}');
        Stack<Character> stacky = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (pairs.containsKey(s.charAt(i))) {
                stacky.push(s.charAt(i));
            } else {
                if (stacky.isEmpty() || pairs.get(stacky.pop()) != s.charAt(i)) {
                    return (false);
                }
            }
        }
        return (stacky.isEmpty());
    }
}