package p3289;

import java.util.HashSet;

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
        HashSet<Integer> set = new HashSet<Integer>();
        int index = 0;

        for (int n : nums) {
            if (set.contains(n)) {
                ans[index] = n;
                index++;
                if (index == 2)
                    break;
            }
            set.add(n);
        }

        return ans;
    }
}
