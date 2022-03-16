// Link - https://nados.io/question/sum-of-bit-differences-of-all-pairs
import java.io.*;
import java.util.*;

public class $27sumOfBitDifferences {

  public static long solution(int[] arr){
    //write your code here
    long ans = 0 ;

    for(int i = 0; i < 32; i++){
      long countOn = 0 ;
      for(int val : arr){
        if((val & (1 << i)) != 0){
          countOn ++ ;

        }
      }
    long countOff = arr.length - countOn ;
    long diff = countOn * countOff * 2 ;
    ans += diff ;
    }

    return ans ;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}