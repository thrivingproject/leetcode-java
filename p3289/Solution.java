package p3289;

import java.util.HashMap;
import java.util.Map;

/*
    
    In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
    
    As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

 * Constraints:
 *      2 <= n <= 100
 *      nums.length == n + 2
 *      0 <= nums[i] < n
 */
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];

        // Create a hashmap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Iterate through hashmap and find keys with value 2
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                // Add those keys to answer array
                ans[index++] = entry.getKey();
                if (index == 2)
                    break; // Exit early once we have two keys
            }
        }

        return ans;
    }
}
