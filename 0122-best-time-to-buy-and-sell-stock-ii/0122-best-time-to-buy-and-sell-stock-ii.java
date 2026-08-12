class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length+1][2];
        return solve(prices,0,0,dp);

        // flag = true then we havw to sell
        // flag = false  : then we have to buy 
        
    }

    public int solve(int[] nums, int i, int flag, Integer[][] dp){
        if(i>=nums.length) return 0;
    
        int profit = 0;
        if(dp[i][flag] != null) return dp[i][flag];

        if(flag == 1){
            profit = Math.max(nums[i] + solve(nums,i+1,0, dp) , solve(nums,i+1,1,dp));
            dp[i][flag] = profit;
        }else{
            profit = Math.max(-nums[i] + solve(nums,i+1,1,dp) , solve(nums,i+1,0,dp));
            dp[i][flag] = profit;
        }

        return dp[i][flag] = profit;
    }
}