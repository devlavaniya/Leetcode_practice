class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
      HashMap<Integer,Integer> mp = new HashMap<>();
    for(int i=0 ; i<nums1.length ; i++){
        mp.put(nums1[i] , mp.getOrDefault(nums1[i],0)+1);
    }

    for(int ele : nums2){
        if(mp.containsKey(ele) && mp.get(ele)>0){
            list.add(ele);
            mp.put(ele , 0);
        }
    }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
      
    }
}