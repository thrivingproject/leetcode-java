package p3146;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: s = "abc", t = "bac"
         * Output: 2
         */
        System.out.println(s.findPermutationDifference("abc", "bac") == 2);

        /*
         * Input: s = "abcde", t = "edbac"
         * Output: 12
         */
        System.out.println(s.findPermutationDifference("abcde", "edbac") == 12);
    }
}
