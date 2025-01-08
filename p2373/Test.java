package p2373;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
         * Output: [[9,9],[8,6]]
         */
        int[][] input = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 },
                { 6, 2, 2, 2 } };
        int[][] expected = { { 9, 9 }, { 8, 6 } };
        System.out.println(Arrays.deepEquals(s.largestLocal(input), expected));

        /*
         * Input: grid =
         * [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
         * Output: [[2,2,2],[2,2,2],[2,2,2]]
         */
        input = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
                { 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
        expected = new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
        System.out.println(Arrays.deepEquals(s.largestLocal(input), expected));
    }
}
