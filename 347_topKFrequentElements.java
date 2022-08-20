class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<int[]> freq = new ArrayList<int[]>();
        for (int i : nums) {
            int j = num.indexOf(i);
            if (j != -1) {
                int[] temp = freq.get(j);
                temp[0]++;
            } else {
                num.add(i);
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = i;
                freq.add(temp);
            }
        }
        
        int[][] temp = new int[freq.size()][];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = freq.get(i);
        }
        
        Arrays.sort(temp, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i] = temp[temp.length - 1 - i][1];
        }
        
        return (results);
    }
}