// Leetcode 86 - https://leetcode.com/problems/partition-list/
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
class $37partitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head ;
        }
        
        ListNode smaller = new ListNode(-1) ;
        ListNode ps = smaller ;
        
        ListNode larger = new ListNode(-1) ;
        ListNode pl = larger ;
        
        ListNode curr = head ;
        while(curr != null){
            if(curr.val < x){
                ps.next = curr ;
                ps = ps.next ;
                
            }else{
                pl.next = curr ;
                pl = pl.next ;
            }
            if(curr != null) curr = curr.next ;
        }
        ps.next = larger.next ;
        pl.next = null ;
        return smaller.next ;
    }
}