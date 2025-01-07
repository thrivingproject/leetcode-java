package p1672;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: accounts = [[1,2,3],[3,2,1]]
         * Output: 6
         */
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(s.maximumWealth(accounts) == 6);

        /*
         * Input: accounts = [[1,5],[7,3],[3,5]]
         * Output: 10
         */
        accounts = new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(s.maximumWealth(accounts) == 10);

        /*
         * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
         * Output: 17
         */
        accounts = new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(s.maximumWealth(accounts) == 17);
    }
}
