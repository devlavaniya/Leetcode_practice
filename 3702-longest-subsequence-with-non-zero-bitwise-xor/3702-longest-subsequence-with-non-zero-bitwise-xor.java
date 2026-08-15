class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int c = 0;
        for(int num : nums){
            xor^=num;
            if(xor!=0){
                c=1;
            }

        }
        if(xor!=0){
            return n;
        }
        else if(c==1){
            return n-1;

        }
        return 0;
    }
}