package p3280;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: date = "2080-02-29"
         * Output: "100000100000-10-11101"
         */
        System.out.println(s.convertDateToBinary("2080-02-29")
                .equals("100000100000-10-11101"));

        /*
         * Input: date = "1900-01-01"
         * Output: "11101101100-1-1"
         */
        System.out.println(s.convertDateToBinary("1900-01-01")
                .equals("11101101100-1-1"));
    }
}
