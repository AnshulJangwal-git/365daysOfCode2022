// Leetcode 925 - https://leetcode.com/problems/long-pressed-name/
class $01longPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0 ;
        int j = 0 ;
        
        int n = name.length() ;
        int t = typed.length() ;
        
        while(i < n && j < t){
            if(name.charAt(i) == typed.charAt(j)){
                i ++ ;
                j ++ ;
                
            }else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)){
                j ++ ;
                
            }else{
                return false ;
            }
        }
        
        while(j < t){
            if(typed.charAt(j) != name.charAt(i - 1)) return false ;
            j ++ ;
        }
        if(i < n)return false ;
        else return true ;
    }
}