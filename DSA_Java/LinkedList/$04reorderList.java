// Leetcode 143 - https://leetcode.com/problems/reorder-list/ (Fold a Linkedlist)
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
class $04reorderList {
    
    public ListNode middle(ListNode head){
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        
        return slow ;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null ;
        ListNode curr = head ;
        
        while(curr != null){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid = middle(head) ;
        ListNode nh = mid.next ;
        
        mid.next = null ;
        ListNode left = head ;
        ListNode right = reverse(nh) ;
        
        while(right != null){
            ListNode leftNext = left.next ;
            ListNode rightNext = right.next ;

            left.next = right ;
            right.next = leftNext ;

            left = leftNext ;
            right = rightNext ;  
        }
    }
}