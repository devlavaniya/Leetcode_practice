class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] ans = new String[(s.length() + k - 1) / k];
        int count=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           sb.append(ch);
            count++;
            if(count==k){
                count=0;
                ans[j++] = sb.toString();
                sb.delete(0, sb.length());

            }
            else if(i==s.length()-1 && count<k){
                while(count<k){
                    sb.append(fill);
                    count++;
                }
                ans[j] = sb.toString();
                
            }
        

        }
        return ans;
    }
}