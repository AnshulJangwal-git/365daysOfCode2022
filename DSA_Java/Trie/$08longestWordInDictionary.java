// Leetcode 720 - https://leetcode.com/problems/longest-word-in-dictionary/
class $08longestWordInDictionary {
    class Node{
        Node[] childs = new Node[26] ;
        String str ;
    }
    
    public void insert(Node curr, String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(curr.childs[ch - 'a'] == null){
                curr.childs[ch - 'a'] = new Node() ;
            }
            curr = curr.childs[ch - 'a'] ;
        }
        curr.str = s ;
    }    
    
    
    String ans = "" ;
    public String longestWord(String[] words) {
        Node root = new Node() ;
        for(String s : words){
            insert(root, s) ;
        }
        
        dfs(root) ;
        return ans ;
    }
    public void dfs(Node root){
        for(Node child : root.childs){
            if(child != null && child.str != null){
                if(child.str.length() > ans.length()) ans = child.str ;
                dfs(child) ;
            }
        }
    }
    
}