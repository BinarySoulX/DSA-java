class Solution{
    private static boolean isSafe(String board[][],int row,int col,int n){
        //vertically up
        for(int i=row-1;i>=0;--i){
            if(board[i][col].equals("Q")){return false;}
        }
        //diagonally left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;--i,--j){
            if(board[i][j].equals("Q")){return false;}
        }
        //diagonally right up
        for(int i=row-1,j=col+1;i>=0 && j<n;--i,++j){
            if(board[i][j].equals("Q")){return false;}
        }return true;
    }
    private static void possibleSol(int n,int row,String board[][],List<List<String>> result){
        if(row==n){ //base case
          List<String> lt=new ArrayList<>();
          for(int i=0;i<n;++i){
            String rowStr="";
            for(int j=0;j<n;++j){
                rowStr += board[i][j];
            }lt.add(rowStr);
          }result.add(lt);
          return;
        }
        //for column
        for(int j=0;j<n;++j){
            if(isSafe(board,row,j,n)){
                board[row][j]="Q"; //choose
                possibleSol(n,row+1,board,result); //explore
                board[row][j]="."; //backtrack
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> result=new ArrayList<>();
        String board[][] = new String[n][n]; //array needed
        for(int i=0;i<n;++i){Arrays.fill(board[i],".");}
        possibleSol(n,0,board,result);
        return result;
    }
}