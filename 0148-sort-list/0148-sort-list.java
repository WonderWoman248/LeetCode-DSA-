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
    public ListNode sortList(ListNode head) {
        if(head == null)
            return head;
        PriorityQueue<ListNode>pq = new PriorityQueue<>(new comp());
    
        while(head != null){
            pq.add(head);
            head = head.next;
        }
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        while(!pq.isEmpty()){
            ans.next = pq.peek();
            pq.poll();
            ans = ans.next;
        }
        ans.next = null;
        return ansHead.next;
        
    }
}
class comp implements Comparator<ListNode>{
    public int compare(ListNode a, ListNode b){
        return a.val - b.val;
    }
}