// time: O(n)
// space: O(1) (not counting space of output array)

class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        if (n == 0) {
            return (bits);
        }
        bits[1] = 1;
        for (int i = 2; i <= n; i++) {
            int l = (int) (Math.log(i) / Math.log(2));
            if (i % Math.pow(2, l) == 0) {
                bits[i] = 1;
            } else {
                bits[i] = bits[(int) (i % Math.pow(2, l))] + 1;
            }
        }
        return (bits);
    }
}