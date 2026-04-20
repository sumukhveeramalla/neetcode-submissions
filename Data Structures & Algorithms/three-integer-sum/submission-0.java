class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //Create a list of list to return
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            //If the starting element itself greater than zero in a sorted array that mean we cant find the sum = 0
            if(nums[i] > 0){break;}
            //If the previous element is same as the current one we are just duplicaitng because we already found that distinct triplet possible.
            if(i>0 && nums[i] == nums[i-1]){continue;}
            int l = i+1, r = nums.length-1;
            while(l < r){
                int currentSum = nums[i] + nums[l] + nums[r];
                if(currentSum > 0){
                    r--;
                }else if(currentSum < 0){
                    l++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    //Ignoring the duplicate ones as l and l-1 index elements which are equal gives the same triplets.
                    while (l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
