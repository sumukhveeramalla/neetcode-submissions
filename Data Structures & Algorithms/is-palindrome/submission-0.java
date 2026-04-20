class Solution {
    public boolean isPalindrome(String s) {
        int p = 0, r = s.length() - 1;
        while(p < r ){
            while (p < r && !alphaNum(s.charAt(p))){
                p++;
            }
            while (r > p && !alphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(p)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            p++; 
            r--;
            
        }
        return true;
    }

    public boolean alphaNum(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
