package p3289;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: nums = [0,1,1,0]
         * Output: [0,1]
         */
        int[] input = { 0, 1, 1, 0 };
        int[] output = { 0, 1 };
        System.out.println("Test 1: "
                + Arrays.equals(s.getSneakyNumbers((input)), output));

        /*
         * Input: nums = [0,3,2,1,3,2]
         * Output: [2,3]
         */
        input = new int[] { 0, 3, 2, 1, 3, 2 };
        output = new int[] { 2, 3 };
        System.out.println("Test 2: "
                + Arrays.equals(s.getSneakyNumbers((input)), output));
    }
}
