class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        
        for(int i=0 ; i<n ; i++){
            int ans= 0;
            int j=i;
            int flips=k;
            while(j<n){
                if(nums[j] == 1){
                    ans++;
                }
                else if(nums[j] ==0 && flips>0){
                    ans++;
                    flips--;
                }
                else{
                    break;
                }
                j++;   
            }
            if(ans>max){
                max=ans;
            }
            }
            return max;

    }
}