//Link - https://nados.io/question/count-possible-triangles
import java.util.*;
// import java.io.*;

public class $25countPossibleTriangles {

  public static int countTriangles(int[]arr) {
    Arrays.sort(arr) ;
    int count = 0 ;

    for(int i = arr.length - 1; i >= 0; i--){
      int l = 0 ;
      int r = i - 1 ;

      while(l < r){
        if(arr[l] + arr[r] > arr[i]){
          count += (r - l) ;
          r -- ;

        }else{
          l ++ ;

        }
      }
    }
    return count ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countTriangles(arr));
  }
}
