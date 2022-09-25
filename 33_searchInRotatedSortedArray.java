// time: O(log(n)) cause binary search
// space: O(1) 


class Solution {
    public int search(int[] nums, int target) {
        return (modifiedBinSearch(nums, target, 0, nums.length - 1));
    }
    
    public int modifiedBinSearch(int[] nums, int target, int l, int r) {
        if (l > r) {
            return (-1);
        }
        int x = (l + r) / 2; // gets middle index
        if (nums[x] == target) {
            return (x);
        }
        if (nums[l] > nums[r]) { // if part of the array is looped
            return (Math.max(modifiedBinSearch(nums, target, l, x - 1), modifiedBinSearch(nums, target, x + 1, r)));
        } else {
            if (nums[x] > target) {
                return (modifiedBinSearch(nums, target, l, x - 1));
            } else {
                return (modifiedBinSearch(nums, target, x + 1, r));
            }
        }
    }
}