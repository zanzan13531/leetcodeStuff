class Solution {

    public static class Node {
        boolean suspicious;
        int index;
        private List<Integer> parents;
        private List<Integer> invokes;
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> methods = new ArrayList<Integer>();
        ArrayList<Node> nodes = new ArrayList<Node>();
        for (int i = 0; i < n; i++) {
            Node temp = new Node();
            temp.suspicious = false;
            temp.index = i;
            temp.parents = new ArrayList<Integer>();
            temp.invokes = new ArrayList<Integer>();
            nodes.add(temp);
            methods.add(i);
        }
        for (int i = 0; i < invocations.length; i++) {
            int source = invocations[i][0];
            int dest = invocations[i][1];
            nodes.get(source).invokes.add(dest);
            nodes.get(dest).parents.add(source);
        }
        HashSet<Integer> suspiciouss = new HashSet<Integer>();
        HashSet<Integer> parents = new HashSet<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(k);
        nodes.get(k).suspicious = true;
        suspiciouss.add(k);

        while (!q.isEmpty()) {
            int a = q.remove();
            // System.out.println("a" + a);
            for (int node : nodes.get(a).parents) {
                // System.out.println("p" + node.index);
                parents.add(node);
            }
            for (int node : nodes.get(a).invokes) {
                // System.out.println("i" + node.index);
                if (suspiciouss.contains(node)) {
                    continue;
                }
                Node ntemp = nodes.get(node);
                ntemp.suspicious = true;
                suspiciouss.add(node);
                q.add(node);
            }
        }

        // for (int i : parents) {
        // System.out.println(i);
        // }
        // for (int i : suspiciouss) {
        // System.out.println(i);
        // }

        for (int i : parents) {
            if (!nodes.get(i).suspicious) {
                return methods;
            }
        }

        methods = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!suspiciouss.contains(i)) {
                methods.add(i);
            }
        }
        return methods;

    }
}