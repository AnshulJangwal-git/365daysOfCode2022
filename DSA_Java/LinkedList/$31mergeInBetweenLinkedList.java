// Leetcode 1669 - https://leetcode.com/problems/merge-in-between-linked-lists/
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
class $1669mergeInBetweenLinkedList {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currA = list1 ;
        ListNode currB = list1 ;
        int idxA = 0 ;
        int idxB = 0 ;
        
        while(currB != null){
            if(idxB == b){
                break ;
            }
            currB = currB.next ;
            idxB += 1 ;
        }
        
        
        while(currA != null){
            if(idxA == a - 1){
                break ;
            }
            currA = currA.next ;
            idxA ++ ;
        }
        
        currA.next = list2 ;
        ListNode node = list2 ;
        while(node.next != null){
            node = node.next ;
        }
        node.next = currB.next ;
        currB.next = null ;
        return list1 ;
    }
}