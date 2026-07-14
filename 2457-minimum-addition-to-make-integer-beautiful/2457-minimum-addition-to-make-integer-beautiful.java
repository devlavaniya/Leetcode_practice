class Solution {
    private int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public long makeIntegerBeautiful(long n, int target) {
        long original = n;
        long base = 1;

        while (digitSum(n) > target) {
            base *= 10;
            n = ((n / base) + 1) * base;
        }

        return n - original;
    }
}

// class Solution { public int digitsum(long n){ int sum =0; while(n>0){ sum+= (int)n%10; n=n/10; } return sum; } public long makeIntegerBeautiful(long n, int target) { if(digitsum(n)<=target) return 0; long org = n; long base = 10; while(digitsum(n)>target){ n = (n/base + 1) * base; base*=10; } return n-org; } }