class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        HashSet<String> visited = new HashSet<String>();
        Queue<String> q = new LinkedList<String>();
        HashMap<String, String> reversePath = new HashMap<String, String>();
        // reversePath: (dest, source)
        q.add(beginWord);
        boolean found = false;
        // visited.add(beginWord);
        while (!q.isEmpty()) {
            String word = q.remove();
            System.out.println(word);

            // if (word == endWord) {
            // found = true;
            // break;
            // }
            visited.add(word);
            for (int i = 0; i < wordList.size(); i++) {
                if (!visited.contains(wordList.get(i)) && isSimilar(word, wordList.get(i))) {
                    reversePath.put(wordList.get(i), word);
                    visited.add(wordList.get(i));
                    q.add(wordList.get(i));
                }
            }

        }
        if (!reversePath.containsKey(endWord)) {
            return 0;
        }
        String w = endWord;
        int path = 1;
        while (w != beginWord) {
            w = reversePath.get(w);
            path++;
        }
        return path;

    }

    public boolean isSimilar(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!(a.charAt(i) == b.charAt(i))) {
                diff++;
            }
        }
        return (diff == 1);
    }
}