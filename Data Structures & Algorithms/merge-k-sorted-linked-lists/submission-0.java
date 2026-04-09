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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for(ListNode node: lists){
            if(node == null) continue;
            minHeap.add(node);
        }
        ListNode sorted = new ListNode(-1);
        ListNode temp = sorted;

        while(!minHeap.isEmpty()){
            ListNode minNode = minHeap.poll();
            temp.next = minNode;
            temp = minNode;
            if(minNode.next != null){
                minHeap.add(minNode.next);
            }
        }
        return sorted.next;
    }
}
