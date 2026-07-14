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