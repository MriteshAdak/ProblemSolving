import java.util.HashSet;

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
        HashSet<ListNode> uniqueNodes = new HashSet<>();
        ListNode pointer = head;
        
        while(pointer != null) {
            if(uniqueNodes.contains(pointer)) return true;
            uniqueNodes.add(pointer);
            pointer = pointer.next;
        }

        return false;
    }
}