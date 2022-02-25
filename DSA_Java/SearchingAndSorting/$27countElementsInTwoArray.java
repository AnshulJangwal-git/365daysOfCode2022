import java.util.*;
// import java.io.*;

public class $27countElementsInTwoArray {

  public static int[] find(int[]arr1, int[]arr2) {
    Arrays.sort(arr2) ;
    int[] ans = new int[arr1.length] ;

    for(int i = 0; i < arr1.length; i++){
      int key = arr1[i] ;
      int count = helper(key, arr2) ;
      ans[i] = count ;
    }
    return ans ;
  }

  public static int helper(int key, int[] arr){
    int count = 0 ;
    int lo = 0 ;
    int hi = arr.length - 1 ;

    while(lo <= hi){
      int mid = (lo + hi) / 2 ;
      if(arr[mid] <= key){
        count += (mid - lo + 1) ;
        lo = mid + 1 ;

      }else{
        hi = mid - 1 ;

      }
    }
    return count ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[]a = new int[n1];

    for (int i = 0; i < n1; i++) {
      a[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[]b = new int[n2];

    for (int i = 0; i < n2; i++) {
      b[i] = scn.nextInt();
    }

    int[]ans = find(a, b);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}