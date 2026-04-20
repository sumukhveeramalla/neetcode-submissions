class Solution {
    public int countComponents(int n, int[][] edges) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<>());
        }

        for (int[] e : edges) {
            // map.putIfAbsent(e[0], new ArrayList<>());
            // map.putIfAbsent(e[1], new ArrayList<>());

            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        for(int i=0; i<n; i++){
            if(explore(map,i,set)){
                count++;
            }
        }
        return count;
    }

    public boolean explore(Map<Integer, List<Integer>> map, int n, Set<Integer> set){

        if(set.contains(n)) return false;

        set.add(n);

        for(int neighbor : map.get(n)){
            explore(map,neighbor,set);
        }

        return true;
    }
}
