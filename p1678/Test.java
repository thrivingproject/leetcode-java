package p1678;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: command = "G()(al)"
         * Output: "Goal"
         */
        System.out.println(s.interpret("G()(al)").equals("Goal"));

        /**
         * Input: command = "G()()()()(al)"
         * Output: "Gooooal"
         */
        System.out.println(s.interpret("G()()()()(al)").equals("Gooooal"));

        /**
         * Input: command = "(al)G(al)()()G"
         * Output: "alGalooG"
         */
        System.out.println(s.interpret("(al)G(al)()()G").equals("alGalooG"));
    }
}
