//Link - https://nados.io/question/next-greater-element-to-the-right
// import java.io.*;
import java.util.*;

public class $03nextGreaterElementToTheRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }
  
  public static int[] solve(int[] arr){
   // solve
   int n = arr.length ;
   Stack<Integer> st = new Stack<>() ;
   int[] nge = new int[arr.length] ;
   nge[n - 1] = -1 ;
   st.push(arr[n - 1]) ;
   
   for(int i = arr.length - 2; i >= 0; i--){
       while(st.size() > 0 && arr[i] >= st.peek()){
           st.pop() ;
       }
       
       if(st.size() == 0){
           nge[i] = -1 ;
           
       }else{
           nge[i] = st.peek() ;
       }
       st.push(arr[i]) ;
   }
   
   return nge ;
 }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

}


//Alternative Solution

// import java.io.*;
// import java.util.*;

// public class Main{
//   public static void display(int[] a){
//     StringBuilder sb = new StringBuilder();

//     for(int val: a){
//       sb.append(val + "\n");
//     }
//     System.out.println(sb);
//   }

// public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     int[] a = new int[n];
//     for(int i = 0; i < n; i++){
//        a[i] = Integer.parseInt(br.readLine());
//     }

//     int[] nge = solve(a);
//     display(nge);
//  }

//  public static int[] solve(int[] arr){
//    // solve
//    int[] nge = new int[arr.length] ;
//    Stack<Integer> st = new Stack<>() ;
//    st.push(0) ;
   
//    for(int i = 1; i < arr.length; i++){
//        while(st.size() > 0 && arr[i] > arr[st.peek()]){
//            int pos = st.peek() ;
//            nge[pos] = arr[i] ;
//            st.pop() ;
//        }
//        st.push(i) ;
//    }
//    while(st.size() > 0){
//        int pos = st.pop() ;
//        nge[pos] = -1 ;
//    }
   
//    return nge ;
//  }

// }