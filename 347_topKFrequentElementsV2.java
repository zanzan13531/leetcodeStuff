// time: O(n)
// space: O(n)


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if (k == nums.length) {
            return (nums);
        }
        
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (counter.containsKey(nums[i])) {
                counter.put(nums[i], counter.get(nums[i]) + 1);
            } else {
                counter.put(nums[i], 1);
            }
        }
        List<Integer>[] buckets = new List[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        
        for (Integer key : counter.keySet()) {
            buckets[counter.get(key) - 1].add(key);
        }
        
        int[] result = new int[k];
        int i = 0;
        int b = nums.length - 1;
                                 
        while (i < k) {
            for (int j = 0; j < buckets[b].size(); j++) {
                result[i] = buckets[b].get(j);
                i++;
            }
            b--;
        }
        return (result);
        
    }
}