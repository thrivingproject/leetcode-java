package p1108;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        /*
         * Input: address = "1.1.1.1"
         * Output: "1[.]1[.]1[.]1"
         */
        String input = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";
        System.out.println(s.defangIPaddr(input).equals(output));

        /*
         * Input: address = "255.100.50.0"
         * Output: "255[.]100[.]50[.]0"
         */
        input = "255.100.50.0";
        output = "255[.]100[.]50[.]0";
        System.out.println(s.defangIPaddr(input).equals(output));
    }
}
