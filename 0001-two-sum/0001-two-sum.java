class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqnum = target - nums[i];
            if (mp.containsKey(reqnum)) {
                int[] arr = { mp.get(reqnum), i };
                return arr;
            } else {
                mp.put(nums[i], i);
            }
        }
        return null;

        // for(int i=0 ; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }

        //     }

        // }
        //  return new int[]{};

    }
}