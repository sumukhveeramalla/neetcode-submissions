class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];

        int[] outputArray = new int[nums.length];

        Arrays.fill(prefixArray,1);
        Arrays.fill(suffixArray,1);

        int product = 1;
        for (int i=0; i<nums.length; i++){
            prefixArray[i] = product;
            product *= nums[i];
        }

        product = 1;
        for(int j=nums.length-1; j>=0; j--){
            suffixArray[j] = product;
            product *= nums[j];
        }

        for(int k=0; k<nums.length; k++){
            outputArray[k] = prefixArray[k] * suffixArray[k];
        }

        return outputArray;
        
    }
}  
