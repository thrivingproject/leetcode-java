package p3110;

class Solution {
    public int scoreOfString(String s) {
        // iterate through the string
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            // get the absolute difference between the two characters
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return sum;
    }
}