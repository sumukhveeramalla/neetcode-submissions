class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
            if(set.contains(target-nums[i])){
                result[1] = i;
                result[0] = getIndex(nums,i,target-nums[i]);
            }
            set.add(nums[i]);
        }

        return result;

    }

    private int getIndex(int[] nums,int n, int target){
        for(int i=0; i<n; i++){
            if(target == nums[i]){
                return i;
            }
        }

        return -1;
    }
}
