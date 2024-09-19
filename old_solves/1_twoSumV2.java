// time complexity: O(n)
// space complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mappy = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (mappy.containsKey(target - nums[i])) {
                return new int[] {i, mappy.get(target - nums[i])};
            } else {
                mappy.put(nums[i], i);
            }
        }
        return null;
    }
}