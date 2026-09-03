class Solution {

    public boolean uniformArray(int[] arr) {

        int minOdd = Integer.MAX_VALUE;

        // smallest odd find karo
        for (int x : arr) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }

        // Agar koi odd hi nahi hai,
        // array already all even hai
        if (minOdd == Integer.MAX_VALUE)
            return true;

        // Har even ko smallest odd se subtract
        for (int x : arr) {

            if (x % 2 == 0) {

                if (x - minOdd < 1)
                    return false;
            }
        }

        return true;
    }
}