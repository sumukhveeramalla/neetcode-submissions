class Solution {
    public void reverseString(char[] s) {
        int p = 0, r = s.length - 1;
        char tmp;
        while ( p != r && p < r){
            tmp = s[p];
            s[p] = s[r];
            s[r] = tmp;
            p++;
            r--;
        }
    }
}