class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){ 
        int j=n-1;
        while(nums[i]>=nums[j]){
            j--;
        }
        swap(nums , i,j);
        }
        reverse(nums , i+1 , n-1);        
    }
    public void swap(int[] nums , int a , int b){
       int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int[] nums , int a , int b){
        while(a<=b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        
    }
}