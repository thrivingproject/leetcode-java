package p2894;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: n = 10, m = 3
         * Output: 19
         */
        System.out.println(s.differenceOfSums(10, 3) == 19);

        /*
         * Input: n = 5, m = 6
         * Output: 15
         */
        System.out.println(s.differenceOfSums(5, 6) == 15);

        /*
         * Input: n = 5, m = 1
         * Output: -15
         */
        System.out.println(s.differenceOfSums(5, 1) == -15);
    }
}
