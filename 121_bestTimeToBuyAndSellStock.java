// time: O(n)
// space: O(1)


class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProf = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxProf) {
                maxProf = prices[i] - min;
            }
        }
        return (maxProf);
        
    }
}