class Solution {
    public boolean validPartition(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return solve(nums,0, dp);
        
    }
    public boolean solve(int[] nums, int i,Boolean dp[] ){
        if(i>=nums.length) return true;

        boolean flag = false;
        if(dp[i]!=null) return dp[i];

        if(i+1 < nums.length && nums[i] == nums[i+1]){
            flag |= solve(nums,i+2 ,dp);

            if(flag) return true;
        }

        if(i+2 < nums.length && nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
            flag |= solve(nums,i+3,dp);

            if(flag) return true;
        }

        if(i+2 < nums.length && nums[i] + 1  == nums[i+1] && nums[i+1] + 1 == nums[i+2]){
            flag |= solve(nums,i+3,dp);

            if(flag) return true;
        }

        return dp[i]=flag;

    }
}