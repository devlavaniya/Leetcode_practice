class Solution {
    public int chori(int[] nums , int i , int end , int [] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = Math.max(nums[i] + chori(nums , i+2 , end , dp) , chori(nums , i+1 , end , dp));

    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        int case1 = chori(nums , 0 , n-2 , dp1);
        int case2 = chori(nums , 1 , n-1 , dp2);
        return Math.max(case1 , case2);
    }
}