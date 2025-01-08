package p2807;

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;

        // Create new ListNode
        int gcd = findGCD(head.val, head.next.val);
        ListNode newNextListNode = new ListNode(gcd, head.next);

        // Update `next` for current node
        head.next = newNextListNode;

        // Insert new node for next adjacent pair
        insertGreatestCommonDivisors(newNextListNode.next);

        return head;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}