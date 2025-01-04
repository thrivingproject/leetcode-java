package p1920;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        // Input: nums = [0,2,1,5,3,4] Output: [0,1,2,4,5,3]
        System.out.println(
                "Test 1: " + Arrays.equals(
                        s.buildArray(new int[] { 0, 2, 1, 5, 3, 4 }),
                        new int[] { 0, 1, 2, 4, 5, 3 }));

        // Input: nums = [5,0,1,2,3,4] Output: [4,5,0,1,2,3]
        System.out.println(
                "Test 2: " + Arrays.equals(
                        s.buildArray(new int[] { 5, 0, 1, 2, 3, 4 }),
                        new int[] { 4, 5, 0, 1, 2, 3 }));
    }
}
