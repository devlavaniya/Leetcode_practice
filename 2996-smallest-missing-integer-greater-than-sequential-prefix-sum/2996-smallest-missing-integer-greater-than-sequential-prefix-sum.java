class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j=1;
        int ans=nums[0];
        for(int i=0 ; i<nums.length-1 ; i++){

            if(nums[j] == nums[i]+1 && j-i==1){
                ans+=nums[j];
                j++;
            }      
            set.add(nums[i]);

        }
        set.add(nums[nums.length-1]);
        for(int i=ans ; i<= ans+50 ; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}