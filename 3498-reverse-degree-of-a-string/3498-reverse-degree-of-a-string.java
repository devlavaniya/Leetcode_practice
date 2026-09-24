class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum=0;
        for(int i=0 ; i<n ; i++){
            int value = 'a' - s.charAt(i) + 26;
            sum+=value*(i+1);
          
        }
        return sum;
        
    }
}