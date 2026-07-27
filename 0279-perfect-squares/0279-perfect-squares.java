class Solution {
    public int sq(int n , int[] dp){
        int a = (int) Math.sqrt(n);
        if(a*a == n) return 1;
        if(dp[n]!=-1) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int i=1 ; i*i<=n ; i++){
            int c = sq(i*i , dp) +  sq(n-i*i , dp);
            min = Math.min(min ,c);
        }
        return dp[n] = min;
    }
    public int numSquares(int n) {
        int []dp = new int [n+1];
        Arrays.fill(dp , -1);
        return sq(n , dp);
        
    }
}