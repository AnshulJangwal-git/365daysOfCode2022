// Leetcode 472 - https://leetcode.com/problems/concatenated-words/
class $07concatenatedWords {
    private static Node root;
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if (words == null || words.length == 0)
            return new ArrayList<>();
        
        root = new Node();
        buildTrie(words);
        
        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (isConcatenated(word, 0, 0))
                result.add(word);
        }
        return result;
    }
    
    // Return true if word starting from index is concatenated
    boolean isConcatenated(String word, int index, int countConcatenatedWords) {
        if (index == word.length())
            return countConcatenatedWords >= 2;
        
        Node ptr = root;
        for (int i = index; i < word.length(); i++) {
            if (ptr.children[word.charAt(i) - 'a'] == null) 
                return false;
            ptr = ptr.children[word.charAt(i) - 'a'];
            
            if (ptr.isWordEnd)
                if (isConcatenated(word, i + 1, countConcatenatedWords + 1))
                    return true;
        }
        
        return false;
    }
    
    private void buildTrie(String[] words) {
        Node ptr;
        for (String word : words) {
            ptr = root;
            for (char ch : word.toCharArray()) {
                int order = ch - 'a';
                if (ptr.children[order] == null) {
                    ptr.children[order] = new Node();
                } 
                ptr = ptr.children[order];
            }
            ptr.isWordEnd = true;
        }
    }
    
    class Node {
        Node[] children;
        boolean isWordEnd;
        
        public Node() {
            children = new Node[26];
            isWordEnd = false;
        }
    }
}









class Solution {
    public class Node{
        Node[] childs = new Node[26] ;
        String str ;
        // boolean added ;
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
    
    public void search1(Node curr){
        if(curr.str != null){
            search(curr, root) ;
        }
        
        for(Node child : curr.childs){
            if(child != null){
                search1(child) ;
            }
        }
    }
    
    public void search(Node curr, Node nword){
        if(curr.str != null && nword.str != null){
            ans.add(curr.str) ;
            // curr.added = true ;
            curr.str = null ;
        }
        
        if(nword.str != null){
            search(curr, root) ;
        }
        
        for(int i = 0; i < 26; i++){
            if(curr.childs[i] != null && nword.childs[i] != null){
                search(curr.childs[i], nword.childs[i]) ;
            }
        }
    }
    
    
    static Node root ;
    List<String> ans = new ArrayList<>() ;
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if(words.length == 1 && words[0].equals("") == true){
            return ans ;
        }
        root = new Node() ;
        for(String s : words){
            insert(root, s) ;
        }
        
        search1(root) ;
        return ans ;
    }
}