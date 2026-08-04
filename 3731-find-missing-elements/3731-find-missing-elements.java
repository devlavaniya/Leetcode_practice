class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int min = 879;
        int max = -547;
        for(int i=0 ; i<n ; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
            hm.add(nums[i]);

        }
        for(int i=min ; i<=max ; i++ ){
            if(!hm.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}