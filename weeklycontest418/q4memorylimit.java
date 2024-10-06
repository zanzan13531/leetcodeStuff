class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int n = nums.length;
        ArrayList<Integer> gcds = new ArrayList<Integer>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                gcds.add(gcd(nums[i], nums[j]));
            }
        }
        Collections.sort(gcds);
        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            results[i] = gcds.get((int) (queries[i]));
        }
        return results;
    }

    public static int gcd(int x1, int x2) { // euclid's algorithm
        while (x2 != 0) {
            int temp = x1;
            x1 = x2;
            x2 = temp % x2;
        }
        return x1;
    }
}