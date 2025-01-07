package p1984;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
         * Output: 2
         */
        System.out.println(s.countConsistentStrings("ab",
                new String[] { "ad", "bd", "aaab", "baa", "badab" }) == 2);

        /*
         * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
         * Output: 7
         */
        System.out.println(s.countConsistentStrings("abc",
                new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" }) == 7);

        /*
         * Input: allowed = "cad", words =
         * ["cc","acd","b","ba","bac","bad","ac","d"]
         * Output: 4
         */
        System.out.println(s.countConsistentStrings("cad",
                new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac",
                        "d" }) == 4);
    }
}
