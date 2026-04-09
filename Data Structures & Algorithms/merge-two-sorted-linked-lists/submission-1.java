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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode list3 = new ListNode(0);
        ListNode temp = list3;

        ListNode i = list1;
        ListNode j = list2;

        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                i = i.next;
            }else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }

        while(i != null){
             temp.next = i;
             temp = temp.next;
             i = i.next;
        }
        while(j != null){
             temp.next = j;
             temp = temp.next;
             j = j.next;
        }

        return list3.next; 

    }
}