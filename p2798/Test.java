package p2798;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: hours = [0,1,2,3,4], target = 2
         * Output: 3
         */
        int[] hours = { 0, 1, 2, 3, 4 };
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, 2) == 3);

        /*
         * Input: hours = [5,1,4,2,2], target = 6
         * Output: 0
         */
        hours = new int[] { 5, 1, 4, 2, };
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, 6) == 0);
    }
}
