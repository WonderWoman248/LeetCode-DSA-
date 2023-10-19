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
        if(lists.length == 0)
            return null;
        PriorityQueue<ListNode>pq = new PriorityQueue<>(new Comp());
       
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        ListNode head = new ListNode();
        ListNode ptrHead = head;
        while(!pq.isEmpty()){
            ListNode curr = pq.peek();
            pq.poll();
            
            if(curr.next != null)
                pq.add(curr.next);
           
            head.next = curr;
            head = head.next;
        }
        

        return ptrHead.next;
    }
}
class Comp implements Comparator<ListNode>{
    public int compare (ListNode a, ListNode b){
        return a.val - b.val;
    }
}