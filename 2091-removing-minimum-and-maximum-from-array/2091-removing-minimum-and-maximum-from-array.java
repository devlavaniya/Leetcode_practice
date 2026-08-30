class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mini=0;
        int maxi=0;
        for(int i=0 ; i<n ; i++){
           if(nums[i]>max){
                maxi=i;
                max=nums[i];
            }
            if(nums[i]<min){
                mini=i;
                min=nums[i];
            }
        
        }
        int minii = Math.min(mini+1 , n-mini);
        int maxii = Math.min(maxi+1 , n-maxi);
        int front = Math.max(mini+1 , maxi+1);
        int back  = Math.max(n-maxi , n-mini);
        return Math.min((minii + maxii) , Math.min(front , back));
    }
}