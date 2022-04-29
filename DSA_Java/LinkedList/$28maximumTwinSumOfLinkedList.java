// Leetcode 2130 - https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
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
class $28maximumTwinSumOfLinkedList {
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head ;
        }
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
    
    public int pairSum(ListNode head) {
        if(head == null){
            return 0 ;
        }
        if(head.next == null){
            return head.val ;
        }
        
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }
        slow = reverse(slow) ;
        fast = head ;
        int sum = 0 ;
        
        while(slow != null){
            sum = Math.max(sum, slow.val + fast.val) ;
            slow = slow.next ;
            fast = fast.next ;
        }
        return sum ;
    }
}