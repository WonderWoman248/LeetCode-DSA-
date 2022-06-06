/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int lengthOfList(ListNode *A){
        int len=0;
        
        while(A!=NULL){
            len++;
            A=A->next;
        }
        return len;
    }
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int lenA=lengthOfList(headA);
        int lenB=lengthOfList(headB); 
        
        if(lenA>lenB) return getIntersectionNode(headB,headA);
        int diff=abs(lenA-lenB);
        
        for(int i=0;i<diff;i++){
            headB=headB->next;
        }
       
        
        while(headA!= NULL and headB!= NULL){
            if(headA== headB) return headA;
            headB=headB->next;
            headA=headA->next;
        }
        
        return NULL;
    }
};