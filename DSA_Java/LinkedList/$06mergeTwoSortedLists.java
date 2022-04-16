// Leetcode 21 - https://leetcode.com/problems/merge-two-sorted-lists/
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
class $06mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dn = new ListNode(-1) ;
        ListNode dt = dn ;
        
        ListNode c1 = list1 ;
        ListNode c2 = list2 ;
        
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
        if(c1 != null){
            dt.next = c1 ;
        }
        if(c2 != null){
            dt.next = c2 ;
        }
        return dn.next ;
    }
}