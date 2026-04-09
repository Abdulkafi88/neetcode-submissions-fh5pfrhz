class Solution {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == word.charAt(0) && dfs(board, row, col, 0, word)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int row, int col, int count, String word){
        if(count == word.length()){
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[row].length
            || board[row][col] != word.charAt(count)){
                return false;
            }
       
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean found = false;
        for(int[] dir: directions){
             char temp = board[row][col];
             board[row][col] = ' ';
            found = dfs(board, row + dir[0], col + dir[1], count+1, word);
            if(found){
                return found;
            }
            board[row][col] = temp;
        }
        

        return found;
    }
}
