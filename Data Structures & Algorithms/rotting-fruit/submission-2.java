class Solution {
  
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                     q.offer(new int[]{i, j});
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int min = 0;
       
                    while(!q.isEmpty()){
                         boolean isRot = false;
                        int size = q.size();
                        for(int i = 0; i < size; i++){
                            int[] currDir = q.poll();
                            int row = currDir[0];
                            int col = currDir[1];
                            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                            for(int[] direction: directions){
                                int newRow = row + direction[0];
                                int newCol = col + direction[1];
                                if(isSafe(newRow, newCol, n, m) && grid[newRow][newCol] == 1){
                                    isRot = true;
                                    fresh--;
                                    grid[newRow][newCol] = 2;
                                    q.offer(new int[]{newRow, newCol});
                                }
                        }

                        }
                        if(isRot){
                            
                            min++;
                        }
                    }
                    return fresh == 0 ? min : -1;
                }
    
        



    boolean isSafe(int row, int col, int n, int m){
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}

