// Leetcode 1290 - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
class $33convertBinaryToLinkedListInteger {
    public int getDecimalValue(ListNode head) {
        int sum = 0 ;
        
        while(head != null){
            sum = sum * 2 ;
            sum += head.val ;
            head = head.next ;
        }
        return sum ;
    }
}