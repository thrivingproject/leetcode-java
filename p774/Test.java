package p774;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: jewels = "aA", stones = "aAAbbbb"
         * Output: 3
         */
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb") == 3);

        /*
         * Input: jewels = "z", stones = "ZZ"
         * Output: 0
         */
        System.out.println(s.numJewelsInStones("z", "ZZ") == 0);
    }
}
