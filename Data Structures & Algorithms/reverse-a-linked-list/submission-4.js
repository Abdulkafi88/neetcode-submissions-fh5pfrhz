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
        let cur = head ; 
        let prv = null 
        while(cur){
            let tem = cur.next; 
            cur.next = prv 
            prv = cur ; 
            cur = tem 
        }return prv 
    }
}
