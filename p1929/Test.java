package p1929;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Input: nums = [1,2,1] Output: [1,2,1,1,2,1]
        System.out.println("Test 1: "
                + Arrays.equals(solution.getConcatenation(new int[] { 1, 2, 1 }), new int[]{ 1, 2, 1, 1, 2, 1 }));
    }
}
