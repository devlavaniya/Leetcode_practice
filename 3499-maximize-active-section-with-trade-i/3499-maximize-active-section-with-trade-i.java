class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
       int ones = 0;
       int prez = Integer.MIN_VALUE;
       int max = 0;
       int i=0;
       while(i<n){
        int j=i;
        while(j<n && s.charAt(i) == s.charAt(j)){
            j++;
        }
        int len = j-i;
        if(s.charAt(i)=='1'){
            ones+=len;
        }
        else{
            max = Math.max(max , prez + len);
            prez=len;
        }
        i=j;
       }
        return ones+max;
    }
}