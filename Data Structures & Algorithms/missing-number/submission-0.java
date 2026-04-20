class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n;
        for(int i=0; i<nums.length; i++){
            total ^= i ^ nums[i];
        }
        return total;
    }
}
