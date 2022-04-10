// Leetcode 421 - https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
class $05maximumXORofTwoNumbersInArray {
    public class Trie{
        class Node{
            Node left, right ;
        }
        Node root ;
        
        Trie(){
            root = new Node() ;
        }
        
        
        public void insert(int val){
        int bitIndex = 30 ;
        Node curr = root ;
        
        while(bitIndex >= 0){
            int mask = 1 << bitIndex ;
            int bit = (mask & val) > 0 ? 1 : 0 ;
            if(bit == 0){
                if(curr.left == null){
                    curr.left = new Node() ;
                }
                curr = curr.left ;
            }else{
                if(curr.right == null){
                    curr.right = new Node() ;
                }
                curr = curr.right ;
            }
            bitIndex-- ;
        }
    }
        
        public int query(int find){
        int bitIndex = 30 ;
        Node curr = root ;
        
        int ans = 0 ;
        while(bitIndex >= 0){
            int mask = 1 << bitIndex ;
            int bit = (find & mask) > 0 ? 1 : 0 ;
            if(bit == 0){
                if(curr.left != null){
                    curr = curr.left ;
                    
                }else{
                    curr = curr.right ;
                    ans |= mask ;
                }
            }else{
                if(curr.right != null){
                    curr = curr.right ;
                    ans |= mask ;
                    
                }else{
                    curr = curr.left ;
                }
            }
            bitIndex -- ;
        }
        return ans ;
    }
    }
    
    
    
    
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie() ;
        for(int val : nums){
            trie.insert(val) ;
        }
        
        int max = 0 ;
        for(int val : nums){
            int find = Integer.MAX_VALUE ^ val ;
            int res = trie.query(find) ;
            max = Math.max(max, val ^ res) ;
        }
        return max ;
    }
}