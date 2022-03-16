
// Link - https://nados.io/question/check-divisibility-by-3
import java.io.*;
import java.util.*;

public class $28checkDivisibiltyBy3 {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    //write your code here
    int odd = 0 ;
    int even = 0 ;

    for(int i = 0; i < str.length(); i++){
      int val = str.charAt(i) - '0' ;

      if(i % 2 == 0){
        even += val ;

      }else{
        odd += val ;
      }
    }
    int delta = (int)Math.abs(even - odd) ;
    if(delta % 11 == 0){
      System.out.println(true) ;

    }else{
      System.out.println(false) ;
      
    }
  }

}
