class Solution {
    public int gcd(int a , int b){
       while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int pgcd[] = new int[n];
        int max = nums[0];
        for(int i=0 ; i<n ; i++){
            max = Math.max(max , nums[i]);
            int ans = gcd(nums[i] , max);
            pgcd[i] = ans;
        }
        Arrays.sort(pgcd);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=gcd(pgcd[i] , pgcd[j]);
            i++;
            j--;

        }
        return sum;
    }
}