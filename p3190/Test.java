package p3190;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: nums = [1,2,3,4]
         * Output: 3
         */
        int[] nums = {1, 2, 3, 4};
        System.out.println(s.minimumOperations(nums) == 3);

        /*
         * Input: nums = [3,6,9]
         * Output: 0
         */
        nums = new int[]{3, 6, 9};
        System.out.println(s.minimumOperations(nums) == 0);
    }
}
