class Solution { //Pattern: DP
    int dp[][];
    private int solve(int piles[],int i,int j){
        if(i==j){return piles[i];}
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int leftChoice=piles[i]-solve(piles,i+1,j);
        int rightChoice=piles[j]-solve(piles,i,j-1);
        
        return dp[i][j]=Math.max(leftChoice,rightChoice);
    }
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return solve(piles,0,n-1)>=0;
    }
}
// DP STATE : dp[i][j] which stores the advantage of player1 over player 2 
// considering the subarray from i to j