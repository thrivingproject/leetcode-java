package p1984;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        // Loop through each word in the words array
        for (String word : words) {
            boolean consistent = true;
            // Loop through each character in the allowed string
            for (char c : word.toCharArray()) {
                // Check if the character is not in the word
                if (allowed.indexOf(c) == -1) {
                    // Stop checking the word and set consistent to false
                    consistent = false;
                    break;
                }
            }
            if (consistent)
                ans++;
        }
        return ans;
    }
}