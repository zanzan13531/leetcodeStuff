class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] results = new int[queries.length];
        // ArrayList<Integer> dists = new ArrayList<Integer>();
        PriorityQueue<Integer> dists = new PriorityQueue<Integer>(Collections.reverseOrder());
        // dists.add(0);

        // int dtemp = Math.abs(queries[0][0]) + Math.abs(queries[0][1]);
        // dists.add(dtemp);
        // if (k == 1) {
        // results[0] = dtemp;
        // } else {
        // results[0] = -1;
        // }
        if (k == 1) {
            int min = 2000000001;
            for (int i = 0; i < queries.length; i++) {
                int d = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);
                if (d < min) {
                    min = d;
                }
                results[i] = min;
            }
        } else {
            for (int i = 0; i < queries.length; i++) {
                int d = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);
                // boolean skip = false;
                if (dists.size() < k - 1) {
                    dists.add(d);
                    results[i] = -1;
                } else if (dists.size() < k) {
                    dists.add(d);
                    results[i] = dists.peek();
                } else {
                    int top = dists.poll();
                    if (d < top) {
                        dists.add(d);
                        results[i] = dists.peek();
                    } else {
                        results[i] = top;
                        dists.add(top);
                    }
                    // dists.add(d);
                    // results[i] = dists.peek();
                }

                // else if (dists.size() < k) {
                // dists.add(d);
                // results[i] = dists.peek();
                // } else {
                // if (dists.peek() > d) {
                // results[i] = dists.poll();
                // dists.add(d);
                // } else {
                // results[i] = dists.peek();
                // }
                // }

                // if (dists.size() < k || d < dists.get(k - 1)) {
                // if (dists.size() < k) {
                // dists.add(d);
                // if (dists.size() == k) {
                // Collections.sort(dists);
                // }
                // } else { // binary search to look for location
                // int min = 0;
                // int max = k - 1;
                // while (max > min + 1) {
                // int mid = (min + max) / 2;
                // if (d < dists.get(mid)) {
                // max = mid;
                // } else {
                // min = mid;
                // }
                // }
                // if (d < dists.get(min)) {
                // dists.add(min, d);
                // } else if (d < dists.get(max)) {
                // dists.add(max, d);
                // } else {
                // dists.add(max + 1, d);
                // }
                // }
                // }
                // if (dists.size() >= k) {
                // results[i] = dists.get(k - 1);
                // } else {
                // results[i] = -1;
                // }
            }
        }
        return results;
    }
}