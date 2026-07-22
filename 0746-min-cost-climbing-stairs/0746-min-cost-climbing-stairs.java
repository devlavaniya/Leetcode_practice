class Solution {
    public int mincost(int[] arr , int i , int[] dp ){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return  dp[i] = arr[i] + Math.min(mincost(arr, i+1 , dp) , mincost(arr , i+2 , dp));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return Math.min(mincost(cost , 0 , dp) , mincost(cost , 1 , dp));
    }
}