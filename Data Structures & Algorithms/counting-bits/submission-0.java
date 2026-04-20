class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        for(int i=0; i< n+1; i++){
            int res = 0;
            int num = i;
            while(num!=0){
                num &= num-1;
                res++;
            }
            count[i] = res;
        }
        return count;
    }
}
