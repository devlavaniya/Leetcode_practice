class Solution {
    public int maxProfit(int k, int[] prices) {
        Integer[][][] dp = new Integer[prices.length+1][2][k+1];
        return solve(prices, 0, 0,k, dp);
        
    }

    public int solve(int[] nums, int i, int flag, int k, Integer[][][] dp){
        if(i>=nums.length || k == 0) return 0;

        if(dp[i][flag][k] != null) return dp[i][flag][k];

        int profit = 0;

        if(flag == 1){
            profit = Math.max(nums[i] + solve(nums,i+1,0,k-1,dp), solve(nums, i+1,1, k, dp));
        }else{
            profit = Math.max(-nums[i] + solve(nums,i+1,1,k,dp), solve(nums, i+1,0, k, dp));
        }
        return dp[i][flag][k] = profit;
    }

    //  public int solve(int[] nums, int i, int flag,
    //                  Integer[][][] dp, int k) {

    //     if (i >= nums.length || k == 0)
    //         return 0;

    //     if (dp[i][flag][k] != null)
    //         return dp[i][flag][k];

    //     int profit;

    //     if (flag == 0) {
    //         profit = Math.max(
    //             -nums[i] + solve(nums, i + 1, 1, dp, k),
    //             solve(nums, i + 1, 0, dp, k)
    //         );
    //     } else {
    //         profit = Math.max(
    //             nums[i] + solve(nums, i + 1, 0, dp, k - 1),
    //             solve(nums, i + 1, 1, dp, k)
    //         );
    //     }

    //     return dp[i][flag][k] = profit;
    // }


}
