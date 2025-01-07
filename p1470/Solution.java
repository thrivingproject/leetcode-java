package p1470;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        for (int i = 0; i <= 2 * n - 1; i += 2) {
            ans[i] = nums[index];
            ans[i + 1] = nums[index + n];
            index++;
        }
        return ans;
    }
}