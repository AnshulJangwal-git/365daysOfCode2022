// Leetcode 328 - https://leetcode.com/problems/odd-even-linked-list/
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
class $10oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head ;
        
        ListNode oh = new ListNode(-1) ;
        ListNode ot = oh ;
        
        ListNode eh = new ListNode(-1) ;
        ListNode et = eh ;
        
        ListNode curr = head ;
        while(curr != null){
            ot.next = curr ;
            ot = ot.next ;
            curr = curr.next ;
            
            if(curr != null){
                et.next = curr ;
                et = et.next ;
                curr = curr.next ;  
            }
            
        }
        ot.next = eh.next ;
        et.next = null ;
        return oh.next ;
    }
}