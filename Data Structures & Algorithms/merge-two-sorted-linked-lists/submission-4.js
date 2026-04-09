class Solution {
    /**
     * @param {ListNode} list1
     * @param {ListNode} list2
     * @return {ListNode}
     */
    mergeTwoLists(list1, list2) {
     let head = new ListNode(); 
     let cur = head ; 
    
        while(list1 !==null && list2 !==null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next ;
            }else {
                cur.next = list2 ; 
                list2 = list2.next
            }
            cur = cur.next;

        }
        cur.next = list1 || list2; 
        return head.next; 
    }
}
