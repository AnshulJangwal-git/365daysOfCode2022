// Leetcode 25 - https://leetcode.com/problems/reverse-nodes-in-k-group/
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
class $12reverseNodesInKgroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head ;
        
        ListNode oh = null ;
        ListNode ot = null ;
        
        int len = lengthOfList(head) ;
        ListNode curr = head ;
        
        while(len >= k){
            int tempk = k ;
            while(tempk --> 0){
                ListNode forw = curr.next ;
                curr.next = null ;
                addFirst(curr) ;
                curr = forw ;
            }
            if(oh == null){
                oh = th ;
                ot = tt ;
                
            }else{
                ot.next = th ;
                ot = tt ;
            }
            th = tt = null ;
            len = len - k ;
        }
        ot.next = curr ;
        return oh ;
    }
    
    public int lengthOfList(ListNode head){
        if(head == null) return 0 ;
        int count = 0 ;
        
        ListNode curr = head ;
        while(curr != null){
            curr = curr.next ;
            count += 1 ;    
        }
        return count ;
    }
    
    ListNode th = null ;
    ListNode tt = null ;
    
    public void addFirst(ListNode node){
        if(th == null){
            th = tt = node ;
            
        }else{
            node.next = th ;
            th = node ;
        }
    }
}