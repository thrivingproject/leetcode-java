package p1470;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: nums = [2,5,1,3,4,7], n = 3
         * Output: [2,3,5,4,1,7]
         */
        System.out.println(Arrays
                .equals(s.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3),
                        new int[] { 2, 3, 5, 4, 1, 7 }));

        /*
         * Input: nums = [1,2,3,4,4,3,2,1], n = 4
         * Output: [1,4,2,3,3,2,4,1]
         */
        System.out.println(Arrays
                .equals(s.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4),
                        new int[] { 1, 4, 2, 3, 3, 2, 4, 1 }));

        /*
         * Input: nums = [1,1,2,2], n = 2
         * Output: [1,2,1,2]
         */
        System.out.println(Arrays.equals(s.shuffle(new int[] { 1, 1, 2, 2 }, 2),
                new int[] { 1, 2, 1, 2 }));
    }
}
