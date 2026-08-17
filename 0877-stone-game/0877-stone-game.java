class Solution {
    public int solve(int[]piles , int i , int j ,Integer[][] dp  ){
        if (i > j) return 0;
        if (i == j) return piles[i];
        if(dp[i][j] != null) return dp[i][j];
        int takei = piles[i] + Math.min(solve(piles , i+2 , j , dp) , solve(piles , i+1 , j-1 , dp) );
        int takej = piles[j] + Math.min(solve(piles , i+1 , j-1,dp) , solve(piles , i , j-2 , dp) );

        return dp[i][j]= Math.max(takei , takej);
    }
    public boolean stoneGame(int[] piles) {
        int n =piles.length;
        Integer[][] dp = new Integer[n][n];
        int Alicescore = solve(piles , 0,piles.length-1 , dp);
        int sum=0;
        for(int i=0 ; i<piles.length ; i++){
            sum+=piles[i];

        }
        int bobscore = sum - Alicescore;
        return (Alicescore > bobscore);
    }
}