class Solution { //Pattern: Recursion+Backtracking
    private static boolean dfs(int row,int col,int idx,char[][] board,String word){

        if(idx==word.length()){ //base case 
            return true;
        }
        // Invalid cell
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            board[row][col] != word.charAt(idx)) {

            return false;
        }
        char temp = board[row][col];    //choose
        board[row][col]='#'; //mark visited######################
        //explore
        boolean found = dfs(row - 1, col, idx + 1, board, word) || // Up
                        dfs(row + 1, col, idx + 1, board, word) || // Down
                        dfs(row, col - 1, idx + 1, board, word) || // Left
                        dfs(row, col + 1, idx + 1, board, word);   // Right
        board[row][col] = temp; // Backtrack
        return found;

    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(dfs(i,j,0,board,word)){
                    return true;
                }
            }
        }return false;
    }
}