class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!visited[row][col] && grid[row][col] == '1'){
                    islands++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{row, col});
                    visited[row][col] = true;
                    while(!q.isEmpty()){
                        int[] curr = q.poll();
                        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
                        for(int[] direction: directions){
                            int newRow = curr[0] + direction[0];
                            int newCol = curr[1] + direction[1];
                            if(isSafe(newRow, newCol, n, m) && !visited[newRow][newCol] && grid[newRow][newCol] == '1'){
                                q.add(new int[] {newRow, newCol});
                                visited[newRow][newCol] = true;
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }

    
    private boolean isSafe(int row, int col, int n, int m){
        if(row >= 0 && row < n && col >= 0 && col < m){
            return true;
        }
        return false;
    }
}
