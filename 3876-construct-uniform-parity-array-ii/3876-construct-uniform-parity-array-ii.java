class Solution {

    static boolean yes(int[] arr) {
        int even = 0, odd = 0;

        for (int x : arr) {
            if (x % 2 == 0)
                even++;
            else
                odd++;
        }

        return even == arr.length || odd == arr.length;
    }

    public boolean uniformArray(int[] arr) {

        int n = arr.length;

        if (yes(arr))
            return true;

        int j = -1;

        // smallest odd element ka index
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                if (j == -1 || arr[i] < arr[j]) {
                    j = i;
                }
            }
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                nums[i] = arr[i];
            } 
            else {

            
                if (i == j || arr[i] - arr[j] < 1) {
                    return false;
                }

                nums[i] = arr[i] - arr[j];
            }
        }

        return yes(nums);
    }
}