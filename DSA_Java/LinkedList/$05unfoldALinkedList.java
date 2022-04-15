// Link - https://nados.io/question/unfold-of-linkedlist
import java.util.*;

class $05unfoldALinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void unfold(ListNode head) {
        if(head == null || head.next == null) return ;
        
        ListNode fh = head ; //first head
        ListNode fp = head ; //first previous
        
        ListNode sh = head.next ;
        ListNode sp = sh ;
        
        while(sp != null && sp.next != null){
            ListNode f = sp.next ; //extra pointer as backup..
            
            fp.next = f ;
            sp.next = f.next ;
            
            fp = fp.next ;
            sp = sp.next ;
        }
        
        fp.next = null ;
        sh = reverse(sh) ; //reverse the list
        fp.next = sh ;
        
    }
    
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head ;
        
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

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}