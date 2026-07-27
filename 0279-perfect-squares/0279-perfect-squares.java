class Solution {
    // public int sq(int n , int[] dp){
    //     int a = (int) Math.sqrt(n);
    //     if(a*a == n) return 1;
    //     if(dp[n]!=-1) return dp[n];
    //     int min = Integer.MAX_VALUE;
    //     for(int i=1 ; i*i<=n ; i++){
    //         int c = sq(i*i , dp) +  sq(n-i*i , dp);
    //         min = Math.min(min ,c);
    //     }
    //     return dp[n] = min;
    // }
    public int numSquares(int n) {
        int []dp = new int [n+1];
       for(int i=1 ; i<=n ; i++){
         int a = (int) Math.sqrt(i);
         if(a*a == i) dp[i]= 1;
         else{
            int min = Integer.MAX_VALUE;
            for(int j=1 ; j*j<=i ; j++ ){
                min = Math.min( min , dp[j*j] + dp[i-j*j]);
            }
            dp[i]=min;

         }
       }
        return dp[n];
    }
}