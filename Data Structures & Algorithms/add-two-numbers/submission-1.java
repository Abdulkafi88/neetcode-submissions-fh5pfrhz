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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Test
        if(l1.val == 0 && l2.val == 0){
            return l1;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode curr = l1;

        int sum1 = 0;
        int sum2 = 0;
        while(curr != null){
            sum1 = sum1 * 10 + curr.val;
            curr = curr.next;
        }
        curr = l2;
         while(curr != null){
            sum2 = sum2 * 10 + curr.val;
            curr = curr.next;
        }

        int totalSum = sum1 + sum2;

        ListNode l3 = new ListNode(-1);
        curr = l3;

        while(totalSum != 0){
            int digit = totalSum % 10;
            ListNode node = new ListNode(digit);
            curr.next = node;
            curr = node;
            totalSum /= 10;
        }

        System.out.println(sum2);

        return l3.next;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
