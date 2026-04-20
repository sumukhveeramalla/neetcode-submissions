class Solution {
    private static final int INF = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        // 1) Push all treasures (0) into queue as BFS sources
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    q.offer(new int[]{r, c});
                }
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        // 2) Multi-source BFS
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;

                // We only relax land cells that are still INF
                if (grid[nr][nc] == INF) {
                    grid[nr][nc] = grid[r][c] + 1;  // distance = parent + 1
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
