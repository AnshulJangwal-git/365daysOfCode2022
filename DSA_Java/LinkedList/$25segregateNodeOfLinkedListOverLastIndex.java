import java.util.*;

class $25segregateNodeOfLinkedListOverLastIndex {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode getTail(ListNode head){
        if(head == null || head.next == null){
            return head ;
        }
        
        ListNode tail = head ;
        while(tail.next != null){
            tail = tail.next ;
        }
        return tail ;
    }
    
    public static ListNode segregateOnLastIndex(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }
        
        ListNode smaller = new ListNode(-1) ;
        ListNode ps = smaller ;
        
        ListNode larger = new ListNode(-1) ;
        ListNode pl = larger ;
        
        ListNode tail = getTail(head) ;
        
        ListNode curr = head ;
        
        while(curr != null){
            if(curr.val <= tail.val){
                ps.next = curr ;
                ps = ps.next ;
                
            }else{
                pl.next = curr ;
                pl = pl.next ;
                
            }
            curr = curr.next ;
        }
        ps.next = larger.next ;
        pl.next = null ;
        
        return ps ;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        h1 = segregateOnLastIndex(h1);
        printList(h1);
    }
}