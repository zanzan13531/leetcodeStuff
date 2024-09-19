// time: O(n)
// space: O(n)


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if (nums.length == 2) {
            return (new int[] {nums[1], nums[0]});
        }
        
        int[] lr = new int[nums.length];
        int[] rr = new int[nums.length];
        
        lr[0] = 1;
        rr[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            lr[i] = lr[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rr[i] = rr[i + 1] * nums[i + 1];
        }
        
        int[] result = new int[nums.length];
        result[0] = rr[0];
        result[nums.length - 1] = lr[nums.length - 1];
        
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = lr[i] * rr[i];
        }
        
        return (result);
        
    }
}