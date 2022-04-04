// Leetcode 648 - https://leetcode.com/problems/replace-words/
//Approach1 - Using indexOf() function
// class $04replaceWords {
//     public String replaceWords(List<String> dictionary, String sentence) {
//         String[] arr = sentence.split(" ") ;
//         for(String pre : dictionary){
//             for(int i = 0; i < arr.length; i++){
//                 if(arr[i].indexOf(pre) == 0){
//                     arr[i] = pre ;
//                 }
//             }
//         }
        
//         StringBuilder sb = new StringBuilder() ;
//         for(int i = 0; i < arr.length; i++){
//             sb.append(arr[i]) ;
//             sb.append(" ") ;
//         }
//         sb.deleteCharAt(sb.length() - 1) ;
//         return sb.toString() ;
//     }
// }

// Approach2(Optimised) - Using trie
import java.util.* ;
import java.io.* ;
import java.lang.* ;

class $04replaceWords {
    class Node{
        Node[] childs = new Node[26] ;
        String str ;
    }
    public void insert(Node root, String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(root.childs[ch - 'a'] == null){
                root.childs[ch - 'a'] = new Node() ;
            }
            root = root.childs[ch - 'a'] ;
            if(root.str != null) return ;
        }
        root.str = s ;
    }
    
    public String searchPrefix(Node root, String s){
        StringBuilder pre = new StringBuilder() ;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(root.childs[ch - 'a'] == null){
                return null ;
            }
            
            root = root.childs[ch - 'a'] ;
            if(root.str != null){
                return root.str ;
            }
        }
        return null ;
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        Node root = new Node() ;
        for(String s : dictionary){
            insert(root, s) ;
        }
        StringBuilder ans = new StringBuilder() ;
        StringTokenizer st = new StringTokenizer(sentence) ;
        
        while(st.hasMoreTokens()){
            String word = st.nextToken() ;
            String prefix = searchPrefix(root, word) ;
            if(prefix != null){
                ans.append(prefix) ;
                
            }else{
                ans.append(word) ;
            }
            ans.append(" ") ;
        }
        ans.deleteCharAt(ans.length() - 1) ;
        return ans.toString() ;
    }
}