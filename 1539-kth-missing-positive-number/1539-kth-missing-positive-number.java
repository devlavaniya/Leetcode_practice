class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            hs.add(arr[i]);        

        }
        int i=1;
        while(k>0){
            if(!hs.contains(i)) k--;

            i++;
        }
        
       return i-1;
    }
}