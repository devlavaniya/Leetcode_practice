class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[i].length ; j++){
                mp.put(nums[i][j] , mp.getOrDefault(nums[i][j] , 0 )+1);
            }
        }
        for (Integer key : mp.keySet()) {
            if(mp.get(key)==n){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}