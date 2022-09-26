// time: O(log(n)) binary search
// space: O(1)


class Solution {
    public int findMin(int[] nums) {
        return (findMin(nums, nums[0], 0, nums.length - 1));
    }
    
    public int findMin(int[] nums, int low, int l, int r) {
        if (l > r) {
            return (nums[0]);
        }
        if (l == r) {
            return (nums[l]);
        }
        int x = (l + r) / 2;
        if (nums[l] > nums[x]) {
            return (Math.min(nums[x], findMin(nums, low, l, x - 1)));
        } 
        if (nums[x] > nums[r]) {
            return (findMin(nums, low, x + 1, r));
        }
        if (nums[l] < low) {
            return (nums[l]);
        }
        return (nums[0]);
    }
}