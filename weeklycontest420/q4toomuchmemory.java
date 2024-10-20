class Solution {
    class Node {
        // String dfsStr;
        List<Integer> children;
    }

    public boolean[] findAnswer(int[] parent, String s) {
        Node[] nodes = new Node[parent.length];
        String[] dfsStrings = new String[parent.length];
        for (int i = 0; i < parent.length; i++) {
            Node n = new Node();
            // n.dfsStr = s.substring(i, i + 1);
            n.children = new ArrayList<Integer>();
            nodes[i] = n;
        }
        for (int i = 1; i < parent.length; i++) {
            Node p = nodes[parent[i]];
            p.children.add(i);
        }

        dfs(0, dfsStrings, nodes, s);
        boolean[] result = new boolean[parent.length];
        for (int i = 0; i < parent.length; i++) {
            result[i] = isPalindrome(dfsStrings[i]);
            System.out.println(dfsStrings[i]);
        }

        return result;

    }

    private String dfs(int parent, String[] dfsStrings, Node[] nodes, String s2) {
        if (dfsStrings[parent] != null) {
            return dfsStrings[parent];
        }
        String s = "";
        for (int i : nodes[parent].children) {
            s += dfs(i, dfsStrings, nodes, s2);
        }
        s += s2.charAt(parent);
        dfsStrings[parent] = s;
        return s;
    }

    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}