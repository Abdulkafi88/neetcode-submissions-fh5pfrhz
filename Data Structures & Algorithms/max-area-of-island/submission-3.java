class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length; 
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!visited[row][col] && grid[row][col] == 1){
                    int islands = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[] {row, col});
                    visited[row][col] = true;
                    while(!q.isEmpty()){
                        islands++;
                        int[] currDirection = q.poll();
                        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                        for(int[] direction: directions){
                            int newRow = currDirection[0] + direction[0];
                            int newCol = currDirection[1] + direction[1];
                            if(isSafe(newRow, newCol, n, m) && !visited[newRow][newCol] && grid[newRow][newCol] == 1){
                                q.add(new int[] {newRow, newCol});
                                visited[newRow][newCol] = true;
                            }
                        }
                    }
                    max = Math.max(max, islands);
                }
            }
        }
        return max;
    }
    private boolean isSafe(int row, int col, int n, int m){
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
