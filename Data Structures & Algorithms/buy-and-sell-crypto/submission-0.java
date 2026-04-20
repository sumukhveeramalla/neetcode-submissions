class Solution {
    public int maxProfit(int[] prices) {
        int lPtr = 0, rPtr = 1, maxP = 0;
        while(rPtr < prices.length){
            if(prices[lPtr] < prices[rPtr]){
                int profit = prices[rPtr] - prices[lPtr];
                maxP = Math.max(maxP,profit);
            }else{
                lPtr = rPtr;
            }
            rPtr++;
        }
        return maxP;
    }
}
