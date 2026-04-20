class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //Counting Sort
        int maxNum = 0;
        for(int i=0; i<people.length; i++){
            if(maxNum < people[i]){
                maxNum = people[i];
            }
        }

        int[] count = new int[maxNum+1];
        for(int i=0; i < maxNum; i++){
            count[i] = 0;
        }

        for(int i=0; i<people.length; i++){
            count[people[i]] += 1;
        }

        int idx = 0, i = 1;
        while (idx < people.length){
            while( count[i] == 0 ){
                i++;
            }
            people[idx++] = i;
            count[i]--;
        }
        int res = 0, l = 0, r = people.length - 1;
        while (l <= r){
            int remain = limit - people[r--];
            res++;
            if( l <= r && remain >= people[l]){
                l++;
            }
        }

        return res;

    }
}