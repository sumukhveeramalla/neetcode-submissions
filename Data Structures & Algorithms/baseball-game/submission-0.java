class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s = new Stack<>();
        int count = 0;

        for(String c : operations){
            if(c.equals("+")){
                int top = s.pop();
                int newtop = s.peek() + top;
                s.push(top);
                s.push(newtop);
            }else if(c.equals("D")){
                s.push(2 * s.peek());
            }else if(c.equals("C")){
                s.pop();  
            }else{
                s.push(Integer.valueOf(c));
            }
        }

        while(!s.isEmpty()){
            int c = Integer.valueOf(s.pop());
            System.out.println(c);
            count += c;
        }

        return count;
    }
}