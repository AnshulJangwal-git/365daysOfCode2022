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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null ;
        }
        ListNode mid = getMiddleNode(head) ;
        
        ListNode dh = new ListNode(-1) ;
        ListNode dn = dh ;
        
        ListNode curr = head ;
        while(curr != null){
            if(curr != mid){
                dn.next = curr ;
                dn = dn.next ;
                
            }else if(curr == mid){
                dn.next = curr.next ;
                dn = dn.next ;
                mid.next = null ;
            }
            curr = curr.next ;
        }
        return dh.next ;
    }
    public ListNode getMiddleNode(ListNode head){
        if(head == null || head.next == null) return head ;
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
}   