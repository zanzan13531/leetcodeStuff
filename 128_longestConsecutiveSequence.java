// time: O(n)
// space: O(n)


class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int longConseq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                int above = 1;
                int below = 1;
                while (set.contains(nums[i] + above)) {
                    set.remove(nums[i] + above);
                    above++;
                }
                set.add(nums[i]);
                while (set.contains(nums[i] - below)) {
                    set.remove(nums[i] - below);
                    below++;
                }
                if (1 + above + below - 2 > longConseq) {
                    longConseq = 1 + above + below - 2;
                }
            }
        }
        return (longConseq);
    }
}