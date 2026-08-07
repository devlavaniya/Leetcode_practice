class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] ans = new String[numRows];
        for(int i=0 ; i<numRows ; i++){
            ans[i] = "";
        }
        int n = numRows;
        int j = 0;

        while (j < s.length()) {
            for (int i = 0; i < n && j < s.length(); i++) {
                ans[i] += s.charAt(j);
                j++;
            }

            
            for (int i = n - 2; i > 0 && j < s.length(); i--) {
               ans[i]+=s.charAt(j);
               j++;
            }
        }

        String res="";
        for(String str : ans){
            res+=str;
        }
        return res;
    }
}