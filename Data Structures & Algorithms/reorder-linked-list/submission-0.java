/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        // find middle node 
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        System.out.println(s.val);

        // reverse the linkedList
        ListNode c = s;
        ListNode p = null;
        ListNode n = s.next;

        //ListNode second = new ListNode(0);

        while(c != null){
            c.next = p;
            p = c;
            c = n;
            if(n != null){
                n = n.next;
            }
           
        }

        System.out.println(p.val);
        
            
        ListNode first = head;
        head = new ListNode(-1);
         ListNode temp = head;
        while(first != s){
            temp.next = first;
            first = first.next;
            temp = temp.next;
            temp.next = p;
            p = p.next;
            temp = temp.next;
        }
            
        head = head.next;
    }
}
