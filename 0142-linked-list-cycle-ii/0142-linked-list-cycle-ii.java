/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private boolean haveCycle(ListNode head){
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;

        while((slow != null) && (fast != null) && (fast.next !=null)){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
       return  false;
    }
    public ListNode detectCycle(ListNode head) {
        if(!haveCycle(head))
            return null;
        
        ListNode slow = head;
        ListNode fast = head;

        while((slow != null) && (fast != null) && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        
           
        }
    
        slow = head;
       
        while(fast!= slow){
            slow = slow.next;
            fast = fast.next;
           

        }

        return slow;
        
    }
}