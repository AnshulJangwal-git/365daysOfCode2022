// Leetcode 211 - https://leetcode.com/problems/design-add-and-search-words-data-structure/
class WordDictionary {
    
    class Node{
        Node[] childs ;
        boolean isEnd ;
        
        Node(){
            childs = new Node[26] ;
        }
        
        public boolean find(String word, int i){
            if(i == word.length()){
                return isEnd ;
            }
            
            char ch = word.charAt(i) ;
            if(ch == '.'){
                for(Node child : childs){
                    if(child != null && child.find(word, i + 1)){
                        return true ;
                    }
                }
                return false ;
                
            }else{
                if(childs[ch - 'a'] == null)
                    return false ;
                else
                    return childs[ch - 'a'].find(word, i + 1) ;
            }
        }
    }
    
    final private Node root ;
    
    public WordDictionary() {
        root = new Node() ;    
    }
        
    public void addWord(String word) {
        Node curr = root ;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i) ;
            if(curr.childs[ch - 'a'] == null){
                curr.childs[ch - 'a'] = new Node() ;
            }
            curr = curr.childs[ch - 'a'] ;
            
        }
        curr.isEnd = true ;
    }
    
    public boolean search(String word) {
        return root.find(word, 0) ;    
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */