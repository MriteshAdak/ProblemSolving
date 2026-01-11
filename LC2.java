public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        enum Carry {
            ZERO(0),
            ONE(1);

            private final int value;
            Carry(int value) {
                this.value = value;
            }

            private int getValue() {
                return value;
            }
        }
        
        ListNode anchor = new ListNode(0);
        ListNode iterator = anchor;
        Carry carryBit = Carry.ZERO;

        while(l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carryBit.getValue();
        
            carryBit = (sum > 9) ? Carry.ONE : Carry.ZERO;
            sum = sum % 10;
        
            iterator.next = new ListNode(sum);
            iterator = iterator.next;
        
            if (l1.next != null) l1 = l1.next;
            if (l2.next != null) l2 = l2.next;
        }

        return anchor.next;
    }
}