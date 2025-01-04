package p1929;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[2 * numsLength];

        for (int i = 0; i < numsLength; i++) {
            ans[i] = ans[i + numsLength] = nums[i];
        }

        return ans;
    }
}