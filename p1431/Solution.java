package p1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize the result list
        List<Boolean> ans = new ArrayList<Boolean>();

        // Get max candies
        int max = candies[0];
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }

        // iterate through the array
        for (int numCandies : candies) {
            // add extra candies to each item to see if it's >= greatest
            if (numCandies + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}