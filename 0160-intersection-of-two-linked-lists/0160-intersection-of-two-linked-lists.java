/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int length(ListNode head){
        // ListNode head = h;
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);
        if(lengthA>lengthB)
            return getIntersectionNode(headB,headA);
        
        int extra = lengthB - lengthA;

        while(extra-->0){
            headB = headB.next;
        }

        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            headA= headA.next;
            headB = headB.next;
        }
        return null;
        
    }
}