//Link - https://practice.geeksforgeeks.org/problems/swap-all-odd-and-even-bits-1587115621/1/#
import java.io.*;
import java.util.*;

public class  $26swapAllevenAndOddBits {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    int om = 0x55555555 ;
    int em = 0xAAAAAAAA ;
    
    int odds = (om & n) ;
    int evens = (em & n) ;
    
    // odds = odds << 1 ;
    // evens = evens >> 1 ;
    
    odds <<= 1 ;
    evens >>= 1 ;
    
    n = odds | evens ;
    System.out.println(n) ;
  }

}