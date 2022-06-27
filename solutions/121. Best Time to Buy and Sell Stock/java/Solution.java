class Solution {
    
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int maxRight = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > maxRight)
                maxRight = prices[i];
            else {
                int diff = maxRight - prices[i];
                if (diff > maxDiff)
                    maxDiff = diff;
            }
        }
        return maxDiff;
    }
    
}
