class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s = new Stack<>();
        int res = 0;

        for(String c : operations){
            if(c.equals("+")){
                int top = s.pop();
                int newtop = s.peek() + top;
                s.push(top);
                s.push(newtop);
                res += newtop;
            }else if(c.equals("D")){
                s.push(2 * s.peek());
                res += s.peek();
            }else if(c.equals("C")){
                res -= s.pop(); 
            }else{
                s.push(Integer.valueOf(c));
                res += s.peek();
            }
        }

        

        return res;
    }
}