package p2807;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    /**
     * Constructor for ListNode
     * 
     * @param val  Value of the node
     * @param next Next ListNode
     */
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
