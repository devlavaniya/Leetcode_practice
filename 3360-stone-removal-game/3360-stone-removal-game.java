class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int x = 10;
        int c=0;
        while(n>0 && n>=x){
            if(n>=x){
                n-=x;
                x--;
                c++;
            }
        }        
        if(c%2==0) return false;
        return true;
        
    }
}