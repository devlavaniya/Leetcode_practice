class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        int i = 0;
        int j = 0;

        int[] min = new int[n];
        Arrays.fill(min, Integer.MAX_VALUE);

        int bestmin = Integer.MAX_VALUE;
        int cursum = 0;
        int res = Integer.MAX_VALUE;

        while (i < n) {

            cursum += arr[i];

            while (cursum > target && j <= i) {
                cursum -= arr[j];
                j++;
            }

            if (cursum == target) {

                int len = i - j + 1;

                if (j > 0 && min[j - 1] != Integer.MAX_VALUE) {
                    res = Math.min(res, len + min[j - 1]);
                }

                bestmin = Math.min(bestmin, len);
            }

            min[i] = bestmin;

            i++;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}