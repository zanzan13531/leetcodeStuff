// time complexity: O(n)
// space complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> existing = new HashSet<Integer>();
        for (int i : nums) {
            if (existing.contains(i)) {
                return (true);
            }
            existing.add(i);
        }
        return (false);
    }
}