
class LC141 {
    public static void main(String args[]) {
        Solution isCyclic = new Solution();
        // System.out.println(isCyclic.hasCycle());
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        //Suggested by copilot
        ListNode faster = head;
        ListNode slower = head;

        while(faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;

            if(faster == slower) return true;
        }

        return false;
    }
}