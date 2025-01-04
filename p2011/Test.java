package p2011;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        /**
         * Input: operations = ["--X","X++","X++"]
         * Output: 1
         */
        String[] operations = {"--X","X++","X++"};
        System.out.println(s.finalValueAfterOperations(operations) == 1);

        /**
         * Input: operations = ["++X","++X","X++"]
         * Output: 3
         */
        operations = new String[]{"++X","++X","X++"};
        System.out.println(s.finalValueAfterOperations(operations) == 3);

        /**
         * Input: operations = ["X++","++X","--X","X--"]
         * Output: 0
         */
        operations = new String[]{"X++","++X","--X","X--"};
        System.out.println(s.finalValueAfterOperations(operations) == 0);
    }
}
