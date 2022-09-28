// insert - time: O(m), space O(m)          m = word length
// search - time: O(m), space: O(1)         m = word length
// startsWith - time: O(m), space: O(1)     m = prefix length

// apparently my implementation sucks and is kinda slow


class Trie {
    
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

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        insert(word, root);
    }
    
    private void insert(String word, Node r) {
        if (word.length() == 0) {
            r.end = true;
            return;
        }
        char c = word.charAt(0);
        if (r.nexts[c - 'a'] == null) {
            r.nexts[c - 'a'] = new Node(c);
        }
        
        insert(word.substring(1), r.nexts[c - 'a']);
    } 
    
    public boolean search(String word) {
        return (search(word, root));
    }
    
    private boolean search(String word, Node r) {
        if (word.length() == 0) {
            return (r.end);
        }
        char c = word.charAt(0);
        if (r.nexts[c - 'a'] == null) {
            return (false);
        }
        
        return (search(word.substring(1), r.nexts[c - 'a']));
    }
    
    public boolean startsWith(String prefix) {
        return (startsWith(prefix, root));
    }
    
    private boolean startsWith(String prefix, Node r) {
        if (prefix.length() == 0) {
            return (true);
        }
        char c = prefix.charAt(0);
        if (r.nexts[c - 'a'] == null) {
            return (false);
        }
        
        return (startsWith(prefix.substring(1), r.nexts[c - 'a']));
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */