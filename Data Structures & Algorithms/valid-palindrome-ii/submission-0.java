class Solution {
    public boolean validPalindrome(String s) {
        // Recursion
        int p = 0, r = s.length()- 1;
        while (p < r){
            if(s.charAt(p) != s.charAt(r)){
                return isPalindrome(s,p+1,r) || isPalindrome(s,p,r-1);
            }
            p++;
            r--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int p, int r){
        while(p < r){
            if(s.charAt(p) != s.charAt(r)){
                return false;
            }
            p++;
            r--;
        }
        return true;
    }
}