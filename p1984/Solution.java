package p1984;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        // Make a boolean array of allowed characters
        boolean[] allowedChars = new boolean[26];
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }

        // Check if each word is consistent
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                ans++;
            }
        }
        return ans;
    }
}