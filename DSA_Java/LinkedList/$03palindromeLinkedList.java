// Leetcode 234 - https://leetcode.com/problems/palindrome-linked-list/
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
class $03palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head) ;
        ListNode nh = mid.next ;
        
        mid.next = null ;
        ListNode lh = head ;
        ListNode rh = reverseList(nh) ;
        
        while(rh != null){
            if(lh.val != rh.val) return false ;
            
            lh = lh.next ;
            rh = rh.next ;
        }
        return true ;
    }
    
    public ListNode middleNode(ListNode head){
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    
    public ListNode reverseList(ListNode head){
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