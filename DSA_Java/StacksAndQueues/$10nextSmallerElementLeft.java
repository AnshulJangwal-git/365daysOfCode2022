// Link - https://nados.io/question/next-smaller-element-to-the-left

import java.io.*;
import java.util.*;

public class $10nextSmallerElementLeft {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
  }

  public static int[] solve(int[] arr) {
    int[] nse = new int[arr.length] ;
    Stack<Integer> st = new Stack<>() ;

    for(int i = 0; i < arr.length; i++){
      while(st.size() > 0 && st.peek() >= arr[i]){
        st.pop() ;
      }

      if(st.size() > 0){
        nse[i] = st.peek() ;

      }else{
        nse[i] = -1 ;
      }
      st.push(arr[i]) ;
    }
    return nse ;
  }
}

















