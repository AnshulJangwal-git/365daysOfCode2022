// Leetcode 83 - https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
class $21removeDuplicatesFromSortedLinkedlist {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }
        
        ListNode dh = new ListNode(-101) ; // As -100 <= Node.val <= 100
        ListNode dn = dh ;
        ListNode curr = head ;
        
        while(curr != null){
            if(curr.val != dn.val){
                dn.next = curr ;
                curr = curr.next ;
                dn = dn.next ;
                
            }else{
                curr = curr.next ;
            }
        }
        dn.next = null ;
        return dh.next ;
    }
}