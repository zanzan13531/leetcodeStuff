class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] counts = new int[51];
        if (nums.length < k) {
            for (int i = 0; i < nums.length; i++) {
                counts[nums[i]]++;
            }
            int[] result = new int[1];
            result[0] = calcXSum(count(counts), x);
            return result;
        }
        int[] result = new int[nums.length + 1 - k];
        for (int i = 0; i < k; i++) {
            counts[nums[i]]++;
        }
        result[0] = calcXSum(count(counts), x);
        // System.out.println(0);
        for (int i = 1; i < nums.length + 1 - k; i++) {
            counts[nums[i - 1]]--;
            counts[nums[i + k - 1]]++;
            result[i] = calcXSum(count(counts), x);
            // System.out.println(i);
        }

        return result;
    }

    private ArrayList<int[]> count(int[] freq) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                // System.out.println(i + " " + freq[i]);
                res.add(new int[] { i, freq[i] });
            }
        }
        return res;
    }

    private int calcXSum(ArrayList<int[]> counts, int x) {
        Collections.sort(counts, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0  ] - a[0];
            } else {
                return b[1] - a[1];
            }
        });
        int maxLen = Math.min(x, counts.size());
        int s = 0;
        for (int i = 0; i < maxLen; i++) {
            s += counts.get(i)[0] * counts.get(i)[1];
            // System.out.println(s);
        }
        return s;
    }
}