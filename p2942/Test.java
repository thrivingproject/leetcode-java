package p2942;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: words = ["leet","code"], x = "e"
         * Output: [0,1]
         */
        System.out.println(
                s.findWordsContaining(new String[] { "leet", "code" }, 'e')
                        .equals(Arrays.asList(0, 1)));
    }
}
