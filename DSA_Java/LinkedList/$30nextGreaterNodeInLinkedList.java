// Leetcode 1019 - https://leetcode.com/problems/next-greater-node-in-linked-list/

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
class $30nextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>() ;
        int n = length(head) ;
        int[] nge = new int[n] ;
        int arr[] = new int[n] ;
        int idx = 0 ;
        
        ListNode curr = head ;
        while(curr != null){
            arr[idx] = curr.val ;
            idx ++ ;
            curr = curr.next ;
        }
        st.push(arr[n - 1]) ;
        nge[n - 1] = 0 ;
        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop() ;
            }
            if(st.size() == 0){
                nge[i] = 0 ;
                
            }else{
                nge[i] = st.peek() ;
            }
            st.push(arr[i]) ;
        }
        return nge ;
    }
    public int length(ListNode head){
        ListNode curr = head ;
        int len = 0 ;
        while(curr != null){
            curr = curr.next ;
            len += 1 ;
        }
        return len ;
    }
}