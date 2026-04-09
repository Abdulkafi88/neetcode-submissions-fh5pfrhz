class Solution {
    int islands = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!visited[row][col] && grid[row][col] == 1){
                    dfs(grid, visited, row, col, n, m, new int[] {1});
                }
            }
        }
        return islands;
    }
    private void dfs(int[][] grid, boolean[][] visited, int row, int col, int n, int m, int[] counter){
        islands = Math.max(counter[0], islands);
        visited[row][col] = true;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int[] direction: directions){
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if(isSafe(newRow, newCol, n, m) && !visited[newRow][newCol] && grid[newRow][newCol] == 1){
                counter[0]++;
                dfs(grid, visited, newRow, newCol, n, m, counter);
            }
        }
    }
    private boolean isSafe(int row, int col, int n, int m){
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
