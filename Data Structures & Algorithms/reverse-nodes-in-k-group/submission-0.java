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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        if(k <= 1){
            return head;
        }
        ListNode head2 = new ListNode(-1);  
        ListNode c = head;
        ListNode p = head;
        ListNode n = head.next;
        ListNode temp = head2;
        while(n != null){
            int i = 0;
            while(n != null && i < k - 1){
                c = c.next;
                n = n.next;
                i++;
            }
            if(i == k - 1){
                 c.next = null;
                 temp.next = rev(p);
                 for(int j = 0; j < k; j++){
                    temp = temp.next;
                 }
                 p = n;
                 c = n;
                 if(n == null){
                    break;
                 }
                 n = n.next;        
            }else{
                break;
            }
        
        } 
      //  System.out.println(c.val);
        temp.next = p;
      
    

        return head2.next;
    }
    public ListNode rev(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = null;
        ListNode c = head;
        ListNode n = head.next;

        while(c != null){
            c.next = p;
            p = c;
            c = n;
            if(n != null){
                n = n.next;
            }
        }

        return p;
    }
}
