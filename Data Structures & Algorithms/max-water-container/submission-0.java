class Solution {
    public int maxArea(int[] heights) {
        // int max = (index2 - index1)*(height1(or) height2) given that height is small
        int max = 0, currentArea = 0,height = 0;
        int lPtr = 0, rPtr = heights.length-1;
        while (lPtr < rPtr){
            if(heights[lPtr] > heights[rPtr]){
                height = heights[rPtr];
            }else{
                height = heights[lPtr];
            }
            currentArea = (rPtr - lPtr)*(height);
            if(max <= currentArea){
                max = currentArea;
            }
            if(heights[lPtr] <= heights[rPtr]){
                lPtr++;
            }else{
                rPtr--;
            }
        }
        return max;
    }
}
