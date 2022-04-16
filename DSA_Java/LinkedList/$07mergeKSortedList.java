// Leetcode 23 - https://leetcode.com/problems/merge-k-sorted-lists/
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
class $07mergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null ;
        
        return mergeKListsHelper(lists, 0, lists.length - 1) ;
    }
    
    public ListNode mergeKListsHelper(ListNode[] lists, int si, int ei) {
        if(si > ei) return null ;
        
        if(si == ei) return lists[si] ;
        
        int mid = (si + ei) / 2 ;
        ListNode lp = mergeKListsHelper(lists, si, mid) ;
        ListNode rp = mergeKListsHelper(lists, mid + 1, ei) ;
        
        return mergeTwoLists(lp, rp) ;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
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
    
}