// Leetcode 138 - https://leetcode.com/problems/copy-list-with-random-pointer/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class $13copyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>() ;
        Node curr = head ;
        
        Node nHead = new Node(-1) ;
        Node prev = nHead ;
        
        while(curr != null){
            Node node = new Node(curr.val) ;
            prev.next = node ;
            map.put(curr, node) ;
            
            prev = prev.next ;
            curr = curr.next ;
        }
        nHead = nHead.next ;
        Node c1 = head ;
        Node c2 = nHead ;
        
        while(c1 != null){
            if(c1.random != null) c2.random = map.get(c1.random) ;
            if(c1.random == null) c2.random = null ;
            
            c1 = c1.next ;
            c2 = c2.next ;
        }
        return nHead ;
    }
}

// Without Using extra Space

class Solution {
    public Node copyRandomList(Node head) {
//         Without using extra space
        
        copyList(head) ;
        copyRandomPointers(head) ;
        return extractList(head) ;
    }
    
    public Node extractList(Node head){
        Node dummy = new Node(-1) ;
        Node prev = dummy ;
        Node curr = head ;
        
        while(curr != null){
            prev.next = curr.next ;
            curr.next = curr.next.next ;
            
            prev = prev.next ;
            curr = curr.next ;
        }
        return dummy.next ;
    }
    
    public void copyRandomPointers(Node head){
        Node curr = head ;
        while(curr != null){
            Node random = curr.random ;
            if(random != null){
                curr.next.random = random.next ;
            }
            curr = curr.next.next ;
        }
    }
    
    
    public void copyList(Node head){
        Node curr = head ;
        while(curr != null){
            Node forw = curr.next ;
            
            Node node = new Node(curr.val) ;
            curr.next = node ;
            node.next = forw ;
            
            curr = forw ;
        }
    }
}