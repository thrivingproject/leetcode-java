package p3264;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
         * Output: [8,4,6,5,6]
         */
        int[] input = { 2, 1, 3, 5, 6 };
        int[] expected = { 8, 4, 6, 5, 6 };
        System.out
                .println(Arrays.equals(s.getFinalState(input, 5, 2), expected));

        /*
         * Input: nums = [1,2], k = 3, multiplier = 4
         * Output: [16,8]
         */
        input = new int[] { 1, 2 };
        expected = new int[] { 16, 8 };
        System.out
                .println(Arrays.equals(s.getFinalState(input, 3, 4), expected));
    }
}
