// Leetcode 203 - https://leetcode.com/problems/remove-linked-list-elements/
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
class $35removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head ;
        }
        
        ListNode dH = new ListNode(-1) ;
        ListNode dn = dH ;
        
        ListNode curr = head ;
        while(curr != null){
            if(curr.val == val){
                curr = curr.next ;
                
            }else{
                dn.next = curr ;
                dn = dn.next ;
                curr = curr.next ;
            }
        }
        dn.next = null ;
        return dH.next ;
    }
}