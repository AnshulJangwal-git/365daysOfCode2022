// Leetcode 445 - https://leetcode.com/problems/add-two-numbers-ii/
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
class $18additionOfTwoLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return l1 != null ? l1 : l2 ;
        
        ListNode c1 = reverse(l1) ;
        ListNode c2 = reverse(l2) ;
        
        int carry = 0 ;
        ListNode dh = new ListNode(-1) ;
        ListNode dn = dh ;
        
        while(c1 != null || c2 != null || carry != 0){
            int sum = carry + (c1 != null ? c1.val : 0) + (c2 != null ? c2.val : 0) ;
            int ld = sum % 10 ;
            carry = sum / 10 ;
            dn.next = new ListNode(ld) ;
            dn = dn.next ;
            
           if(c1 != null) c1 = c1.next ;
           if(c2 != null) c2 = c2.next ;
        }
        return reverse(dh.next) ;
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
}