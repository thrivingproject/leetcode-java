package p2807;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * Input: head = [18,6,10,3]
         * Output: [18,6,6,2,10,1,3]
         */
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);
        ListNode result = s.insertGreatestCommonDivisors(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
