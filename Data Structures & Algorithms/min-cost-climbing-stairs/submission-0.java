class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int one = cost[n-1];
        int two = 0;
        int temp = 0;
        for(int i=n-2; i>=0; i--){
            temp = one;
            one = Math.min(one+cost[i],two+cost[i]);
            two = temp;
        }

        return Math.min(one,two);
    }
}
