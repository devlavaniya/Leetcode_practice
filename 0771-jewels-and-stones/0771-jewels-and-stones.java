class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0 ;i<n ; i++){
            char c = stones.charAt(i);
            mp.put(c  , mp.getOrDefault(c , 0) +1);
        }
        int ans = 0;
        for(int i=0 ; i<jewels.length() ; i++){ 
            char c = jewels.charAt(i);
            if(mp.containsKey(c)){
                ans+=mp.get(c);
            }
            
        }
        return ans;
    }
}