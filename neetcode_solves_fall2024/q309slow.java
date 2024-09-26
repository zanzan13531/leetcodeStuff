class Solution {
    public HashMap<int[], Integer> dp; // {[day, status], maxprofit}

    public int maxProfit(int[] prices) {
        dp = new HashMap<int[], Integer>();
        return maxFromDay(prices, 0, 0, 0);
    }

    // status 0 = not bought
    // status 1 = bought, waiting to sell
    // status 2 = cooldown
    public int maxFromDay(int[] prices, int day, int status, int cost) {
        if (day >= prices.length) {
            return 0;
        }
        if (dp.containsKey(new int[] { day, status, cost })) {
            return dp.get(new int[] { day, status, cost });
        }
        if (status == 0) { // buy or wait
            int maxFuture = Math.max(maxFromDay(prices, day + 1, 0, 0),
                    maxFromDay(prices, day + 1, 1, prices[day]));
            dp.put(new int[] { day, status, cost }, maxFuture);
            return maxFuture;
        } else if (status == 1) { // sell or wait
            int maxFuture = 0;
            if (cost > prices[day]) {
                maxFuture = maxFromDay(prices, day + 1, 1, cost);
            } else {
                maxFuture = Math.max(maxFromDay(prices, day + 1, 1, cost),
                        maxFromDay(prices, day + 1, 2, 0)
                                + prices[day] - cost);
            }
            dp.put(new int[] { day, status, cost }, maxFuture);
            return maxFuture;
        } else { // otherwise increment with cooldown ended
            int maxFuture = maxFromDay(prices, day + 1, 0, 0);
            dp.put(new int[] { day, status, cost }, maxFuture);
            return maxFuture;
        }

    }
}