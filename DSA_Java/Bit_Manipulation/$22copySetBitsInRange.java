//Link - https://nados.io/question/copy-set-bits-in-a-range
import java.io.*;
import java.util.*;

public class $22copySetBitsInRange {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int left = scn.nextInt();
    int right = scn.nextInt();

   //write your code here
   int mask = (1 << (right - left + 1)) ;
   mask -= 1 ;
   
   mask = (mask << (left - 1)) ;
   mask = (mask & a) ;
   
   b = (b | mask) ;
   System.out.println(b) ;
    
  }

}
