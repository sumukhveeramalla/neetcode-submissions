class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int l = 0;
        int r = k-1;
        while(r<nums.length){
            minDiff = Math.min(nums[r]-nums[l],minDiff);
            r++;
            l++;
        }
        return minDiff;
    }
}