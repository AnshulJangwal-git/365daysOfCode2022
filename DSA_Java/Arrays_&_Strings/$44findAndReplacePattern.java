//Leetcode 890 - https://leetcode.com/problems/find-and-replace-pattern/
import java.util.* ;
class $44findAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {    
        List<String> ans = new ArrayList<>() ;
        
        for(String word : words){
            if(isMatch(word, pattern) == true){
                ans.add(word) ;
            }
        }
        
        return ans ;
    }
    
    public boolean isMatch(String word, String pattern){
        if(word.length() != pattern.length()){
            return false ;
        }
        HashMap<Character, Character> map = new HashMap<>() ;
        HashSet<Character> set = new HashSet<>() ;
        
        for(int i = 0; i < word.length(); i++){
            char wch = word.charAt(i) ;
            char pch = pattern.charAt(i) ;
            
            if(map.containsKey(pch)){
                //already mapped..
                if(map.get(pch) != wch){
                    return false ;
                }
                
            }else{
                //not already mapped..
                if(set.contains(wch)){
                    return false ;
                }
                map.put(pch, wch) ;
                set.add(wch) ;
            }
        }
        return true ;
    }
}
