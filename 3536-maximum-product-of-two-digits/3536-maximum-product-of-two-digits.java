class Solution {
    public int maxProduct(int n) {
        int size = String.valueOf(n).length();
        int arr[] = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        return arr[size-1] * arr[size-2];
    }
}