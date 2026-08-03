class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            int num = nums[i];

            String s = String.valueOf(num);

            for (int j = 0; j < s.length(); j++) {
              ans.add(s.charAt(j) - '0');
            }
        }
        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
        
    }
}