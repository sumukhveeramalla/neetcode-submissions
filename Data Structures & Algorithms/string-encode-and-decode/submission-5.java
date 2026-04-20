class Solution {

    public String encode(List<String> strs) {
        StringBuilder msg = new StringBuilder("");
        int count = 0;
        for(String str : strs){
            msg.append(str.length()).append('#').append(str);
        }
        return msg.toString();
    }

    public List<String> decode(String str) {

        List<String> msg = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));

            i = j+1;
            j = i + length;
            msg.add(str.substring(i,j));
            i = j;
        }
        return msg;
    }
}
