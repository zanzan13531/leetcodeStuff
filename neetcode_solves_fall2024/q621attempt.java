class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskCount[tasks[i] - 'A']++;
        }
        System.out.println(Arrays.toString(taskCount));

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(26, (i1, i2) -> {
            // int weighted_cd1 = i1[2] +
            if (i1[2] == i2[2]) { // if the cooldown is the same
                return i2[1] - i1[1]; // want the larger one
            }
            return i1[2] - i2[2]; // want the lower cooldown one

        });
        for (int i = 0; i < 26; i++) {
            if (taskCount[i] != 0) {
                pq.add(new int[] { i, taskCount[i], -n });
            }
        }
        int t = 0;
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            System.out.println(Arrays.toString(top));
            t++;
            if (t - top[2] - n > 0) {
                top[2] = t;
                top[1]--;
            } else {
                t = top[2] + n + 1;
                top[2] = t;
                top[1]--;
            }
            if (top[1] != 0) {
                pq.add(top);
            }
            System.out.println(t);
        }
        return t;

    }
}