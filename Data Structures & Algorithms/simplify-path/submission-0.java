class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("/+");
        Stack<String> stack = new Stack<>();
        for(String d : dir){
            if(d.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(d.equals(".") || d.isEmpty()){
                continue;
            }else{
                stack.push(d);
            }
        }
        StringBuilder result = new StringBuilder("");
        if(stack.isEmpty()){
            return "/";
        }
        for(String s: stack){
            result.append("/");
            result.append(s);
        }
        return result.toString();
    }
}