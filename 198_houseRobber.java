// time: O(n)
// space: O(n)


import java.math.*;

class Solution {
    
    private int[] robResults;
    
    public int rob(int[] nums) {
        robResults = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            robResults[i] = -1;
        }
        return (rob(nums, 0));
    }
    
    private int rob(int[] nums, int h) {
        if (h >= nums.length) {
            return (0);
        }
        if (robResults[h] != -1) {
            return (robResults[h]);
        }
        
        int maxxy = Math.max(rob(nums, h + 1), rob(nums, h + 2) + nums[h]);
        robResults[h] = maxxy;
        return (maxxy);
    }
}