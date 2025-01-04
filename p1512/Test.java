package p1512;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: nums = [1,2,3,1,1,3]
         * Output: 4
         */
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(s.numIdenticalPairs(nums) == 4);

        /**
         * Input: nums = [1,1,1,1]
         * Output: 6
         */
        nums = new int[] { 1, 1, 1, 1 };
        System.out.println(s.numIdenticalPairs(nums) == 6);

        /**
         * Input: nums = [1,2,3]
         * Output: 0
         */
        nums = new int[] { 1, 2, 3 };
        System.out.println(s.numIdenticalPairs(nums) == 0);
    }
}
