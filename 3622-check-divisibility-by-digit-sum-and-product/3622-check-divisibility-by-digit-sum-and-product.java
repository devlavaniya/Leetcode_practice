class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int num = n;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            prod*=rem;
            num/=10;
        }
        int ans = (sum+prod);
        if(n%ans==0) return true;
        return false;
    }
}