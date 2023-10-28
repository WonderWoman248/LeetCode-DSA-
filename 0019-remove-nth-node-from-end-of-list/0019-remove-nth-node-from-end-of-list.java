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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        int llSize = 0;
        ListNode current = head;
        while(current != null){
            llSize++;
            current = current.next;
        }
        current = head;
        int targetNode = llSize - n +1;
        if(targetNode == 1){
            return current.next;
        }
        

        ListNode prev = new ListNode();
        ListNode nextN = new ListNode();
        llSize = 0;
        while(current!= null){
             llSize++;
            if(llSize == targetNode-1){
                prev = current;
            }
            if(llSize == targetNode){
                prev.next = current.next;
                current.next = null;
            }
           
            current = current.next;
        }

        return head;
    }
}