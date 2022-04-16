// Leetcode 148 - https://leetcode.com/problems/sort-list/
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
class $08mergeSortLinkedList {
    public ListNode middle(ListNode head){
        if(head == null || head.next == null) return head ;
        
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }
        return slow ;
    }
    
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null) return l1 != null ? l1 : l2 ;
        
        ListNode dn = new ListNode(-1) ;
        ListNode dt = dn ;
        
        ListNode c1 = l1 ;
        ListNode c2 = l2 ;
        
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                dt.next = c1 ;
                c1 = c1.next ;
                
            }else{
                dt.next = c2 ;
                c2 = c2.next ;
            }
            dt = dt.next ;
        }
        if(c1 != null) dt.next = c1 ;
        
        if(c2 != null) dt.next = c2 ;
        return dn.next ;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head ;
        
        ListNode mid = middle(head) ;
        ListNode rh = mid.next ;
        mid.next = null ;
        
        ListNode lp = sortList(head) ;
        ListNode rp = sortList(rh) ;
        
        ListNode sortedList = mergeTwoSortedLists(lp, rp) ;
        
        return sortedList ;
        
    }
}