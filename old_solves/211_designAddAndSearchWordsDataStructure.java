// addWord - time: O(m), space: O(m)        m = length of word
// search - time: O(n * 26^m), space: O(m)  n is the number of nodes

// if there's a lot of '.'s allowing for any character, the runtime is attrocious


class WordDictionary {
    
    private class Node {
        Node[] nexts;
        char val;
        boolean end;
        private Node() {
            nexts = new Node[26];
            end = false;
        }
        private Node(char v) {
            nexts = new Node[26];
            val = v;
            end = false;
        }
    }
    
    Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        addWord(word, root);
    }
    
    private void addWord(String word, Node r) {
        if (word.length() == 0) {
            r.end = true;
            return;
        }
        char c = word.charAt(0);
        if (r.nexts[c - 'a'] == null) {
            r.nexts[c - 'a'] = new Node(c);
        }
        
        addWord(word.substring(1), r.nexts[c - 'a']);
    } 
    
    public boolean search(String word) {
        return (search(word, root));
    }
    
    private boolean search(String word, Node r) {
        if (word.length() == 0) {
            return (r.end);
        }
        char c = word.charAt(0);
        if (c == '.') {
            return (searchAll(word, r));
        }
        if (r.nexts[c - 'a'] == null) {
            return (false);
        }
        
        return (search(word.substring(1), r.nexts[c - 'a']));
    }
    
    private boolean searchAll(String word, Node r) {
        for (int i = 0; i < 26; i++) {
            if (r.nexts[i] != null && search(word.substring(1), r.nexts[i])) {
                return (true);
            }
        }
        return (false);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */