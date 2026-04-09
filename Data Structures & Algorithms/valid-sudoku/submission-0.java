class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        

        for(int row= 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if (board[row][col] == '.') continue;
                if(!seen.add(board[row][col] + " at row " + row) ||
                 !seen.add(board[row][col] + " at col " + col) ||
                 !seen.add(board[row][col] + " at grid " + row/3 + " " + col/3)){
                    return false;
                 }
            }
        }
        return true;
    }
}
