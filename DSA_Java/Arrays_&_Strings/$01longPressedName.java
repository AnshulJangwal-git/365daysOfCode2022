
import java.util.*;

public class $01longPressedName {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static boolean isPossible(String name, String typed) {
        if(name.length() > typed.length()){
            return false ;
        }
        
        int i = 0 ; 
        int j = 0 ;
        
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i ++ ;
                j ++ ;
                
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                j ++ ;
                
            }else{
                return false ;
                
            }
        }
        
        if(i != name.length()){
            return false ;
        }    
        
        return true ;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}