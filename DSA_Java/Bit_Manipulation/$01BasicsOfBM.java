//Link - https://nados.io/question/basics-of-bit-manipulation
import java.io.*;
import java.util.*;

public class $01BasicsOfBM {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    int onMask = (1 << i) ;
    int offMask = ~(1 << j) ;
    int tmask = (1 << k) ;
    int cmask = (1 << m) ;
    
    System.out.println(n | onMask) ;
    System.out.println(n & offMask) ;
    System.out.println(n ^ tmask) ;
    System.out.println((n & cmask) == 0 ? false : true) ;
  }

}
