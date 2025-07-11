/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if(!head) return head;
    
    let previousNode = head;

    while(previousNode.next !== null) {
        let listIterator = previousNode.next;
        
        if(listIterator.val === previousNode.val) {
            previousNode.next = listIterator.next;
        } else {
            previousNode = listIterator;
        }
    }
    
    return head;
};

// Solved