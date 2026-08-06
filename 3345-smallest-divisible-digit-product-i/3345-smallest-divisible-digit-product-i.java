class Solution {
    public int smallestNumber(int n, int t) {
        if(n==1 & t==1) return 1;
        for(int i=n ; i<=n+t ; i++){
            int prod = 1;
            int num = i;
            while(num>0){
                int rem = num%10;
                prod = prod * rem;
                num=num/10;

            }
            if(prod%t ==0){
                return i;
            }

        }
        return 0;
    }
}