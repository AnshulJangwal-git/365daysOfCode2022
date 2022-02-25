//Link - https://practice.geeksforgeeks.org/problems/counts-zeros-xor-pairs0349/1
import java.util.*;
// import java.io.*;

public class $28countZeroesXORPairs {
  public static int countPairs(int[]arr) {
    //write your code here
    HashMap<Integer, Integer> map = new HashMap<>() ;
    for(int i = 0; i < arr.length; i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1) ;
    }
    int count = 0 ;

    for(int val : map.keySet()){
      int freq = map.get(val) ;
      if(freq >= 2){
        int pairs = getSum(freq) ;
        count += pairs ;
        // count += (freq * (freq - 1) / 2) ;
      }
    }

    return count ;
  }

  public static int getSum(int freq){
    int n = freq - 1 ;
    int sum = 0 ;
    for(int i = 1; i <= n; i++){
      sum += i ;
    }
    return sum ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countPairs(arr));
  }
}

