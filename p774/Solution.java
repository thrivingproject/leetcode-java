package p774;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        // Iterate through each char in jewels
        for (char jewel : jewels.toCharArray()) {
            // If the char is in stones, increment ans
            for (char stone : stones.toCharArray()) {
                if (stone == jewel) {
                    ans++;
                }
            }
        }
        return ans;
    }
}