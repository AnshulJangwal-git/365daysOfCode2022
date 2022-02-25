//Link - https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1#
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

  public static int[] find2(int[]arr1, int[]arr2) { //Using HashMap..
    HashMap<Integer, Integer> map = new HashMap<>() ;
    for(int val : arr2){
      map.put(val, map.getOrDefault(val, 0) + 1) ;
    }
    int count = 0 ;

    for(int i = 0; i < arr1.length; i++){
      int key = arr1[i] ;
      for(int val : map.keySet()){
        if(val <= key){
          count += map.get(val) ;
        }
      }
      arr1[i] = count ;
      count = 0 ;
    }
    return arr1 ;
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

//Using freq Array and prefix sum array...
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       int max = 0 ;
    for(int val : arr1){
      max = Math.max(max, val) ;
    }

    for(int val : arr2){
      max = Math.max(max, val) ;
    }


    int[] farr = new int[100000] ;
    for(int i = 0; i < arr2.length; i++){
      farr[arr2[i]] ++ ;
    }

    int[] psa = new int[100000] ;
    psa[0] = farr[0] ;

    for(int i = 1; i < psa.length; i ++){
      psa[i] = psa[i - 1] + farr[i] ;
    }

//   int[] ans = new int[arr1.length] ;
   ArrayList<Integer> ans = new ArrayList<>() ;
   for(int i = 0; i < arr1.length; i++){
     int key = arr1[i] ;
    //  ans[i] = psa[key] ;
    ans.add(psa[key]) ;
   }
  return ans ;
    }
}


