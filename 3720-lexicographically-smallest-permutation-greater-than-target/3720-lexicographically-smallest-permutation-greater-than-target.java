class Solution {

    public String lexGreaterPermutation(String s, String target) {

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder prefix = new StringBuilder();

        int i = 0;

        // Match target as much as possible
        while (i < target.length()
                && count[target.charAt(i) - 'a'] > 0) {

            char ch = target.charAt(i);

            count[ch - 'a']--;
            prefix.append(ch);

            i++;
        }

        // Case 1: Matching stopped at index i
        if (i < target.length()) {

            for (char ch = (char) (target.charAt(i) + 1);
                 ch <= 'z';
                 ch++) {

                if (count[ch - 'a'] > 0) {

                    StringBuilder ans = new StringBuilder(prefix);

                    ans.append(ch);
                    count[ch - 'a']--;

                    // Add remaining characters in sorted order
                    for (int j = 0; j < 26; j++) {
                        while (count[j]-- > 0) {
                            ans.append((char) ('a' + j));
                        }
                    }

                    return ans.toString();
                }
            }
        }

        // Case 2: Backtrack
        for (int pos = i - 1; pos >= 0; pos--) {

            char removed = prefix.charAt(prefix.length() - 1);

            // Restore removed character
            count[removed - 'a']++;
            prefix.deleteCharAt(prefix.length() - 1);

            // Find smallest character greater than target[pos]
            for (char ch = (char) (target.charAt(pos) + 1);
                 ch <= 'z';
                 ch++) {

                if (count[ch - 'a'] > 0) {

                    StringBuilder ans = new StringBuilder(prefix);

                    ans.append(ch);
                    count[ch - 'a']--;

                    // Add remaining in sorted order
                    for (int j = 0; j < 26; j++) {
                        while (count[j]-- > 0) {
                            ans.append((char) ('a' + j));
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}