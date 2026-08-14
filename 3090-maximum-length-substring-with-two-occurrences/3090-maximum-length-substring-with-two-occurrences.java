class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int i=0 ; i<n ; i++){

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > 2){
                char leftchar = s.charAt(left);
                map.put(leftchar , map.getOrDefault(leftchar , 0)-1);
                left++;
            }
            ans = Math.max(ans , i-left+1);
        }
        return ans;
    }
}