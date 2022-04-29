// Leetcode 2181 - https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
class $27mergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        if(head == null){
            return head ;
        }
        
        int sum = 0 ;
        
        ListNode dummy = new ListNode(-1) ;
        ListNode dn = dummy ;
        ListNode curr = head.next ;
        
        while(curr != null){
            while(curr.val != 0){
                sum += curr.val ;
                curr = curr.next ;
            }
            dn.next = new ListNode(sum) ;
            dn = dn.next ;
            curr = curr.next ;
            sum = 0 ;
        }
        return dummy.next ;
    }
}