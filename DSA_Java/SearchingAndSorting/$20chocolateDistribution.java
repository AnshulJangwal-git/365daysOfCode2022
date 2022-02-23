//Link - https://nados.io/question/chocolate-distribution
import java.util.*;
// import java.io.*;

public class $20chocolateDistribution {

  public static int find(int[]arr, int n, int m) {
    int ans = Integer.MAX_VALUE ;
    Arrays.sort(arr) ;

    for(int i = 0; i < n - m; i++){
      int minW = arr[i] ;
      int maxW = arr[i + m - 1] ;

      int gap = maxW - minW ;
      if(gap < ans){
        ans = gap ;
      }
    }
    return ans ;
  }

  public static void main(String[]args) {
    Scanner scn = new Scanner(System.in);
    //input work
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int m = scn.nextInt();
    int ans = find(arr, n, m);

    System.out.println(ans);
  }
}