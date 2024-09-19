// time: O(n^2)
// space: O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> solutions = new HashSet<List<Integer>>();
        twoSum(solutions, nums, 0);
        for (int i = 1; i < nums.length && nums[i] <= 0; i++) {
            if (nums[i] != nums[i-1]) {
                twoSum(solutions, nums, i);
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (List<Integer> l : solutions) {
            result.add(l);
        }
        return (result);
    }
    
    private void twoSum(Set<List<Integer>> sols, int[] nums, int start) {
        HashSet<Integer> visited = new HashSet<Integer>();
        
        for (int i = start + 1; i < nums.length; i++) {
            int num = -1 * nums[start] - nums[i];
            if (visited.contains(num)) {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[start]);
                temp.add(nums[i]);
                temp.add(num);
                Collections.sort(temp);
                sols.add(temp);
            } else {
                visited.add(nums[i]);
            }
            
        }
    } 
}