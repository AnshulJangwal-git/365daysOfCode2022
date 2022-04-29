// Leetcode 1721 - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
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
class $32swappingNodesInLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null){
            return head ;
        }
        
        int n = length(head) ;
        int swappedIdx = n - k + 1 ;
        
        ListNode curr = head ;
        ListNode swappedNode = head ;
        for(int i = 1; i < k; i ++){
            curr = curr.next ;
        }
        
        for(int i = 1; i < swappedIdx; i++){
            swappedNode = swappedNode.next ;
        }
        int temp = curr.val ;
        curr.val = swappedNode.val ;
        swappedNode.val = temp ;
        return head ;
    }
    public int length(ListNode head){
        int len = 0 ;
        ListNode curr = head ;
        while(curr != null){
            curr = curr.next ;
            len += 1 ;
        }
        return len ;
    }
}