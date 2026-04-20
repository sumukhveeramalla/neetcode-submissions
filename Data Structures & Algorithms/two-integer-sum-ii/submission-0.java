class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // exactly one valid solution.
        int lPtr = 0, rPtr = numbers.length-1, currentSum = 0;
        while (lPtr < rPtr){
            currentSum = numbers[lPtr] + numbers[rPtr];
            if(currentSum > target){
                rPtr--;
            }else if(currentSum < target){
                lPtr++;
            }else{
                //1-indexed array
                return new int[]{lPtr+1, rPtr+1};
            }
        }
        return new int[0];
    }
}
