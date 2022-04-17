// Leetcode 206 - https://leetcode.com/problems/reverse-linked-list/
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
class $11reverseLinkedListUsingAddFirst {
    ListNode th = null ;
    ListNode tt = null ;
    
    public void addFirst(ListNode node){
        if(th == null){
            th = node ;
            tt = node ;
            
        }else{
            node.next = th ;
            th = node ;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        //Using add First Method
        ListNode curr = head ;
        while(curr != null){
            ListNode forw = curr.next ;
            curr.next = null ;
            addFirst(curr) ;
            curr = forw ;
        }
        return th ;
    }
}