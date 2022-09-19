// time complexity: O(n)
// space complexity: O(n)


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacky = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (isOpener(c)) {
                stacky.push(c);
                
            } else {
                if (stacky.empty()) {
                    return (false);
                }
                char p = stacky.pop();
                if (checkCompatability(p, c) == false) {
                    return (false);
                }
                
            }
        }
        
        return (stacky.empty());
    }
    
    private boolean isOpener(char c) {
        return ((c == '(') || (c == '[') || (c =='{'));
        
    }
    
    private boolean checkCompatability(char c, char p) {
        return ((c == '(') && (p == ')') || (c == '[') && (p == ']') || (c == '{') && (p == '}'));
        
    }
}