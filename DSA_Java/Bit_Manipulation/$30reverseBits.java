// Link - https://nados.io/question/print-binary-and-reverse-bits
import java.io.*;
import java.util.*;

public class $30reverseBits {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    boolean flag = false ;
    int rev = 0 ;
    int j = 0 ;
    
    for(int i = 31; i >= 0; i--){
        int mask = (1 << i) ;
        
        if(flag == true){ // set bit high case
            if((n & mask) != 0){ //bit on
                System.out.print(1) ;
                int smask = (1 << j) ;
                rev = rev | smask ;
                j ++ ;
                
            }else{ //bit off
                System.out.print(0) ;
                j ++ ;
            }
        }else{ //set bit is still low
            if((n & mask) != 0){ //bit on
                flag = true ;
                System.out.print(1) ;
                int smask = (1 << j) ;
                rev |= smask ;
                j ++ ;
                
            }else{
                //nothing to do
            }
        }
    }
    System.out.println() ;
    System.out.println(rev) ;
  }

}