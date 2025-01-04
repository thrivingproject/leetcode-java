package p2591;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Input: money = 20, children = 3
        System.out.println(solution.distMoney(20, 3) == 1);

        // Input: money = 16, children = 2
        System.out.println(solution.distMoney(16, 2) == 2);

        // Input: money = 2, children = 2
        System.out.println(solution.distMoney(2, 2) == 0);

        // Input: money = 8, children = 2
        System.out.println(solution.distMoney(8, 2) == 0);

        // Input: money = 9, children = 3
        System.out.println(solution.distMoney(9, 3) == 0);

        // money = 12, children = 3
        System.out.println(solution.distMoney(12, 3) == 1);

        // money = 17, children = 2, expect 1
        System.out.println(solution.distMoney(17, 2) == 1);
    }
}
