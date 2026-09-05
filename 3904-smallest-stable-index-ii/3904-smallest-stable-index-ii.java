class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==1 ) return 0;
        int suffix[] = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            suffix[i] = Math.min(nums[i] , suffix[i+1]);

        }
        int prefix[] = new int[n];
        for(int i=0 ; i<n ; i++){
            if(i==0) prefix[i] = nums[i];
            else prefix[i] = Math.max(nums[i] , prefix[i-1]);
            if(prefix[i] - suffix[i] <= k){
                return i;
            }

        }
        return -1;
    }
}