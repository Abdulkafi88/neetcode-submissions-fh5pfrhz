/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {ListNode}
     */
    reverseList(head) {
         if (head === null || head.next === null) return head;  // base case
  
  let newHead = this.reverseList(head.next);  // go to the end
  
  head.next.next = head;  // flip the arrow
  head.next = null;       // remove old arrow
  
  return newHead;
    }
}
