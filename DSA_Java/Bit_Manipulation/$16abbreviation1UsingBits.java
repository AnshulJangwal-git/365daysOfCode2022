//Link - https://nados.io/question/abbreviation-1-using-bits
import java.io.*;
import java.util.*;

public class $16abbreviation1UsingBits {

    public static void solve(String str){
        // write your code here
        for(int i = 0; i < (1 << str.length()); i++){
            StringBuilder sb = new StringBuilder() ;
            int count = 0 ;
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j) ;
                int bit = str.length() - 1 - j ;
                if((i & (1 << bit)) == 0){
                    if(count == 0){
                        sb.append(ch) ;

                    }else{
                        sb.append(count) ;
                        sb.append(ch) ;
                        count = 0 ;
                    }
                }else{
                    count ++ ;
                }
            }
            if(count != 0){
                sb.append(count) ;
            }
            System.out.println(sb.toString()) ;
        }
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}