package p1431;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: candies = [2,3,5,1,3], extraCandies = 3
         * Output: [true,true,true,false,true]
         */
        int[] candies = { 2, 3, 5, 1, 3 };
        List<Boolean> result = s.kidsWithCandies(candies, 3);
        List<Boolean> expected = new ArrayList<>(
                Arrays.asList(true, true, true, false, true));
        System.out.println(result.equals(expected));

        /*
         * Input: candies = [4,2,1,1,2], extraCandies = 1
         * Output: [true,false,false,false,false]
         */
        candies = new int[] { 4, 2, 1, 1, 2 };
        result = s.kidsWithCandies(candies, 1);
        expected = new ArrayList<>(
                Arrays.asList(true, false, false, false, false));
        System.out.println(result.equals(expected));
    }
}
