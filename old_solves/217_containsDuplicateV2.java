// time complexity: O(nlog(n))
// space complexity: O(1) (sort array in place)


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return (true);
            }
        }
        return (false);
    }
}