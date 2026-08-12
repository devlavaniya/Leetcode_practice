class Solution {
    public int maxProfit(int[] prices) {
        int k = 2;

        Integer[][][] dp = new Integer[prices.length][2][k + 1];

        return solve(prices, 0, 0, dp, k);
    }

    public int solve(int[] nums, int i, int flag,
                     Integer[][][] dp, int k) {

        if (i >= nums.length || k == 0)
            return 0;

        if (dp[i][flag][k] != null)
            return dp[i][flag][k];

        int profit;

        if (flag == 0) {
            profit = Math.max(
                -nums[i] + solve(nums, i + 1, 1, dp, k),
                solve(nums, i + 1, 0, dp, k)
            );
        } else {
            profit = Math.max(
                nums[i] + solve(nums, i + 1, 0, dp, k - 1),
                solve(nums, i + 1, 1, dp, k)
            );
        }

        return dp[i][flag][k] = profit;
    }
}