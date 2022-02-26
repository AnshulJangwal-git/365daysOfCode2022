//Link - https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1/
import java.util.*;
// import java.io.*;

public class $31findTransitionPoint {

  public static int findTransition(int[]arr) {
    //write your code here
    int idx = -1 ;
    int lo = 0 ;
    int hi = arr.length - 1 ;

    while(lo <= hi){
      int mid = (lo + hi) / 2 ;
      if(arr[mid] == 1){
        idx = mid ;
        hi = mid - 1 ;

      }else{
        lo = mid + 1 ;

      }
    }
    return idx ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(findTransition(arr));
  }
}