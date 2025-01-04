package p2469;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: celsius = 36.50
         * Output: [309.65000,97.70000]
         */
        System.out.println(
                "Test 1: " + Arrays.equals(s.convertTemperature(36.50),
                        new double[] {
                                309.65000, 97.70000 }));

        /*
         * Input: celsius = 122.11
         * Output: [395.26000,251.79800]
         */
        System.out.println(
                "Test 2: " + Arrays.equals(s.convertTemperature(122.11),
                        new double[] {
                                395.26000, 251.79800 }));
    }
}
