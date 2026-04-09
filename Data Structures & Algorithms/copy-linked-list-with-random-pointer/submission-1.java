/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }

        // step 1

        Node curr = head;

        while(curr != null){
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = curr.next.next;
        }

        // Step 2
        curr = head;

        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }else{
                 curr.next.random = null;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node nc = curr.next;

        Node nw = head.next;

        while(curr != null){
            curr.next = curr.next.next;
            curr = curr.next;
            if(nc.next != null){
                  nc.next = nc.next.next;
            }
            nc = nc.next;
        }
    
        return nw;

    }
}
