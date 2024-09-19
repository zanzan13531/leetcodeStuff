// time: O(n)
// space: O(n)


class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return (1);
        }
        int[] vals = new int[n];
        vals[0] = 1;
        vals[1] = 2;
        
        for (int i = 2; i < n; i++) {
            vals[i] = vals[i - 1] + vals[i - 2];
        }
        
        return (vals[n - 1]); //n -1 cause arrays start from 0        
    }
}