class Solution {
    public int chori(int[] nums, int i, int[] dp) {
        if(i >= nums.length) return 0;

        if(dp[i] != -1) return dp[i];

        int take = nums[i] + chori(nums, i + 2, dp);
        int skip = chori(nums, i + 1, dp);

        return dp[i] = Math.max(take, skip);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return chori(nums, 0, dp);
    }
}