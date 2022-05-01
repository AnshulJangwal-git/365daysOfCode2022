// Leetcode 817 - https://leetcode.com/problems/linked-list-components/
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
class $38LinkedListConnectedComponents {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]) ;
        }
        int ans = 0 ;
        ListNode curr = head ;
        
        while(curr != null){
            if(set.contains(curr.val)){
                while(curr.next != null && set.contains(curr.next.val)){
                    curr = curr.next ;
                }
                ans += 1 ;
            }
            curr = curr.next ;
        }
        return ans ;
    }
}