// Link - https://nados.io/question/count-set-bits-in-first-n-natural-numbers
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    //write your code here
    if(n == 0) return 0 ;

    int x = largestPowerTillN(n) ;
    int bitsUpto2x = x * (1 << (x - 1)) ;
    int bits2xToN = n - (1 << x) + 1 ;
    int rest = n - (1 << x) ;

    int ans = bitsUpto2x + bits2xToN + solution(rest) ;
    return ans ;
  }

  static int largestPowerTillN(int n){
    int x = 0 ;

    while((1 << x) <= n){
      x ++ ;
    }
    return x - 1 ;
  }

}