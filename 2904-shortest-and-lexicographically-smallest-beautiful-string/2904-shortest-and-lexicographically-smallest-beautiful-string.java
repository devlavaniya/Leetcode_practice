class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int len = 10000;
        String ans = "";
        int left = 0;
        int ones = 0;
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch == '1') ones ++;

            while(ones > k){
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }
            while(left<=i && s.charAt(left)=='0'){
                left++;
            }

         
            if(ones==k){
                String current = s.substring(left , i+1);
                 if (ans.equals("")
                        || current.length() < ans.length()
                        || (current.length() == ans.length()
                        && current.compareTo(ans) < 0)) {

                    ans = current;
                }

            }
        }
        return ans;
    }
}