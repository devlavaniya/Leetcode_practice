class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> l = new ArrayList<>();
        int maxLength = 0;
        int start = 0;
        int end =0;
        while(end<s.length()){
            char ch = s.charAt(end);
            if(!l.contains(ch)){
                l.add(ch);
                end++;
                maxLength=Math.max( maxLength , l.size());
            }
            else{
                l.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        
        return maxLength;
    }
}