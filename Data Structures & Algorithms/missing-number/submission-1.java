class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = nums.length;
        int actualSum = 0;
        for(int i=0; i<n; i++){
            totalSum += i;
            actualSum += nums[i];
        }
        return (totalSum - actualSum);
    }
}
