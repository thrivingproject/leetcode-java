package p3264;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = getMinIndex(nums);
            nums[minIndex] *= multiplier;
        }
        return nums;
    }

    static public int getMinIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}