
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
public class $17IntersectionOfLinkedListUsingDifferenceMethod {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA ;
        ListNode t2 = headB ;
        
        int lenA = length(headA) ;
        int lenB = length(headB) ;
        
        int gap = Math.abs(lenA - lenB) ;
        if(lenA > lenB){
            for(int i = 0; i < gap; i++){
                t1 = t1.next ;
            }
        }else{
            for(int i = 0; i < gap; i++){
                t2 = t2.next ;
            }
        }
        
        while(t1 != t2){
            t1 = t1.next ;
            t2 = t2.next ;
        }
        return t1 ;
    }
    
    public int length(ListNode head){
        if(head == null) return 0 ;
        if(head.next == null) return 1 ;
        int len = 0 ;
        
        ListNode curr = head ;
        while(curr != null){
            curr = curr.next ;
            len ++ ;
        }
        return len ;
    }
}