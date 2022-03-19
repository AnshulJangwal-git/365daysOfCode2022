// Link - https://nados.io/question/next-greater-element-to-the-left
import java.io.*;
import java.util.*;

public class $08nextGreaterElementLeft {
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

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
    Stack<Integer> st = new Stack<>() ;
    int[] ngl = new int[arr.length] ;
    
    st.push(arr[0]) ;
    ngl[0] = -1 ;
    
    for(int i = 1; i < arr.length; i++){
        while(st.size() > 0 && arr[i] >= st.peek()){
            st.pop() ;
        }
        
        if(st.size() != 0){
            ngl[i] = st.peek() ;
            
        }else{
            ngl[i] = -1 ;
            
        }
        st.push(arr[i]) ;
    }
    return ngl ;
  }

}





















